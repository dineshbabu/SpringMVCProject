package net.spring.login.theme;

import org.springframework.ui.context.Theme;
import org.springframework.ui.context.ThemeSource;

public class ThemeSourceImpl implements ThemeSource{

	public Theme getTheme(String themeName) {
		if(themeName.equals("loginThemeName")){
			return new LoginTheme();
		}else if(themeName.equals("differentThemeName")){
			return new DifferentTheme();
		}
		return null;
	}
}
