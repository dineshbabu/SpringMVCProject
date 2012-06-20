package net.spring.view.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("checkBoxesBean")
public class CheckBoxesBean {
	
	private User user;
	
	@Value(value="true")
	private boolean subscribe;
	
	private String[] interests = {"Tennis", "Cricket", "Football"};
	
	private Map<String, String> interestsMap;
			
	@Value(value="magic")	
	private String secretWord;

	public boolean isSubscribe() {
		return subscribe;
	}

	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}

	public String[] getInterests() {
		return interests;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	public String getSecretWord() {
		return secretWord;
	}

	public void setSecretWord(String secretWord) {
		this.secretWord = secretWord;
	}

	public Map<String, String> getInterestsMap() {
		interestsMap = new HashMap<String, String>();
		interestsMap.put("TennisKey", "TennisValue");
		interestsMap.put("ValleyBallKey", "ValleyBallValue");
		interestsMap.put("FootballKey", "FootballValue");
		return interestsMap;
	}

	public void setInterestsMap(Map<String, String> interestsMap) {
		this.interestsMap = interestsMap;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
