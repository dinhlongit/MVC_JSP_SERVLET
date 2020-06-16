<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/11/2019
  Time: 8:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title> Example </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="./vendor/bootstrap.js"></script>
    <script type="text/javascript" src="./1.js"></script>
    <link rel="stylesheet" href="./vendor/bootstrap.css">
    <link rel="stylesheet" href="./1.css">
    <style>
    </style>
</head>
<body>
<div class="container">
    <h3 class="btn-danger">Search</h3>

    <form action="./SearchController" method="POST">
        <input type="search" name ="searchtxt" >
        <input type="submit" name="submit" value=" submit" id="submit">
    </form>


</div>
</body>
</html>



