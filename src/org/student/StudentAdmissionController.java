package org.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm(){

		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}

	/**
	 * Submits data from the form.
	 * @param studentName
	 * @param studentHobby
	 * @return
	 */
	@RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1){

		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("headerMessage", "College of Engineering");

		return modelAndView;
	}
}
