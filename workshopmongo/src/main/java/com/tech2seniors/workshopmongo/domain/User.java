package com.tech2seniors.workshopmongo.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="user")
public class User implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String caixaSujestao;
	
	@DBRef(lazy = true)
	private List<Sujestao> sujestao = new ArrayList<>();
	
	public User() {
		
	}

	public User(String id, String caixaSujestao) {
		super();
		this.id = id;
		this.caixaSujestao = caixaSujestao;
	}


	public List<Sujestao> getSujestao() {
		return sujestao;
	}


	public void setSujestao(List<Sujestao> sujestao) {
		this.sujestao = sujestao;
	}



	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}




	public String getCaixaSujestao() {
		return caixaSujestao;
	}





	public void setCaixaSujestao(String caixaSujestao) {
		this.caixaSujestao = caixaSujestao;
	}


	
	
	
	



	public User(String id) {
		super();
		this.id = id;
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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
}
