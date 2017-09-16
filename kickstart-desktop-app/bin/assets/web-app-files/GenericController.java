package controller;

import application.resource.$resource-name;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import platform.resource.BaseResource;
import platform.webservice.BaseService;
import service.$Resource-nameService;

@Controller
@RequestMapping("/api/$resource-name")
public class $Resource-nameController extends BaseController {

    public $Resource-nameController() {
        super(new $resource-name(), new $Resource-nameService());
    }
}
