package controller;

import model.bean.KhachHang;
import model.bo.TiemChungBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/KhachHangController")
public class KhachHangController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TiemChungBO bo = new TiemChungBO();
        ArrayList<KhachHang> lishKH = bo.getListKhachHang();
        request.setAttribute("listKhachHang",lishKH);

        RequestDispatcher dispatcher = request.getRequestDispatcher("viewkhachhang.jsp");
        dispatcher.forward(request,response);

    }
}
