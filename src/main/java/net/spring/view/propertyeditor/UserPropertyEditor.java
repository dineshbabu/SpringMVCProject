package net.spring.view.propertyeditor;

import java.beans.PropertyEditorSupport;

import net.spring.view.controller.User;

public class UserPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String textValue){
		User user = new User();
		user.setFirstName(textValue.split("-")[0]);
		user.setLastName(textValue.split("-")[1]);
		setValue(user);
	}
	
	/*@Override
	public String getAsText(){
		User user = (User)getValue();
		return user.getFirstName()+"-"+user.getLastName();
	}*/
}
