<%@ page import="model.bean.VacXin" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> EDIT VACXIN </title>
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

<%
    VacXin vx = (VacXin) request.getAttribute("VacXin");
%>

<h2>ADD NEW VACXIN</h2>
<form action="./EditVacXinController" method="post">
    <b> Mã Vắc Xin :</b>  <input type="text" name="mavacxin" value="<%=vx.getId()%>" readonly="true">
    <br>
    <b> Tên Vắc Xin :</b> <input type="text" name="tenvacxin" value="<%=vx.getTenVacXin()%>">
    <br>
    <b> Số Mũi :</b>  <input type="number" name="somui" value="<%=vx.getSoMui()%>">
    <br>
    <b> Mô Tả : </b> <input type="text" name="mota" value="<%=vx.getMoTa()%>">
    <br>
    <b>  Giá Vắc Xin : </b> <input type="number" name="giavacxin" value="<%=vx.getGiaVacXin()%>">
    <br>
    <b> Tên Hãng :</b>  <input type="text" name="tenhang" value="<%=vx.getTenHang()%>">
    <br>
    <input class="btn btn-danger" type="submit" name="submit" value="EDIT">
</form>


</body>
</html>
