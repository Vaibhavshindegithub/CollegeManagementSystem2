<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }

    h1 {
        text-align: center;
        margin-top: 50px;
    }

    form {
        width: 50%;
        margin: 0 auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border-radius: 4px;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    input[type="submit"], button {
        padding: 10px 20px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover, button:hover {
        background-color: #0056b3;
    }

    button {
        display: block;
        margin-top: 20px;
        margin-left: auto;
        margin-right: auto;
    }
</style>
</head>
<body>
    <h1>Welcome To Success Page ${name}</h1>

    <form action="create">
        Enter First Name: <input type="text" name="fname" required="required" placeholder="Fname"><br><br>
        Enter Last Name: <input type="text" name="lname" required="required" placeholder="Lname"><br><br>
        Enter Address: <input type="text" name="address" required="required" placeholder="Address"><br><br>
        Enter Email: <input type="text" name="email" required="required" placeholder="Email"><br><br>
        <input type="submit" value="Submit">
    </form>

    <a href="Oprations"><button>Home Page</button></a>
</body>
</html>
