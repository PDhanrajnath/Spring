<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

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
<hr>
<!-- display user id and role-->
    <p>
        User:  <security:authentication property="principal.username" />
        <br>
        <br>
        Role(s):  <security:authentication property="principal.authorities" />
    </p>


<hr>
<br>
    <!-- Add a logout button -->
    <form:form action="${pageContext.request.contextPath}/logout"
               method="POST">

          <input data-toggle="tooltip" title="Logout here!" type="submit" value="Logout" />

    </form:form>


</body>

</html>