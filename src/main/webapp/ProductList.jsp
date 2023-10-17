<%@ page import="com.example.webtask3.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Ваня
  Date: 17.10.2023
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product List</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <h2>Product List</h2>
  <table class="table">
    <thead>
    <tr>
      <th>ID</th>
      <th>Title</th>
      <th>Cost</th>
    </tr>
    </thead>
    <tbody>
    <% for (Product product : (List<Product>) request.getAttribute("productList")) { %>
    <tr>
      <td><%= product.getId() %></td>
      <td><%= product.getTitle() %></td>
      <td><%= product.getCost() %></td>
    </tr>
    <% } %>
    </tbody>
  </table>
</div>
</body>
</html>

