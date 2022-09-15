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
        
            //get the value parameters from the POST request
            String first = request.getParameter("First");
            String second = request.getParameter("Second");
            String Action = request.getParameter("action");
            
            //set attribute for the JSP
            request.setAttribute("First", first);
            request.setAttribute("Second", second);
            request.setAttribute("action", Action);
           
            
            
            if (first.equals("") || second.equals("") ) {
                    //set attribute for result
                    request.setAttribute("result","---");
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
                    return;
                }
            
            //else if (first == null)
            // try catch blocks for all calculations that are integer values.
            try {
                if (Action.equals("+")) {
                
                int Add = Integer.parseInt(request.getParameter("First")) + Integer.parseInt(request.getParameter("Second"));
                    //set attribute for result
                    request.setAttribute("result", Add);
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response); 
                }
                
                else if (Action.equals("-")) {
                int Sub = Integer.parseInt(request.getParameter("First")) - Integer.parseInt(request.getParameter("Second"));
                    //set attribute for result
                    request.setAttribute("result", Sub);
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response); 
                }
 
                else if (Action.equals("*")) {
                int Mul = Integer.parseInt(request.getParameter("First")) * Integer.parseInt(request.getParameter("Second"));
                    //set attribute for result
                    request.setAttribute("result", Mul);
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response); 
                }   
                
                else if (Action.equals("%")) {
                double Div = (double)(Integer.parseInt(request.getParameter("First")) / (double)Integer.parseInt(request.getParameter("Second")));
                    //set attribute for result
                    request.setAttribute("result", Div);
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response); 
                }
            
            }
            
            catch (NumberFormatException e) {
                    //set attribute for result
                     request.setAttribute("result","Invalid");
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
                }
    }
}
