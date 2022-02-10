/**
 *
 * ●Controller（Servlet）							
　⇒パッケージ名を「com.seiken_soft.controller」とし、クラス名を「HelloController」とする							
　　※実装するメソッド名はdoGet()メソッドとdoPost()メソッドとする							
　　　クラスのアノテーションに「@WebServlet("/hello")」を付加すること							

 */


package com.seiken_soft.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seiken_soft.model.impl.HelloModelImpl;

//➁jspの内容を受け取る
@WebServlet(urlPatterns="/hello")
public class HelloController extends HttpServlet {
	
			
		//doPost()メソッド
		public void doPost(
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
			try {
				//③jspのNAME要素取得
				//VALUEの内容が渡される
				String msg = request.getParameter("msg");
				
				//デバッグここまで表示できている
				//out.println(msg + "変数msg　これはセットする前の内容");
				
				
				HelloModelImpl hml = new HelloModelImpl();
				
				//④getParameterの値をmodelに設定（セット）する
				hml.setMsg(msg);
				
				
				//String getM = hml.getmsg();
				//out.println(getM + "デバッグ変数getM　これはゲッターから取り出した内容");
				
				//セットした値をgetMsg()で取得
				msg = hml.getMsg();
				
				//out.println(msg + "デバッグmsgの値表示ここはdoGet()メソッド");
				//値の保持
				request.setAttribute("res", msg);
				
				
				out.println("デバッグまだPost");
				
				//showHello.jspへフォワード
				//requestに
				request.getRequestDispatcher("/WEB-INF/view/showHello.jsp")
				.forward(request, response);
			} catch (Exception e) {
				out.println("doPostメソッドでエラーです。");			
			}
			
			
			
		}
		
		
		//doGet()メソッド
				public void doGet(
					HttpServletRequest request, HttpServletResponse response
					)throws ServletException, IOException {
						
						PrintWriter out=response.getWriter();
						try {
							//フォワード処理
							//request.getRequestDispatcher("/WEB-INF/view/inputHello.jsp").forward(request, response);

							
						}catch(Exception e) {
							out.println("doGetメソッドでエラーです。");			
						}
				}

	
}
