<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="
https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>
<style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }

        .container {
            margin-top: 30px;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: #343a40;
            margin-bottom: 20px;
            text-align: center;
        }

        table {
            width: 100%;
            margin-bottom: 1rem;
            color: #212529;
        }

        th, td {
            padding: 12px;
            text-align: left;
            vertical-align: top;
        }

        th {
            background-color: #e9ecef;
            color: #495057;
        }

        tbody tr:nth-of-type(even) {
            background-color: #f2f2f2;
        }

        tbody tr:hover {
            background-color: #e9ecef;
        }

        .table-wrapper {
            margin-top: 20px;
        }
    </style>
    <div class="container">
  <h2>Orders</h2> 
<table>
<tr>
<th >Name</th>
<th >Order Date</th>
<th>Total Amount</th>
<th >Customer Id</th>
</tr>
<c:forEach var="order" items="${olist}">
<tr>
<td>${order.orderId}</td>
<td>${order.orderDate}</td>
<td>${order.totalAmount}</td>
<td>${order.customerId}</td>
</tr>

</c:forEach>
</table>
</div>
</body>
</html>