<%@ page import="java.util.ArrayList" %>
<%@ page import="model.bean.VacXin" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/11/2019
  Time: 8:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> VIEW VACXIN </title>
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
<%
    ArrayList<VacXin> vx = (ArrayList<VacXin>) request.getAttribute("listVacxin");

%>
<table class="table-striped" style="border-collapse: collapse; border: 1px solid gray; padding: 5px;">
    <tr>
    <th>Mã Vắc Xin</th>
        <th>Tên Vắc Xin</th>
        <th>Số Mũi</th>
        <th>Mô Tả</th>
        <th>Giá Vắc Xin</th>
        <th>Tên Hãng </th>
        <th>ACTION</th>

    </tr>
    <%for (int i = 0 ; i < vx.size();i++){%>
    <tr>
        <td><%=vx.get(i).getId()%></td>
        <td><%=vx.get(i).getTenVacXin()%></td>
        <td><%=vx.get(i).getSoMui()%></td>
        <td><%=vx.get(i).getMoTa()%></td>
        <td><%=vx.get(i).getGiaVacXin()%></td>
        <td><%=vx.get(i).getTenHang()%></td>
        <td><a class="btn btn-danger" href="./EditVacXinController?mavacxin=<%=vx.get(i).getId()%>">EDIT</a></td>

    </tr>

    <%}%>


</table>




</body>
</html>
