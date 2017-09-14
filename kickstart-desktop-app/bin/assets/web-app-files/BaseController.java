package controller;

import org.springframework.web.bind.annotation.*;
import platform.helper.SessionHelper;
import platform.resource.BaseResource;
import platform.resource.result;
import platform.resource.session;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Json;
import platform.util.Util;
import platform.util.security.SecurityUtil;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    BaseService service;
    BaseResource resource;
    public BaseController(BaseResource resource, BaseService service) {
        this.service = service;
        this.resource = resource;
    }

    protected boolean isLoginRequired() {
        return true;
    }
    ServletContext validSession(String sessionId) throws ApplicationException {
        if(!isLoginRequired())
            return null;
        if (!isLoginRequired() && Util.isEmpty(sessionId)) {
            session _session = (session) new session();
            ServletContext ctx = new ServletContext(_session);
            return ctx;
        }
        session _session = (session) SessionHelper.getInstance().getById(sessionId);
        if (_session == null)
            throw new ApplicationException(ExceptionSeverity.ERROR,"Invalid Session") ;
        ServletContext ctx = new ServletContext(_session);
        return ctx;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    String Get(@CookieValue(value="session_id",required=false) String sessionId,
               @RequestParam(value="queryId", required=true) String queryId,
               @RequestParam(value="session_id", required=false) String session_id,
               @RequestParam(value="args", required=false) String args) {
        result result = new result();
        try {
            if (Util.isEmpty(sessionId)) {
                sessionId = session_id;
            }
            ServletContext ctx = validSession(sessionId);
            Map<String,Object> map = new HashMap();
            if (!Util.isEmpty(args)) {
                String[] argvalues = args.split(",");
                for(String values: argvalues) {
                    String[] valpair = values.split(":");
                    if (valpair.length != 2) {
                        throw new ApplicationException(ExceptionSeverity.ERROR, "args can  have only values of format name:value");
                    }
                    if(valpair[1] != null && valpair[1].indexOf(";") != -1)
                        map.put(valpair[0], valpair[1].split(";"));
                    else
                        map.put(valpair[0], valpair[1]);
                }
            }
            BaseResource[] resources = service.getQuery(ctx,queryId,map);
            result.setErrCode(0);
            result.setMessage("Success");
            result.setResource(resources);
        } catch (Exception e) {
            e.printStackTrace();
            result.setErrCode(-1);
            result.setMessage(e.getMessage());

        }
        String responseStr = Json.resulttoString(result);
        return responseStr;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    String post(@CookieValue(value="session_id",required=false) String sessionId,
               @RequestParam(value="resource", required=true) String _resourceString,
                @RequestParam(value="action", required=false) String action) {
        result result = new result();
        try {
            ServletContext ctx = validSession(sessionId);
            String decodeString = SecurityUtil.decodeBase64(_resourceString);
            BaseResource _resource = Json.stringToResource(URLDecoder.decode(decodeString),resource.getClass());
            if (action == null) {
                action = "add";
            }
            if ("add".equalsIgnoreCase(action)) {
                service.add(ctx, _resource);
            } else {
                service.action(ctx,_resource,action);
            }
            result.setErrCode(0);
            result.setMessage("Success");
            result.setResource(_resource);
        } catch (Exception e) {
            e.printStackTrace();
            result.setErrCode(-1);
            result.setMessage(e.getMessage());
        }
        String responseStr = Json.resulttoString(result);
        return responseStr;
    }

}
