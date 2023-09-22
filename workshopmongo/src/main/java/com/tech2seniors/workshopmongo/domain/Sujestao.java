package com.tech2seniors.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sujestao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	private Date date;
	private String body;
	private User user;
	
	public Sujestao () {
		
	}

	public Sujestao(String id, Date date, String body, User author) {
		super();
		this.id = id;
		this.date = date;
		this.body = body;
		this.user = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sujestao other = (Sujestao) obj;
		return Objects.equals(id, other.id);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
