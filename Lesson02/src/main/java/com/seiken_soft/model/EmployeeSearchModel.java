/**
 * ●Model							
  ⇒パッケージ名を「com.seiken_soft.model」とし、
  インターフェース名を「EmployeeSearchModel」とする							
 */

package com.seiken_soft.model;

import java.util.List;

import com.seiken_soft.been.M_emploee;

//インターフェース名
public interface EmployeeSearchModel{
	/*
	public void setMsg(String msg);
	public String getMsg();
	*/
	
	//DB接続とSQL発行するインターフェース
	//引数String型ふたつ
	public List<M_emploee> dbconnect(int msg,String msg1);
}