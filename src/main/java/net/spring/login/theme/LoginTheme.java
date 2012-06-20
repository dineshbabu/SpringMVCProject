package net.spring.login.theme;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.ui.context.Theme;

public class LoginTheme implements Theme {

	public String getName() {
		return "loginThemeName";
	}

	public MessageSource getMessageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("net/spring/login/theme/loginThemeSource");
		return messageSource;
	}

}
