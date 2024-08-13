<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Service Navbar</title>
    <link rel="stylesheet" href="styles.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gupter:wght@400;500;700&display=swap" rel="stylesheet">
</head>
<body>
<style>
    body {
    margin: 0;
    font-family: "Gupter", serif;
  font-weight: 400;
  font-style: normal;
}

.navbar {
    background-color: #333;
    color: white;
    padding: 10px 20px;
}

.container {
    display: flex;
    justify-content: space-between;
    align-items: center;
}

.navbar-heading {
    margin: 0;
}

.navbar-menu {
    list-style: none;
    margin: 0;
    padding: 0;
    display: flex;
}

.navbar-menu li {
    margin-left: 20px;
}

.navbar-menu a {
    text-decoration: none;
    color: white;
    font-weight: bold;
    transition: color 0.3s ease;
}

.navbar-menu a:hover {
    color: #ddd;
}
.main-c{
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 60vh;
}
.main-c h1{
    font-size: 6rem;
}
.main-c p{
    font-size: 4rem;
}
 .card {
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
            padding: 20px;
            text-align: center;
            color: #333333;
        }

        .card-header {
            font-size: 1.5em;
            margin-bottom: 10px;
            color: #007bff;
        }

        .card-body {
            font-size: 1.2em;
        }

        .card-body .label {
            font-weight: bold;
            color: #555555;
        }

        .card-body .value {
            margin-left: 5px;
        }
</style>
    <nav class="navbar">
        <div class="container">
            <h1 class="navbar-heading">CustomerService</h1>
            <ul class="navbar-menu">
                <li><a href="addOrder">Add New Order</a></li>
                <li><a href="deleteOrder">Delete Order</a></li>
                <li><a href="updateOrder">Update Order</a></li>
                <li><a href="getOrder">Get Order</a></li>
            </ul>
        </div>
    </nav>
    <div class="card">
        <div class="card-header">
            Customer Details
        </div>
        <div class="card-body">
            <div>
                <span class="label">Customer ID:</span>
                <span class="value">${id1}</span>
            </div>
            <div>
                <span class="label">Customer Name:</span>
                <span class="value">${name}</span>
            </div>
        </div>
    </div>
    <div class="main-c">
        <h1>Welcome </h1>
        <h3>Tell us what you want to do by selecting from above Navigationbar</h3>
    </div>
</body>
</html>