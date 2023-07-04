package mypackage.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tblTopic")
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int topic_id;
	private String topic_name;
	
	@OneToMany(mappedBy = "topic", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("topic")
	private Set<TopicContent> content;
	private int flag=0;


	public Topic(int topic_id, String topic_name, Set<TopicContent> content, int flag) {
		super();
		this.topic_id = topic_id;
		this.topic_name = topic_name;
		this.content = content;
		this.flag = flag;
	}

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	public Set<TopicContent> getContent() {
		return content;
	}

	public void setContent(Set<TopicContent> content) {
		this.content = content;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
}

















