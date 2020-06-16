package controller;

import model.bean.VacXin;
import model.bo.TiemChungBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        TiemChungBO bo = new TiemChungBO();
        ArrayList<VacXin> vacXinArrayList = bo.getListVacXin();
        request.setAttribute("listVacxin",vacXinArrayList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("viewvacxin.jsp");
        dispatcher.forward(request,response);

    }
}
