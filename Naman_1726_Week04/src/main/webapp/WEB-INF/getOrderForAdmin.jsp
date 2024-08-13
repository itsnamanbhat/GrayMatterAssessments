<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px auto;
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #007bff;
            color: #ffffff;
            font-weight: bold;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #e2e2e2;
        }

        caption {
            font-size: 1.5em;
            margin: 10px 0;
            color: #333;
        }
    </style>
</head>
<body>
    <table>
        <caption>Order Details</caption>
        <thead>
            <tr>
                <th>Order ID</th>
                <th>Order Date</th>
                <th>Total Amount</th>
                <th>Customer ID</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>${order.orderId}</td>
                <td>${order.orderDate}</td>
                <td>${order.totalAmount}</td>
                <td>${order.customerId}</td>
            </tr>
        </tbody>
    </table>
</body>
</html>