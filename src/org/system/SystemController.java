package org.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SystemController {

	@RequestMapping("/")
	public ModelAndView showIndexPage() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
}
