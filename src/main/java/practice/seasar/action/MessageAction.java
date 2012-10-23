package practice.seasar.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import practice.seasar.entity.Message;
import practice.seasar.form.MessageForm;
import practice.seasar.service.MessageService;

public class MessageAction {

	public List<Message> messageList;

	@ActionForm
	@Resource
	protected MessageForm messageForm;

	@Resource
	protected MessageService messageService;

	@Execute(validator = false)
	public String index() {
		messageList = messageService.getList(30, 0);
		return "index.html";
	}

	@Execute(input = "/message")
	public String post() {
		Message message = Beans.createAndCopy(Message.class, messageForm).execute();
		messageService.post(message);
		messageList = messageService.getList(30, 0);
		return "/message?redirect=true";
	}
}
