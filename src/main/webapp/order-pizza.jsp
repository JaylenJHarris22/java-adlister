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
  <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Pizza Igloo"/>
  </jsp:include>
</head>
<body>
    <jsp:include page="./partials/navbar.jsp"/>
    <h1>Pizza Form</h1>
    <form action="pizza-order" method="post">
        <label for="crust">Crust Type</label><br>
        <select name="crust" id="crust">
            <option>Thin</option>
            <option selected>Pan</option>
            <option>Thick</option>
            <option>Stuffed</option>
        </select><br>
        <label for="sauce">Sauce Type</label><br>
        <select name="sauce" id="sauce">
            <option>Light Sauce</option>
            <option selected>Normal Sauce</option>
            <option>Heavy Sauce</option>
            <option>No Sauce</option>
        </select><br>
        <label for="size">Size Type</label><br>
        <select name="size" id="size">
            <option>Personal</option>
            <option>Small</option>
            <option selected>Medium</option>
            <option>Large</option>
        </select><br>
        <label>Toppings</label><br>
        <input type="checkbox" name="toppings" aria-labelledby="toppings">Cheese<br>
        <input type="checkbox" name="toppings" aria-labelledby="toppings">Peperoni<br>
        <input type="checkbox" name="toppings" aria-labelledby="toppings">Sausage<br>
        <input type="checkbox" name="toppings" aria-labelledby="toppings">Veggie<br>
        <label for="address">Delivery Address</label><br>
        <input type="text" id="address"><br>
        <button>Submit</button>
    </form>
</body>
</html>
