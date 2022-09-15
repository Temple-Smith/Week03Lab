/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Drew-
 */
//@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            //get the age parameter from the POST request
            String first = request.getParameter("First");
            String second = request.getParameter("Second");
            //set attribute for the JSP
            request.setAttribute("First", first);
            request.setAttribute("Second", second);
            
            if (first == null || first.equals("") || second == null || second.equals("")) {
                    //set attribute for result
                    request.setAttribute("result","---");
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
                    return;
                }
            // try catch blocks for all calculations that are integer values.
            try {
                int Add = Integer.parseInt(request.getParameter("First")) + Integer.parseInt(request.getParameter("Second"));
                    //set attribute for age
                    request.setAttribute("result", Add);
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
                
            
                }
            
            catch (NumberFormatException e) {
                    //set attribute for age
                     request.setAttribute("result","Invalid");
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
                }
    }
}
