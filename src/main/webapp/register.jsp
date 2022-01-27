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
    <form action="" method="post" name="register_form">
        <input type="text" name="reg_form" id="reg_name" placeholder="your name">
        <input type="text" name="reg_form" id="reg_surname" placeholder="your surname">
        <input type="email" name="reg_form" id="reg_email" placeholder="your email">
        <input type="password" name="reg_form" id="reg_password" placeholder="your password">
        <input type="date" name="reg_form" id="reg_birthday">
        <button type="submit" name="reg_form">Register</button>
    </form>
</body>
</html>
