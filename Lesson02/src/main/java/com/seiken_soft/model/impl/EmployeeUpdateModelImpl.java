/*
 * ※実装するメソッド名は任意（更新画面用のモデル）
ただし、「EmployeeUpdateModelImpl」クラスでDB接続、SQL発行までを行う
beanクラスを使用してもよい（２－１で作成したもの）。
 * 
 */

package com.seiken_soft.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.seiken_soft.been.M_emploee;

public class EmployeeUpdateModelImpl {
	//public 型
	//public List<String> dbconnect() {
	public List<M_emploee> dbconnect(String id,String name,String mailaddress) {
		
		//リスト型インターフェース、要素beanの型パラメータでArrayList型で管理する。
		//List<オブジェクト型>、<M_emploee>明示的に型を分かるようにしている。<>なくても動く
		List<M_emploee> list = new ArrayList<>();
		
		
		
		
		try {
			//DB接続
			InitialContext ic = new InitialContext();
			DataSource ds=(DataSource)ic.lookup(
					"java:/comp/env/jdbc/seiken-Lesson");
				Connection con=ds.getConnection();
				
				
				

				
				//もしDBの中で社員IDがあれば
				//以下ロジックを通り検索
				//msgがid
				//if(msg == null);
				/*
				 * PreparedStatement st=con.prepareStatement(
’I1nsert lnto product vaLues（nutL〃？〃？）”）ノ
st.setString(1, name
				 * 
				 * */
				 
				
				//現状msgになにもないとnullが入り、SQLにてエラーになるidになにも値がない時の処理を考える
				//SQL文の作成と発行
				//社員名もしくはメールアドレスを変更する'
				PreparedStatement st=con.prepareStatement(
				"update m_emploee set EMPLOYEE_NAME=? ,E_MAILADDRESS=? where EMPLOYEE_ID=?");
				
				//プレースホルダ、?部一つ目、二つ目
				st.setString(1,name);
				
				st.setString(2,mailaddress);
				
				st.setString(3,id);
				
				//SQL文の作成と発行
				//PreparedStatement st=con.prepareStatement(
				//"select * from m_emploee");
				
				//DBの結果を発行
				int line=st.executeUpdate();
				
				if(line<0) {
		
					System.out.println("error");
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