<%--
  Created by IntelliJ IDEA.
  User: jaylenharris
  Date: 5/4/23
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="login.jsp" method="post">
        <label for="username">Username</label>
        <input type="text" name="username" id="username">
        <label for="password">Username</label>
        <input type="password" name="password" id="password">
        <button type="submit">Login</button>
    </form>

    <%request.setAttribute("username", request.getParameter("username"));%>
    <%request.setAttribute("password", request.getParameter("password"));%>
    <%request.setAttribute("admin", "admin");%>
    <%request.setAttribute("password", "password");%>


    <c:if test="${username == admin && password == password}">
        <%response.sendRedirect("/profile.jsp");%>
    </c:if>


        </body>
</html>
