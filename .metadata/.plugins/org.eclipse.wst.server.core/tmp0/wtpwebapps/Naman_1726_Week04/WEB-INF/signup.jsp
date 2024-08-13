<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Registration</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<style>
body {
    font-family: Arial, sans-serif;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
    background-color: #f5f5f5;
}

.form-container {
    background: #fff;
    padding: 2rem;
    border-radius: 8px;
    box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
    width: 350px;
    max-width: 100%;
}

h2 {
    margin-bottom: 1rem;
    font-size: 1.6rem;
    text-align: center;
}

.form-group {
    margin-bottom: 1.2rem;
}

.form-group label {
    display: block;
    margin-bottom: 0.5rem;
    font-weight: bold;
}

.form-group input {
    width: 100%;
    padding: 0.8rem;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

.form-group input:focus {
    border-color: #007bff;
    outline: none;
}

.btn-submit {
    width: 100%;
    padding: 0.8rem;
    border: none;
    border-radius: 4px;
    background-color: #007bff;
    color: #fff;
    font-size: 1rem;
    cursor: pointer;
    transition: background-color 0.3s;
    margin-bottom:0.5rem;
}

.btn-submit:hover {
    background-color: #0056b3;
}
.hrf_c{
text-decoration:none;
color:black;
padding:0.5rem;
}
.hrf_c:hover{
color:blue;
}
.admin{
background:#007bff;
border-radius:5px;
color:white;
border:1px solid blue;
}
.admin:hover{
color:007bff;
background-color:white;
border:1px solid black;	
}

</style>
    <div class="form-container">
     <a href="loginAdmin" class="hrf_c admin">Login as Admin</a>
        <h2>REGISTER</h2>
        <form action="doLogin" method="post">
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="id">ID</label>
                <input type="text" id="id" name="id" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email"  pattern="^[^\s@]+@[^\s@]+\.[^\s@]+$" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" pattern="(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}"  id="password" name="password" required>
            </div>
            <button type="submit" class="btn-submit">Register</button>
            <a href="goToLogin" class="hrf_c">Already a Customer? Login</a>
           
        </form>
    </div>
</body>
</html>
