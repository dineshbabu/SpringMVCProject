package net.spring.login.controller;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoginBean {
	
	@NotEmpty
	@NotNull
	@NotBlank
	@Size(min=2,max=5)
	private String userId;
	
	//For the "message" code resolution to work, first unbind the custom validator first in the LoginController.
	// values of the "password.empty" code is fetched from ValidationMessages.properties
	@NotEmpty(message="{password.empty}") 
	@NotNull
	@NotBlank
	private String password;

	@NotEmpty
	@NotNull
	@NotBlank
	private String server;
	
	@NotEmpty
	@NotNull
	@NotBlank
	private String database;
	
	@NotEmpty
	@NotNull
	@NotBlank
	private String connection;
	
	private boolean autoLogin;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public boolean isAutoLogin() {
		return autoLogin;
	}

	public void setAutoLogin(boolean autoLogin) {
		this.autoLogin = autoLogin;
	}	
}