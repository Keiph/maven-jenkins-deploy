package com.dvops.maven.eclipse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Import PrintWriter class from Java.io lib
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String yourName = request.getParameter("yourName");
		String pw = request.getParameter("pw");
		
		if(yourName.equals("keiph") && pw.equals("123")) {
			PrintWriter writer = response.getWriter();
			writer.println("<h1> You have Successfully Login </h1>");
			writer.close();
		}
		else {
			PrintWriter writer = response.getWriter();
			writer.println("<h1> Wrong Credentials provided </h1>");
			writer.close();
		}
	
		//PrintWriter writer = response.getWriter();
		//writer.println("<h1>Hello " + yourName + "</h1>");
		//writer.close();
		doGet(request, response);
	}

}
