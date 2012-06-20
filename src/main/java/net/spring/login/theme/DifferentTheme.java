package net.spring.login.theme;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.ui.context.Theme;

public class DifferentTheme implements Theme {

	public String getName() {
		return "differentThemeName";
	}

	public MessageSource getMessageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("net/spring/login/theme/differentThemeSource");
		return messageSource;
	}

}
