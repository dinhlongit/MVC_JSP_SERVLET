package controller;

import model.bean.KhachHang;
import model.bean.LichSu;
import model.bean.VacXin;
import model.bo.TiemChungBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/LichSuTiemChungController")
public class LichSuTiemChungController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String makhachhang = request.getParameter("makhachhang");
        TiemChungBO bo = new TiemChungBO();

        ArrayList<LichSu> lsTP = bo.getLichSuTiemPhongById(makhachhang);

        request.setAttribute("LichSu",lsTP);
        RequestDispatcher dispatcher = request.getRequestDispatcher("viewlichsu.jsp");
        dispatcher.forward(request,response);



    }

}
