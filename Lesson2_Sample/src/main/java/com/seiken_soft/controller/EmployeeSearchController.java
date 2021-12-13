/**
 *
 * ●Controller（Servlet）
　⇒パッケージ名を「com.seiken_soft.controller」とし、クラス名を「EmployeeSearchController」とする
　　※実装するメソッド名はdoGet()メソッドとdoPost()メソッドとする
　　　クラスのアノテーションに「@WebServlet("/search")」を付加すること

 */


package com.seiken_soft.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seiken_soft.been.M_emploee;
import com.seiken_soft.model.impl.EmployeeSeachModelImpl;


//➁jspの内容を受け取る
//とりあえずいまはこれで正規表現でsearch*なんでもいけるようにする
@WebServlet(urlPatterns="/search")
public class EmployeeSearchController extends HttpServlet {
	
	//グローバル変数
	//int msg;
	
	
	
		public void doGet(
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException {
				
				PrintWriter out=response.getWriter();
				try {
					//フォワード処理
					out.println("doGet()メソッド");
					request.getRequestDispatcher("/WEB-INF/view/searchEmployee.jsp").forward(request, response);

					
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
				
				//③jspのNAME要素取得
				//VALUEの内容が渡される
				String str_msg = request.getParameter("id");
				String msg1 = request.getParameter("name");
				
				
				//インターフェース
				EmployeeSeachModelImpl esmi = new EmployeeSeachModelImpl();
				
				
				//DB接続
				//dbconnectメソッドの内容を返す
				//引数msg,msg1を渡す
				//Object型で管理
				List<M_emploee> emplist = esmi.dbconnect(str_msg,msg1);
				
				
				//requestに値をセット
				request.setAttribute("list", emplist);
				
				
				request.getRequestDispatcher("/WEB-INF/view/searchEmployee.jsp")
				.forward(request, response);
				
				
				
				
			} catch (Exception e) {
				
				//,NumberFormatException
				//文字が入力された場合のエラー設定
		    	//form_p = "数字を入力してください。";
				e.printStackTrace(out);
				out.println("doPostメソッドでエラーです。");	
			}

		}

}
