package com.tech2seniors.workshopmongo.dto;

import java.io.Serializable;

import com.tech2seniors.workshopmongo.domain.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String caixaSujestao;
	
	public UserDTO() {
	}
	
	public UserDTO(User obj) {
		
		id = obj.getId();
		caixaSujestao = obj.getCaixaSujestao();
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

	
}
