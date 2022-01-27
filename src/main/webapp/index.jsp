<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login | My site </title>
</head>
    <body>
        <h1><%= "Sign in to My website" %>
        </h1>
        <br/>
        <form action="" method="post" name="login_form" target="_self">

            <input type="email" name="email" id="email" placeholder="email">
            <input type="password" name="password" id="password" placeholder="password">
            <br/>
            <button type="submit" id="login_button">Sign in</button>
            <button type="button" id="register_button">Register</button>

        </form>
    </body>
</html>