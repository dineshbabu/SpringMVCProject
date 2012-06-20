package net.spring.login.validator;

import net.spring.login.controller.LoginBean;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class LoginValidator implements Validator {

    /**
    * This Validator validates LoginBean instances
    */
    public boolean supports(Class clazz) {
        return LoginBean.class.equals(clazz);
    }

    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmptyOrWhitespace(e, "userId", "userId.empty","User ID cannnot be empty.Def msg");
        ValidationUtils.rejectIfEmptyOrWhitespace(e, "password", "password.empty","Password cannnot be empty.Def msg");
        ValidationUtils.rejectIfEmptyOrWhitespace(e, "server", "server.empty","Server cannnot be empty.Def msg");
        ValidationUtils.rejectIfEmptyOrWhitespace(e, "database", "database.empty","Database cannnot be empty.Def msg");
        ValidationUtils.rejectIfEmptyOrWhitespace(e, "connection", "connection.empty","Connection cannnot be empty.Def msg");
        
        /*LoginBean p = (LoginBean) obj;
        
        if (p.getUserId() == null || p.getUserId().length() == 0) {
            e.rejectValue("userId", "userId.empty", "User ID cannnot be empty1");
        } 
        
        if (p.getPassword() == null || p.getPassword().length() == 0) {
            e.rejectValue("password", "password.empty", "Password cannnot be empty1");
        } 
        
        if (p.getServer() == null || p.getServer().length() == 0) {
            e.rejectValue("server", "server.empty","Server cannnot be empty1");
        } 
        
        if (p.getDatabase() == null || p.getDatabase().length() == 0) {
            e.rejectValue("database", "database.empty","Database cannnot be empty1");
        } 
        
        if (p.getConnection() == null || p.getConnection().length() == 0) {
            e.rejectValue("connection", "connection.empty","Connection cannnot be empty1");
        }*/
    }
}