package servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Drew T
 * Week 3 Lab Part 1
 * Age Calculation Form
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
            
            //get the age parameter from the POST request
            String age = request.getParameter("Age");
            //set attribute for the JSP
            request.setAttribute("Age", age);
                
            //validation: if parameter does not exist or is empty display page again.
                if (age == null || age.equals("")) {
                    //set attribute for age
                    request.setAttribute("age","You must give your current age.");
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
                    return;
                }
            //validation: parse parameter for integer value and increment     
                try {
                int newAge = Integer.parseInt(request.getParameter("Age")) + 1;
                    //set attribute for age
                    request.setAttribute("age","Your age next birthday will be " + newAge);
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
                }
            //validation: handle number format error (String to Integer Conversion)
                catch (NumberFormatException e) {
                    //set attribute for age
                     request.setAttribute("age","You must enter a number.");
                    
                    // forward the request and response objects to the JSP
                    // display the form again
                    getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
                }

    }
}