/*
 * 　⇒パッケージ名を「com.seiken_soft.model.impl」とし、クラス名を「EmployeeSearchModelImpl」とする
　　※実装するメソッド名は任意
　　　ただし、「EmployeeSearchModelImpl」クラスでDB接続、SQL発行、取得した結果を返却するところまでを行う
　　　beanクラスを作成してもよい。ただしパッケージは分けること
 */


package com.seiken_soft.model.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

//import tool.Page;
import com.seiken_soft.been.M_emploee;
import com.seiken_soft.model.EmployeeSearchModel;

//DB接続、SQL発行、取得した結果を返却するところまでを行う
public class EmployeeSeachModelImpl implements EmployeeSearchModel {
	
	//条件に応じて取得するようにする
	
	//各メソッドを作成
	//DBの内容を表示するメソッド(取得している)
	
	
	//public 型
	//public List<String> dbconnect() {
	public List<M_emploee> dbconnect(int msg,String msg1) {
		
		//リスト型インターフェース、要素beanの型パラメータでArrayList型で管理する。
		//List<オブジェクト型>、<M_emploee>明示的に型を分かるようにしている。<>なくても動く
		List<M_emploee> list = new ArrayList<>();
		
		
		
		//DB接続
		try {
			
			InitialContext ic = new InitialContext();
			DataSource ds=(DataSource)ic.lookup(
					"java:/comp/env/jdbc/seiken-Lesson");
				Connection con=ds.getConnection();
				
				
				//もしDBの中で社員IDがあれば
				//以下ロジックを通り検索
				//msgがid
				//if(msg == null);
				
				
				//現状msgになにもないとnullが入り、SQLにてエラーになるidになにも値がない時の処理を考える
				//SQL文の作成と発行
				//select * from m_emploee  where EMPLOYEE_ID like 200 or EMPLOYEE_NAME LIKE '坂本%'
				PreparedStatement st=con.prepareStatement(
				"select * from m_emploee where EMPLOYEE_ID like ? or EMPLOYEE_NAME like ?");
				
				//プレースホルダ、?部一つ目、二つ目
				st.setInt(1,msg);
				
				//前方一致
				st.setString(2,msg1+"%");
				
				//SQL文の作成と発行
				//PreparedStatement st=con.prepareStatement(
				//"select * from m_emploee");
				
				//DBの結果を発行
				ResultSet rs=st.executeQuery();
				
				//それ以外はすべて表示？
				
				//社員名で検索を行った場合は前方一致で複数件表示（見つからなければ0件）SQLはLike句？
				
				
				//beenを使う
				//DBの内容を表示
				//beenの内容を取り出して表示
				while (rs.next()) {
					M_emploee m_emp = new M_emploee();
					m_emp.setId(rs.getInt("employee_id"));
					m_emp.setName(rs.getString("employee_name"));
					m_emp.setMailaddress(rs.getString("e_mailaddress"));
					list.add(m_emp);
				}
								
				st.close();
				con.close();
				
				
				
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			

			//out.println("ここはフィルタを使って出力したHTML部分<<br><br>");
			e.printStackTrace();
			
			//List<Object> list_e = new ArrayList<>();
			
			//list_e.add("idに空白を入れることはできません");
			
			//return (List<M_emploee>) list_e;
		}
		return list;
	}
}

	
	//getParameterの値を受け取る
	//public List<get_P> get_p() {
		//getParameterの値をセットする。
		//get_P pam= new get_P();
		//pam.setId(etInt("employee_id"));
		//m_emp.setName(rs.getString("employee_name"));
		//m_emp.setMailaddress(rs.getString("e_mailaddress"));
		//list.add(m_emp);
		
	//

	//@Override
	//public List<M_emploee> dbconnect(String msg, String msg1) {
		// TODO 自動生成されたメソッド・スタブ
		//return null;
