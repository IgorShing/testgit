package org.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String studentName,
			@RequestParam("studentHobby") String studentHobby){

		Student student1 = new Student();
		student1.setStudentHobby(studentHobby);
		student1.setStudentName(studentName);

		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("headerMessage", "College of Engineering");
		modelAndView.addObject("student1", student1);
		return modelAndView;
	}
}
