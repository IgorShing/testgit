<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student's submission form</title>
</head>

<body>
	<h1>Student Admission Form For Engineering Courses</h1>
	
	<h1>${headerMessage}</h1>

	<form action="/TestSpringProject/pages/submitAdmissionForm.html" method="post">
		<p>
			Student's Name: <input type="text" name="studentName" /> 
		</p>
		
		<p>
			Student's Hobby: <input type="text" name="studentHobby" />
		</p>
			<input type="submit" value="Submit this form by clicking here" />
	</form> 
</body>
</html>