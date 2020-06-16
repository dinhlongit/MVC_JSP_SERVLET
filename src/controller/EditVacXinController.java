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

@WebServlet("/EditVacXinController")
public class EditVacXinController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mavaxin = request.getParameter("mavacxin");
        String tenvacxin = request.getParameter("tenvacxin");
        String somui1 = request.getParameter("somui");
        int somui = Integer.valueOf(somui1);
        String mota =request.getParameter("mota");
        String giavacxin1 = request.getParameter("giavacxin");
        int giavacxin = Integer.valueOf(giavacxin1);
        String tenhang = request.getParameter("tenhang");

        VacXin vx = new VacXin(mavaxin,tenvacxin,somui,mota,giavacxin,tenhang);
        TiemChungBO bo = new TiemChungBO();
        if (bo.editVacXin(vx)){
            PrintWriter pr = response.getWriter();
            pr.println("Sua thanh cong !");
        }else {
            PrintWriter pr = response.getWriter();
            pr.println("Sua khong thanh cong !");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String mavacxin = request.getParameter("mavacxin");
     TiemChungBO bo = new TiemChungBO();
     VacXin vx = bo.getVacXin(mavacxin);
     request.setAttribute("VacXin",vx);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editvacxin.jsp");
        dispatcher.forward(request,response);

    }
}
