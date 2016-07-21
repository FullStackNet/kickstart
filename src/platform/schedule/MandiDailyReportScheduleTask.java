package platform.schedule;

import java.util.HashMap;
import java.util.Map;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.Mandi_auctionHelper;
import platform.manager.ApplicationManager;
import platform.message.SendEmail;
import platform.notification.NotificationFactory;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
import platform.resource.mandi_auction;
import platform.resource.schedule;
import platform.util.ApplicationConstants;
import platform.util.Json;
import platform.util.TimeUtil;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.resource.notice;

public class MandiDailyReportScheduleTask extends ScheduleTask {

	public MandiDailyReportScheduleTask() {
		super(ScheduleFactory.MANDI_DAILY_REPORT);
		// TODO Auto-generated constructor stub
	}
	
	void sendEmail(c4t_object _community, String date) {
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject("Daily Report for " + _community.getName() + date);
			resendMail.setTo(_community.getEmail_id());
			resendMail.setType(ApplicationConstants.MAIL_TYPE_SEND_MANDI_DAILY_REPORT);
			Map<String, String> map = new HashMap<String, String>();
			long fromTime = TimeUtil.getTimeFromString(date, "IST");
			long toTime = TimeUtil.getTimeFromString(date, "IST")+24*60*60*1000L;
		
			Expression e1 = new Expression(notice.FIELD_NOTICE_DATE, REL_OP.GTEQ, fromTime);
			Expression e2 = new Expression(notice.FIELD_NOTICE_DATE, REL_OP.LT, toTime);
			Expression e3 = new Expression(notice.FIELD_NOTICE_DATE, REL_OP.EQ, _community.getId());
			Expression e4 = new Expression(e1, LOG_OP.AND, e2);
			Expression e = new Expression(e3, LOG_OP.AND, e4);
			BaseResource[] resources = Mandi_auctionHelper.getInstance().getByExpression(e,new String[]{mandi_auction.FIELD_PARTY,mandi_auction.FIELD_CREATION_TIME+" desc"}); 
			
			StringBuilder builder = new StringBuilder();
			
			for(BaseResource resource : resources) {
				builder.append("<tr>");
				mandi_auction _auction = (mandi_auction)resource;
				builder.append("<td>"+_auction.getParty()+"</td>");
				builder.append("<td>"+_auction.getName()+"</td>");
				
				builder.append("<td>"+_auction.getBagsEx()+"</td>");
				if (_auction.getRate() != null) {
					builder.append("<td>"+_auction.getRate().intValue()+"</td>");
				} else {
					builder.append("<td>-</td>");
				}
				if (_auction.getWeight() != null) {
					builder.append("<td>"+_auction.getWeight().intValue()+"</td>");
				} else {
					builder.append("<td>-</td>");
				}
				if (_auction.getRemark() != null) {
					builder.append("<td>"+_auction.getRemark()+"</td>");
				} else {
					builder.append("<td>-</td>");
				}
				builder.append("</tr>");	
				builder.append("<tr>");
				builder.append("<td colspan=\"6\">");
				builder.append("<td>"+_auction.getWeights()+"</td>");
				builder.append("</td>");
				builder.append("</tr>");	
			}
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_COMMUNITY_ID, _community.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_COMMUNITY_NAME, _community.getName());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DESCRIPTION, builder.toString());
			String params = Json.maptoString(map);
			resendMail.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
					resendMail);
	}
	@Override
	public void process(schedule _schedule) {
		// TODO Auto-generated method stub
			System.out.println("Need to process the mandi daily report task " + _schedule.getId());
			String community_id = _schedule.getReference_id();
			String reference_date = _schedule.getReference_date();
			
			c4t_object _c4t_object = (c4t_object)StudentHelper.getInstance().getById(community_id);
			if (_c4t_object == null) {
				System.out.println("Invalid community Id " + _c4t_object.getId());
				return;
			}
			sendEmail(_c4t_object,reference_date);
	}

}
