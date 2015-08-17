package org.student;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")
public class StudentAdmissionController {

	private Calendar calendar = new GregorianCalendar();

	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm(){

		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}

	/**
	 * Adds the attribute to each request.
	 *
	 * @param model
	 */
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage", "College of Engineering, Belarus");
	}

	/**
	 * Submits data from the form.
	 *
	 * @param studentName
	 * @param studentHobby
	 * @return
	 */
	@RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1){

		calendar.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		Date date = calendar.getTime(); //the midnight, that's the first second of the day.

		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("dateOfAccess", date.toString());

		return modelAndView;
	}
}
