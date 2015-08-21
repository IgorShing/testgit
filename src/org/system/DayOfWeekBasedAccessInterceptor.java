package org.system;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		Calendar calendar = Calendar.getInstance();

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		if (dayOfWeek == 1){ // 1 means Sunday, 2 - Monday, ... 7 - Saturday
			response.getWriter().write("The website is closed on this day (" + dayOfWeek + "). Please, visit it on any other day!");
			return false;
		}

		return true;
	}

}
