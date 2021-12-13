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
import com.seiken_soft.model.impl.EmployeeUpdateModelImpl;


	//➁jspの内容を受け取る
	//とりあえずいまはこれで正規表現でsearch*なんでもいけるようにする
@WebServlet(urlPatterns="/update")
public class EmployeeUpdateController extends HttpServlet{
		
		//グローバル変数
		int flg =0;
		
			public void doGet(
				HttpServletRequest request, HttpServletResponse response
				)throws ServletException, IOException {
					
					PrintWriter out=response.getWriter();
					try {
						//フォワード処理
						//out.println("doGet()メソッド");
						//request.getRequestDispatcher("/WEB-INF/view/mainteEmployee.jsp").forward(request, response);

						
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
					
					int flg =0;
					
					//1回目のpost
					if(flg==0) {
					
					
					//フォワード処理
					out.println("doPost()メソッド");
					request.getRequestDispatcher("/WEB-INF/view/mainteEmployee.jsp")
					.forward(request, response);
					
					flg=1;
					}
					
					
					
					else if(flg==1){
					//③jspのNAME要素取得
					//VALUEの内容が渡される
					String msg1 = request.getParameter("name");
					String msg2 = request.getParameter("mailaddress");
					
					
					//インターフェース
					EmployeeUpdateModelImpl esmi = new EmployeeUpdateModelImpl();
					
					
					//DB接続
					//dbconnectメソッドの内容を返す
					//引数msg,msg1を渡す
					//Object型で管理
					List<M_emploee> emplist = esmi.dbconnect(msg1,msg2);
					
					
					//requestに値をセット
					request.setAttribute("list", emplist);
					
					//一回目はリクエストで移動させて
					//if(0)
					
					
					//社員idを受け取る
					//社員IDを渡す
					
					//フォワード処理
					out.println("doPost()メソッド");
					request.getRequestDispatcher("/WEB-INF/view/searchEmployee.jsp")
					.forward(request, response);
					
					flg = 0;
					}
					
					
					//二回目は処理？？
				}catch (Exception e) {
						
						//,NumberFormatException
						//文字が入力された場合のエラー設定
				    	//form_p = "数字を入力してください。";
						e.printStackTrace(out);
						out.println("doPostメソッドでエラーです。");	
					}
			}
}

