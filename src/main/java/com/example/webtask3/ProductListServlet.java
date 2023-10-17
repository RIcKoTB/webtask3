package com.example.webtask3;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ProductListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        List<Product> productList = ProductRepository.getAllProducts();

        request.setAttribute("productList", productList);
        request.getRequestDispatcher("ProductList.jsp").forward(request, response);
    }
}

