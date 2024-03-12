<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }

    form {
        width: 50%;
        margin: 50px auto;
        padding: 20px;
        background-color: #fff;
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

    input[type="submit"] {
        padding: 10px 20px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }
    h1
    {
      /* align-items: center; */
      text-align: center;
      margin-top: 20px;
      padding-top: 10px;
    
    }
</style>
</head>
<body>
<h1 >Update Page</h1>
<form action="update">
    <input type="text" name="id" value="${id}" readonly="readonly"><br><br>
    Enter First Name: <input type="text" name="fname" value="${fname}" required="required" placeholder="Fname"><br><br>
    Enter Last Name: <input type="text" name="lname" value="${lname}" required="required" placeholder="Lname"><br><br>
    Enter Address: <input type="text" name="address" value="${address}" required="required" placeholder="Address"><br><br>
    Enter Email: <input type="text" name="email" value="${email}" required="required" placeholder="Email"><br><br>
    <input type="submit" value="Update">
</form>
</body>
</html>
