<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ID Entry Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            flex-direction:column;
        }

        .container {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }

        h2 {
            color: #333333;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            color: #555555;
        }

        input[type="text"] {
            width: calc(100% - 20px);
            padding: 10px;
            border: 1px solid #cccccc;
            border-radius: 4px;
            box-sizing: border-box;
            margin-bottom: 20px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #ffffff;
            border: none;
            padding: 10px;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .container1 {
            margin: 30px 0;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
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
</head>
<body>

    <div class="container">
        <h2>Delete Order By Id</h2>
        <form action="delete" >
            <label for="id">ID:</label>
            <input type="text" id="id" name="id" required>
            <input type="submit" value="Submit">
        </form>
    </div>
    <div class="container1">
<table>
<tr>
<th >Order Id</th>
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
