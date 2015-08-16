package org.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")
public class HelloController {

	// Paste in a browser:
	// http://localhost:9080/TestSpringProject/pages/welcome/Belarus/Igor

	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(
			@PathVariable("countryName") String countryName,
	        @PathVariable("userName") String userName) {

		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage",
				"Hi, user, welcome to the first spring application"
		                + countryName + " " + userName);

		return modelAndView;
	}

	@RequestMapping("/hi")
	public ModelAndView hiWorld() {

		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView
		        .addObject("welcomeMessage",
		                "Hi, user, welcome to the first spring application. Method HI.");

		return modelAndView;
	}
}