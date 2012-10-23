package practice.seasar.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	public Integer number;
	public String author;
	public String mail;
	public String title;
	public String body;
	public Timestamp modified;
	public Timestamp posted;

}
