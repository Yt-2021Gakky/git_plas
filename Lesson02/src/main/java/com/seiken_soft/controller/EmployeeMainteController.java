package com.seiken_soft.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/mainte")
public class EmployeeMainteController extends HttpServlet{
	
		public void doGet(
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException {
			PrintWriter out=response.getWriter();
				try {
					
				}catch(Exception e) {
					out.println("doGetメソッドでエラーです。");			
				}
		}
	
			
		//doPost()メソッド
		public void doPost(
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
				
				try {
					
					
					String name = request.getParameter("h_name");
					
					request.setAttribute("id",name);
					
					
					//フォワード処理
					out.println("doGet()メソッド");
					request.getRequestDispatcher("/WEB-INF/view/mainteEmployee.jsp").forward(request, response);

				
				
				
			
			}catch(Exception e) {
				out.println("doGetメソッドでエラーです。");			
			}
			
			
				
		}
}