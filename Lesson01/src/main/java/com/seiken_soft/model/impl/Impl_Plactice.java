package com.seiken_soft.model.impl;
import com.seiken_soft.model.HelloModel;

public class Impl_Plactice implements HelloModel {

	
	
	//privateなフィールド
	private String msg;
	
	
	
	//ゲッター、フィールドの値を呼出元へ返す
	@Override
	public String getMsg() {
		return "HelloHello";
	}
	
	//セッター、フィールドに値をセット
	@Override
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
