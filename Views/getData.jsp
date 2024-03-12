<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data Success Page</title>
<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
}

.container {
    width: 80%;
    margin: 50px auto;
    padding: 20px;
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

table {
    width: 100%;
    border-collapse: collapse;
}

table, th, td {
    border: 1px solid #ddd;
    padding: 10px; /* Increase padding for better readability */
}

th {
    background-color: #f2f2f2;
}

td a {
    text-decoration: none;
    padding: 8px 16px;
    background-color: #007bff;
    color: #fff;
    border-radius: 4px;
    transition: background-color 0.3s ease;
}

td a:hover {
    background-color: #0056b3;
}

button {
    padding: 12px 24px;
    background-color: #28a745;
    color: #fff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

button:hover {
    background-color: #218838;
}

.button-row {
    display: flex;
    justify-content: space-between;
    margin-top: 20px;
}

.button-row input[type="submit"] {
    padding: 12px 24px;
    background-color: #dc3545;
    color: #fff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

.button-row input[type="submit"]:hover {
    background-color: #c82333;
}
</style>
</head>
<body>
<div class="container">
    <h1>Student Data</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Address</th>
                <th>Email</th>
                <th>Actions</th> 
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="student">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.fname}</td>
                    <td>${student.lname}</td>
                    <td>${student.address}</td>
                    <td>${student.email}</td>
                    <td>
                        <a href="deletestudent?id=<c:out value='${student.id}' />">Delete</a>
                        <a href="updatestudent?id=<c:out value='${student.id}' />">Update</a>
                    </td>
               </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
   <div class="button-row">
        <a href="success"><button>Back</button></a>
        <a href="Oprations"><button>Home Page</button></a>
        <form action="deleteall">
            <input type="submit" value="Delete All">
        </form> 
    </div>
</div>
</body>
</html>
