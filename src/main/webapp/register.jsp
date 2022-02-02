<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Qeafie
  Date: 27.01.2022
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Form | My site </title>
</head>
<body>
    <h1>Registration Form</h1>
    <br>
    <form action="${pageContext.request.contextPath}/RegisterServlet" method="post" name="register_form">
        <label for="reg_name"></label><input type="text" name="reg_name" id="reg_name" placeholder="your name">
        <label for="reg_surname"></label><input type="text" name="reg_surname" id="reg_surname" placeholder="your surname">
        <label for="reg_email"></label><input type="email" name="reg_email" id="reg_email" placeholder="your email">
        <label for="reg_password"></label><input type="password" name="reg_password" id="reg_password" placeholder="your password">
        <label for="reg_birthday"></label><input type="date" name="reg_birthday" id="reg_birthday">
        <button type="submit" name="reg_form" onclick="">Register</button>
    </form>
</body>
</html>
