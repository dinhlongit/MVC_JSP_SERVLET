<%@ page import="java.util.ArrayList" %>
<%@ page import="model.bean.VacXin" %>
<%@ page import="model.bean.LichSu" %>
<%@ page import="model.bean.TongSoTien" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/11/2019
  Time: 8:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> VIEW TONG SO TIEN </title>
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
    ArrayList<TongSoTien> ls = (ArrayList<TongSoTien>) request.getAttribute("tongSoTien");

%>
<table class="table-striped" style="border-collapse: collapse; border: 1px solid gray; padding: 5px;">
    <tr>
        <th>Mã Khách Hàng</th>
        <th>Tên Khách Hàng</th>
        <th>Số Tiền Phải Trả</th>
    </tr>
    <%if (ls.size() > 0 ){
        for (int i = 0 ; i < ls.size() ; i++){
    %>
    <tr>
        <td><%=ls.get(i).getMakhachhang()%></td>
        <td><%=ls.get(i).getTenkhachhang()%></td>
        <td><%=ls.get(i).getTongTien()%></td>
    </tr>

    <%}%>
    <%}%>

</table>




</body>
</html>
