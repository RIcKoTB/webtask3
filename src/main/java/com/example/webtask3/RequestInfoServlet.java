package com.example.webtask3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RequestInfoServlet  extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Виведення основних функцій HttpServletRequest на сторінку
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Request Information</h2>");
        out.println("<p>Method: " + request.getMethod() + "</p>");
        out.println("<p>URI: " + request.getRequestURI() + "</p>");
        out.println("<p>Protocol: " + request.getProtocol() + "</p>");
        // Додайте більше інформації за потребою
        out.println("</body></html>");
    }
}
