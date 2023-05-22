<%--
  Created by IntelliJ IDEA.
  User: jaylenharris
  Date: 5/22/23
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${ads}" var="ad">
    <div style="display: flex; flex-direction: column; background-color: azure">
        <h3>${ad.title}</h3>
        <p>${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
