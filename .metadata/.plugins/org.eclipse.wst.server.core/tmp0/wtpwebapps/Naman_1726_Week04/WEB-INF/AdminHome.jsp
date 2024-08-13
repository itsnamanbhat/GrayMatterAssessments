<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
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

        .logo {
            font-size: 2.5em;
            color: #007bff;
            margin-bottom: 20px;
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

        .btn {
            display: inline-block;
            margin: 10px;
            padding: 10px 20px;
            font-size: 16px;
            text-decoration: none;
            color: #ffffff;
            background-color: #007bff;
            border-radius: 4px;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .btn:hover {
            background-color: #0056b3;
        }

        .btn:active {
            background-color: #003d7a;
        }
    </style>
</head>
<body>
    <div class="logo">Admin</div>
    <div class="container">
        <h1>Welcome to the Admin Dashboard</h1>
        <a href="goToCustomer" class="btn">Customers</a>
        <a href="goToOrder" class="btn">Orders</a>
    </div>
</body>
</html>
