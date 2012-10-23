package practice.seasar.service;

import static org.seasar.extension.jdbc.operation.Operations.desc;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.service.S2AbstractService;

import practice.seasar.entity.Message;

public class MessageService extends S2AbstractService<Message> {

	@Resource
	protected JdbcManager jdbcManager;

	public int post(Message message) {
		return jdbcManager.insert(message).execute();
	}
	
	public List<Message> getList(int limit, int offset) {
		return jdbcManager.from(Message.class).orderBy(desc("NUMBER")).limit(limit).offset(offset).getResultList();
	}
}
