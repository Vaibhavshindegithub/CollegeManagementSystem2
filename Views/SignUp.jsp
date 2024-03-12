<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign Up Page</title>
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

        input[type="text"],
        input[type="password"],
        input[type="submit"]
         {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border-radius: 4px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
      button
        {
              background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s ease;
            width:60px;
            padding: 10px;
            margin-bottom: 10px;
            border-radius: 4px;
        }
                   a {
        display: block;
        text-align: center;
        margin-top: 20px;
        color: #007bff;
        text-decoration: none;
         
          
    }
    </style>
    <script>
        function validatePassword() {
            var password1 = document.getElementById("password1").value;
            var password2 = document.getElementById("password2").value;

            if (password1 !== password2) {
                alert("Passwords do not match!");
                return false;
            }
 
            return true;
        }
    </script>
</head>
<body>
    <h1>Sign Up Page</h1>
    <form action="signup" onsubmit="return validatePassword()" method="post">
        Enter Name: <input type="text" name="name" placeholder="Enter User Name" required><br><br>
        Enter Password: <input type="password" id="password1" name="password1" placeholder="Enter Password" required><br><br>
        Confirm Password: <input type="password" id="password2" placeholder="Re-Enter Password" required><br><br>
        <input type="submit" value="Create">
    </form>
    <a href="index"><button>Back</button></a>
</body>
</html>
