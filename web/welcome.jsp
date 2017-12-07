<%--
  Created by IntelliJ IDEA.
  User: Hashan
  Date: 7/17/2017
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    if (session.getAttribute("user") == null){
        response.sendRedirect("index.jsp");
    }
%>
<h1>Welcome ${user} ...</h1>

<form action="Logout" method="post">
    <input type="submit" value="Logout">
</form>
</body>
</html>
