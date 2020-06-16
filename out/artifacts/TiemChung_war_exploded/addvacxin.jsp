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
    <title> ADD NEW VACXIN </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="./vendor/bootstrap.js"></script>
    <script type="text/javascript" src="./1.js"></script>
    <link rel="stylesheet" href="./vendor/bootstrap.css">
    <link rel="stylesheet" href="./1.css">
    <style>
      b{
          float:left;
          width: 200px;
      }

    </style>
</head>
<body>

<h2>ADD NEW VACXIN</h2>
<form action="./AddVacXinController" method="get">
    <b> Mã Vắc Xin :</b>  <input type="text" name="mavacxin">
    <br>
        <b> Tên Vắc Xin :</b> <input type="text" name="tenvacxin">
    <br>
            <b> Số Mũi :</b>  <input type="number" name="somui">
    <br>
                <b> Mô Tả : </b> <input type="text" name="mota">
    <br>
                    <b>  Giá Vắc Xin : </b> <input type="number" name="giavacxin">
    <br>
                        <b> Tên Hãng :</b>  <input type="text" name="tenhang">
    <br>
    <input type="submit" name="submit" value="ADD NEW">

</form>


</body>
</html>
