package com.studia.TPO5.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

//servlet z internetu
//chyba brakuje servlet-api w build path
//jak polaczyc to z tym co juz jest
@WebServlet(name = "CarServlet", urlPatterns = "/calculateServlet")
public class CarServlet extends HttpServlet {
    private String message;
    public void init() throws ServletException{
        System.out.println("print");
        message="Car servlet start";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>"+message+"</h1>");
    }
    public void destroy(){

    }
}
