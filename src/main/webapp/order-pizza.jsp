<%--
  Created by IntelliJ IDEA.
  User: jaylenharris
  Date: 5/17/23
  Time: 9:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <jsp:include page="./partials/head.jsp">
    <jsp:param name="title" value="Pizza Igloo"/>
  </jsp:include>
</head>
<body>
    <jsp:include page="./partials/navbar.jsp"/>
    <form action="order" method="post"></form>
</body>
</html>
