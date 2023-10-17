package com.example.webtask3;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleHttpServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Отримання і виведення параметрів
        out.println("getContextPath(): " + request.getContextPath());
        out.println("getServletPath(): " + request.getServletPath());
        out.println("getPathInfo(): " + request.getPathInfo());
        out.println("getQueryString(): " + request.getQueryString());

        // Отримання параметрів з запиту
        out.println("getParameter(\"param1\"): " + request.getParameter("param1"));
        out.println("getParameter(\"param2\"): " + request.getParameter("param2"));

        // Отримання заголовка User-Agent
        out.println("getHeader(\"User-Agent\"): " + request.getHeader("User-Agent"));

        // Робота з сесією
        HttpSession session = request.getSession(true);
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 1;
        } else {
            counter++;
        }
        session.setAttribute("counter", counter);

        out.println("Session Counter: " + counter);
    }
}
