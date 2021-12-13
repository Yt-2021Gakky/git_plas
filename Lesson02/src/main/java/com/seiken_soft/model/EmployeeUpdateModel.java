package com.seiken_soft.model;

import java.util.List;

import com.seiken_soft.been.M_emploee;

public interface EmployeeUpdateModel {

	//DB接続とSQL発行する
	//update用インターフェース
	//引数String型ふたつ
	public List<M_emploee> dbconnect(String msg,String msg1);
}
