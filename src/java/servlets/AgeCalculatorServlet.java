package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Drew-
 */
public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //int age = Integer.parseInt(request.getParameter("cAge"));
       //age = Integer.parseInt(request.getParameter("Age"));
        String age = request.getParameter("Age");
        //int newAge = Integer.parseInt(request.getParameter("Age")) + 1;
        
        request.setAttribute("Age", age);
       
    if (age == null || age.equals("")) {
        request.setAttribute("age","You must give your current age.");
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        return;
    }
     
    
    //else {
        int newAge = Integer.parseInt(request.getParameter("Age")) + 1;
        request.setAttribute("age","Your age next birthday will be " + newAge);
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
     
    }



//response.setContentType("text/html;charset=UTF-8");
        //try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //out.println("<!DOCTYPE html>");
            //out.println("<html>");
            //out.println("<head>");
            //out.println("<title>Servlet AgeCalculatorServlet</title>");            
            //out.println("</head>");
            //out.println("<body>");
            //out.println("<h1>Servlet AgeCalculatorServlet at " + request.getContextPath() + "</h1>");
            //out.println("</body>");
            //out.println("</html>");
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //@Override
    //protected void doGet(HttpServletRequest request, HttpServletResponse response)
    //        throws ServletException, IOException {
    //    processRequest(request, response);
    //}

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    //@Override
    //public String getServletInfo() {
    //    return "Short description";
    //}// </editor-fold>

//}

/*function required(cAge) {
if (cAge.value.length == 0) {
alert("Enter a value");
return false;
}
return true;
}*/
