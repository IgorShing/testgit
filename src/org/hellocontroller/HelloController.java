package org.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/pages/welcome")
	public ModelAndView helloWorld() {

		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage",
				"Hi, user, welcome to the first spring application");

		return modelAndView;
	}
}