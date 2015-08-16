package org.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage",
				"Hi, user, welcome to the first spring application");

		return modelAndView;
	}
}