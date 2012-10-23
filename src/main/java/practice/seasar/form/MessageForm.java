package practice.seasar.form;

import java.io.Serializable;

import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class MessageForm implements Serializable {

	private static final long serialVersionUID = 1L;

	@Required
	@Maxlength(maxlength = 50)
	public String author;

	@EmailType
	@Maxlength(maxlength = 100)
	public String mail;

	@Required
	@Maxlength(maxlength = 100)
	public String title;

	@Required
	@Maxlength(maxlength = 1000)
	public String body;

}
