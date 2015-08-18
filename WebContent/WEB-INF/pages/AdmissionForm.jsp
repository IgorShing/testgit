<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student's submission form</title>
</head>

<body>

	<!-- For errors messages -->
	<form:errors path="student1.*"/>

	<h1>Student Admission Form For Engineering Courses</h1>
	
	<h1>${headerMessage}</h1>

	<form action="/TestSpringProject/pages/submitAdmissionForm.html" method="post">
	
		<table>
			 <tr> <td>Student's Name: <input type="text" name="studentName" /> </td> </tr>
			 <tr> <td>Student's Hobby: <input type="text" name="studentHobby" /></td> </tr>
			 <tr> <td>Student's Mobile Phone: <input type="text" name="studentMobile" /></td> </tr>
			 <tr> <td>Student's Date of Birth: <input type="text" name="studentDateOfBirth" /></td> </tr>
			 
			 <tr>
				 <td>Student's skill set:</td>
				 <td>
				 	<select name="studentSkills" multiple>
				 		<option value="Java Core">Java Core</option>
				 		<option value="Maven">Maven</option>
				 		<option value="Spring MVC">Spring MVC</option>
				 		<option value="Spring Core">Spring Core</option>
				 	</select>
				 </td>
			 </tr>
		</table>
		
		<!-- For the address -->
		<table>
			 <tr> <td>Student's address </td> </tr>
			 <tr>
				 <td>Country: <input type="text" name="studentAddress.country" /></td>
				 <td>City: <input type="text" name="studentAddress.city" /></td>
				 <td>Street: <input type="text" name="studentAddress.street" /></td>
				 <td>Pincode: <input type="text" name="studentAddress.pincode" /></td>
			 </tr>
		</table>
		
			<input type="submit" value="Submit this form by clicking here" />
	</form> 
</body>
</html>