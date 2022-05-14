package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		String bn=request.getParameter("op");
		
		/*if(bn.equals("Add"))
		{
			int Value=(num1+num2);
			out.println("Addition of Two Number="+Value);
		}
		else if(bn.equals("Sub"))
		{
			int Value=(num1-num2);
			out.println("Subtraction of Two Number="+Value);
		}
		else if(bn.equals("div"))
		{
			int Value=(num1%num2);
			out.println("Division of Two Number="+Value);
		}
		else if(bn.equals("Mul"))
		{

			int Value=(num1*num2);
			out.println("Multiplication of Two Number="+Value);
			
		}*/
		
		switch(bn)
		{
		case "Add":
		
			int Value=(num1+num2);
			out.println("Addition of Two Number="+Value);
		break;
		case "Sub":
		
			int Value1=(num1-num2);
			out.println("Subtraction of Two Number="+Value1);
		break;
		case "div":
		
			int Value2=(num1%num2);
			out.println("Division of Two Number="+Value2);
		break;
		case "Mul":
		
			int Value3=(num1*num2);
			out.println("Multiplication of Two Number="+Value3);
		break;
		
			
		}
		
	}

}
