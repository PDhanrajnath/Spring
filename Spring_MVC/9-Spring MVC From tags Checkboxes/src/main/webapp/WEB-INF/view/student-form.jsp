<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
	
		Country:
		
		<form:select path="country">
		
			<form:options items="${student.countryOptions}" />
			
		</form:select>
				
		<br><br>
		Fav Language:<br>
	    C <form:radiobutton path="favLang" value="C"/><br>
	    C++ <form:radiobutton path="favLang" value="C++"/><br>
	    Java <form:radiobutton path="favLang" value="Java"/><br>
	    Python <form:radiobutton path="favLang" value="Python"/><br>
	    Julia <form:radiobutton path="favLang" value="Julia"/><br>

	    <br><br>
        Operating Systems: <br>
        Linux <form:checkbox path="operatingSystems" value="Linux" /><br>
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS" /><br>
        Windows <form:checkbox path="operatingSystems" value="Windows" /><br>

	    <br><br>
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>












