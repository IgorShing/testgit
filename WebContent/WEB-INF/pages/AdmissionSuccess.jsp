<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Congratulations! The Engineering College has processed your application form successfully!</h1>
		<h1>${headerMessage}</h1>
				
		<h2>Details submitted by you:</h2>
		
		<table>
			 <tr>
				 	<td>Student's name</td>
				 	<td>${student1.studentName}</td>
			 </tr>
			 <tr>
					<td>Student's hobby</td>
				 	<td>${student1.studentHobby}</td>
			 </tr>
			 
			 <tr>
					<td>Student's mobile phone</td>
				 	<td>${student1.studentMobile}</td>
			 </tr>
			 
			 <tr>
					<td>Student's date of birth</td>
				 	<td>${student1.studentDateOfBirth}</td>
			 </tr>
			 
			 <tr>
					<td>Student's date of birth</td>
				 	<td>${student1.studentDateOfBirth}</td>
			 </tr>
			 
			 <tr>
					<td>Student's skills</td>
				 	<td>${student1.studentSkills}</td>
			 </tr>
			 
			 <tr>
					<td>Student Address</td>
				 	<td>
					 	Country: ${student1.studentAddress.country},
					 	City: ${student1.studentAddress.city},
					 	Street: ${student1.studentAddress.street},
					 	Pincode: ${student1.studentAddress.pincode}.
				 	</td>
			 </tr>
		</table>
		
		<h3>Date of access: ${dateOfAccess}</h3>
		
</body>
</html>