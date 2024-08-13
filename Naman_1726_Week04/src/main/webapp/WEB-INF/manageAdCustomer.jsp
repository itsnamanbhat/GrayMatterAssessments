<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Orders</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f2f5;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .container {
            text-align: center;
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 80%;
            max-width: 600px;
        }

        h1 {
            color: #343a40;
            margin-bottom: 20px;
        }

        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        label {
            margin-bottom: 8px;
            font-weight: bold;
            color: #555555;
            align-self: flex-start;
        }

        input[type="text"],
        input[type="number"] {
            padding: 10px;
            border: 1px solid #cccccc;
            border-radius: 4px;
            margin-bottom: 15px;
            font-size: 16px;
            width: 100%;
            max-width: 300px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #ffffff;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            width: 100%;
            max-width: 300px;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        input[type="submit"]:active {
            background-color: #003d7a;
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
        <h1>Manage Customers</h1>
        <c:choose>
            <c:when test="${type == 'add'}">
                <form action="addThisC">
                    <label for="customerId">Customer ID:</label>
                    <input type="text" id="customerId" name="customerId" required>
                    
                    <label for="custEmail">Customer Email:</label>
                    <input type="text" id="custEmail" name="custEmail" required>
                    
                    <label for="customerName">Customer Name:</label>
                    <input type="text" id="customerName" name="customerName" required>
                    
                     <label for="password">Password:</label>
                	<input type="text" id="password"  name="password" required>
                	
                    <input type="submit" value="Add Customer">
                </form>
            </c:when>
            
            <c:when test="${type == 'delete'}">
                <form action="deleteThisC" >
                    <label for="customerId">Customer ID:</label>
                    <input type="text" id="customerId" name="customerId" required>
                    
                    <input type="submit" value="Delete Customer">
                </form>
                  <table>
					<tr>
						<th >Customer ID</th>
						<th >Customer Name</th>
						<th>Customer Email</th>
					</tr>
			<c:forEach var="cust" items="${c}">
					<tr>
						<td>${cust.getCId()}</td>
						<td>${cust.getCName()}</td>
						<td>${cust.getCEmail()}</td>
					</tr>

</c:forEach>
</table>

            </c:when>
            <c:when test="${type == 'update'}">
                <form action="updateThisC" >
                    <label for="customerId">Customer ID:</label>
                    <input type="text" id="customerId" name="customerId" required>
                                       
                    <label for="custEmail">Customer Email:</label>
                    <input type="text" id="custEmail" name="custEmail" required>
                    
                     <label for="customerName">Customer Name:</label>
                    <input type="text" id="customerId" name="customerId" required>
                    
                    <input type="submit" value="Update Customer">
                </form>
            </c:when>
            <c:when test="${type == 'get'}">
            <form action="getThisC">
                    
                    <label for="customerId">Customer ID:</label>
                    <input type="text" id="customerId" name="customerId" required>
                    
                    <input type="submit" value="Get Customer">
                </form>
                
               
            </c:when>
             <c:when test="${type == 'getAll'}">
                 <table>
					<tr>
						<th >CustomerId</th>
						<th >Customer Name</th>
						<th >Customer Email</th>
					</tr>
			<c:forEach var="c" items="${customers}">
					<tr>
						<td>${c.getCId()}</td>
						<td>${c.getCName()}</td>
						<td>${c.getCEmail()}</td>
					</tr>


</c:forEach>
</table>
               
            </c:when>
            <c:otherwise>
                <p>Please select a valid action.</p>
            </c:otherwise>
        </c:choose>
    </div>
</body>
</html>
    