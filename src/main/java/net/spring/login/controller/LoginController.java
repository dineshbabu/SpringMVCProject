package net.spring.login.controller;

import java.io.IOException;
import java.util.Locale;

import javax.validation.Valid;

import net.spring.login.validator.LoginValidator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String displayLoginPage(Model model, Locale locale){
		LoginBean loginBean = new LoginBean();
		loginBean.setUserId("Enter User Id");
		loginBean.setPassword("Enter password");
		loginBean.setServer("Enter Server");
		loginBean.setDatabase("Enter database");
		loginBean.setConnection("Enter connection");	
		loginBean.setAutoLogin(true);
		model.addAttribute("loginBean", loginBean);
		return "Login";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String authenticate( @ModelAttribute("loginBean") @Valid LoginBean loginBean1, BindingResult result, Model model, Locale locale){
		if (result.hasErrors()) {
			return "Login";
		}
		model.addAttribute("userId", loginBean1.getUserId());
		model.addAttribute("password", loginBean1.getPassword());
		model.addAttribute("server", loginBean1.getServer());
		model.addAttribute("database", loginBean1.getDatabase());
		model.addAttribute("connection", loginBean1.getConnection());		
		return "success";
	}
	
	@RequestMapping("/exception")
	public void throwException() throws IOException{
		throw new IOException();
	}
	
	//Register custom validator for this controller. Otherwise the default validator will get used.
	@InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new LoginValidator());
    }

	@ExceptionHandler({IOException.class,NullPointerException.class})
	public String handleException(Exception e){
		return "error";
	}
}
