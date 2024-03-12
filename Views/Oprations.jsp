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
        color: #333;
        text-align: center;
    }

    h3 {
        margin-top: 20px;
        text-align: center;
    }

    form, a {
        display: block;
        text-align: center;
        margin-top: 20px;
    }

    input[type="submit"],
    button {
        padding: 10px 20px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover,
    button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <h1>Welcome ${name}</h1>

    <h3>Choose Operation</h3>

    <form action="display">
        <input type="submit" value="Display Data">
    </form>

    <a href="success"><button>Insert Data</button></a>
    
    <a href="index"><button>Login Page</button></a>

    
</body>
</html>
