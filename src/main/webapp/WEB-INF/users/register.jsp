<%--
  Created by IntelliJ IDEA.
  User: jaylenharris
  Date: 5/25/23
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/register" method="POST">
    <label for="username">Username</label>
    <input type="text" id="username" name="username">
    <label for="email">Email</label>
    <input type="email" id="email" name="email">
    <label for="password">Password</label>
    <input type="password" id="password" name="password">
    <button>Submit</button>
</form>
</body>
</html>
