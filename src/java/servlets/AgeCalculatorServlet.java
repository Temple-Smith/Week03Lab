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
                
            String age = request.getParameter("Age");
            request.setAttribute("Age", age);
                
                if (age == null || age.equals("")) {
                    
                    request.setAttribute("age","You must give your current age.");
                    
                    getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
                    return;
                }
                
                int newAge = Integer.parseInt(request.getParameter("Age")) + 1;
                
                    request.setAttribute("age","Your age next birthday will be " + newAge);
                    
                    getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);     
            }
}