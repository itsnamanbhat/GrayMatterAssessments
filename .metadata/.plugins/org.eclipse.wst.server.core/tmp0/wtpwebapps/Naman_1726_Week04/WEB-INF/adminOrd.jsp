<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Actions</title>
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
            max-width: 500px;
        }

        h1 {
            color: #343a40;
            margin-bottom: 20px;
        }

        .button {
            display: inline-block;
            margin: 10px;
            padding: 10px 20px;
            font-size: 16px;
            text-decoration: none;
            color: #ffffff;
            background-color: #007bff;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .button:hover {
            background-color: #0056b3;
        }

        .button:active {
            background-color: #003d7a;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Orders</h1>
        <a href="addOrd" class="button">Add Order</a>
        <a href="deleteOrd" class="button">Delete Order</a>
        <a href="updateOrd" class="button">Update Order</a>
        <a href="getOrd" class="button">Get Order</a>
        <a href="getAllOrd" class="button">Get All Orders</a>
    </div>
</body>
</html>
