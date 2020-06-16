package controller;

import model.bean.LichSu;
import model.bean.TongSoTien;
import model.bo.TiemChungBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/TongSoTienController")
public class TongSoTienController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        TiemChungBO bo = new TiemChungBO();

        ArrayList<TongSoTien> tongSoTien = bo.getTongChiPhi();

        request.setAttribute("tongSoTien",tongSoTien);
        RequestDispatcher dispatcher = request.getRequestDispatcher("viewtongsotien.jsp");
        dispatcher.forward(request,response);

    }
}
