<%@ page import="java.util.ArrayList" %>
<%@ page import="model.bean.VacXin" %>
<%@ page import="model.bean.KhachHang" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/11/2019
  Time: 8:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> VIEW LICH SU KHACH HANG </title>
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
    ArrayList<KhachHang> vx = (ArrayList<KhachHang>) request.getAttribute("listKhachHang");

%>
<table class="table-striped" style="border-collapse: collapse; border: 1px solid gray; padding: 5px;">
    <tr>
        <th>STT</th>
        <th>Mã Khách Hàng</th>
        <th>Tên Khách Hàng</th>


    </tr>
    <%for (int i = 0 ; i < vx.size();i++){%>
    <tr>
        <td><%=i%></td>
        <td><%=vx.get(i).getMaKH()%></td>
        <td><%=vx.get(i).getHoTenKH()%></td>
        <td><a class="btn btn-danger" href="./LichSuTiemChungController?makhachhang=<%=vx.get(i).getMaKH()%>">HISTORY</a></td>
    </tr>

    <%}%>


</table>




</body>
</html>
