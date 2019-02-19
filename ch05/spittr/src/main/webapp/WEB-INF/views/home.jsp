<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%--
  Created by IntelliJ IDEA.
  User: h3c
  Date: 2019/2/19
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
</head>
<body>
<h1>Welcome to Spittr</h1>

<a href="<c:url value="/spittles" />" >Spittles</a> |
<a href="<c:url value="/spitter/register" />" >Register</a>
</body>
</html>
