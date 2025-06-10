<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- //to directly access the value from backend -->
     <%@page isELIgnored="false"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h1>This is home page</h1>
<h3>Welcome ${name}</h3>

<h5>Email:- ${email } and password:- ${pwd }</h5>
<h5>${data}</h5>

<script type="text/javascript" src="<c:url value="/resources/JS/script.js" />" >

</script>
</body>
</html>