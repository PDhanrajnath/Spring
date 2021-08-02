<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>

<head>
	<title>luv2code Company Home Page</title>
</head>

<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
	
	<marquee><h3>Welcome to the luv2code company home page!</h3></marquee>
<br>
<br>
    <!-- Add a logout button -->
    <form:form action="${pageContext.request.contextPath}/logout"
               method="POST">

          <input data-toggle="tooltip" title="Logout here!" type="submit" value="Logout" />

    </form:form>


</body>

</html>