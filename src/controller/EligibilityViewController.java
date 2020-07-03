package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import utility.BasicEligibility;
import utility.EligibilityCheck;
import utility.EligibiltyCheck;

@WebServlet(urlPatterns= {"/eligible"})
public class EligibilityViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public EligibilityViewController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("Vish");
		String number=request.getParameter("14");
		int age=Integer.parseInt(request.getParameter("20"));
		int height=Integer.parseInt(request.getParameter("160"));
		int weight=Integer.parseInt(request.getParameter("65"));
		String country=request.getParameter("ProGrad");
		
	
		User user = new User(name,number,age,height,weight,country);
		user.setName(name);
		user.setNumber(number);
		user.setAge(age);
		user.setHeight(height);
		user.setWeight(weight);
		
		EligibilityCheck eli = new EligibilityCheck();
		
		eli.basicEligibilityCheck(user);
		
		System.out.println(spaceEligible);
			if(spaceEligible)
			{
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/quiz.jsp");
				rd.forward(request, response);	
			}
			else
			{
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp");
				rd.forward(request, response);
				
			}
}
}

