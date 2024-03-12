<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    text-align: center; /* Center align text */
    margin-top: 100px; /* Add margin to vertically center content */
}

h1 {
    color: #333;
}

h2 {
    color: #ff0000; /* Red color for error message */
}

h3 {
    color: #666;
}

button {
    padding: 10px 20px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

button:hover {
    background-color: #0056b3;
}
</style>
</head>
<body>
<h1>Error Page</h1>
<h2>${name} And ${pass} Not Matched</h2>
<h3>Please Try Again</h3>
<a href="index.jsp"><button>Login Page</button></a>
</body>
</html>
