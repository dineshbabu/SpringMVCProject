package net.spring.login.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class WeekEndAccessInterceptor extends HandlerInterceptorAdapter{
	
	@Value(value="0") // CHange the value to 1 to see it working.
	int weekDay;
	
	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception {

		if (weekDay == Calendar.SATURDAY || weekDay == Calendar.SUNDAY ) {
            response.sendRedirect("http://www.serena.com");
            return false;
            
        } else {
        	return true;
        }
    }
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("Post handle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws Exception {
		System.out.println("After completion");
	}
	
}
