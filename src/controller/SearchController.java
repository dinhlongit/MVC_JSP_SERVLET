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

@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String name = request.getParameter("searchtxt");
        TiemChungBO bo = new TiemChungBO();
        ArrayList<VacXin> listVacXin = bo.getListSearch(name);
        request.setAttribute("listVacxin",listVacXin);

        RequestDispatcher dispatcher = request.getRequestDispatcher("viewvacxin.jsp");
        dispatcher.forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
