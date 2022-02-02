package ru.shonin.javawebtomcat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("reg_name");
        String surname = request.getParameter("reg_name");
        String email = request.getParameter("reg_email");
        String password = request.getParameter("reg_password");
        String birthday = request.getParameter("reg_birthday");

        User user = new User(name,surname,email,password,birthday);
        DataBaseHandler dataBaseHandler = DataBaseHandler.getDataBaseHandler();

        if(dataBaseHandler.isNewUser(user)){
            dataBaseHandler.registerUser(user);
        }
        else{
            PrintWriter pw = response.getWriter();
            pw.println("The user with this email is already registered");
        }
    }
}
