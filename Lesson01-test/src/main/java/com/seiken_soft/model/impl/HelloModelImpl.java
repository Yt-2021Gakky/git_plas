/**
 * ●Model							
　⇒パッケージ名を「com.seiken_soft.model.impl」とし、
  クラス名を「HelloModelImpl」とする							
　　※実装するメソッド名は任意							

 * 
 * 
 */

package com.seiken_soft.model.impl;

import com.seiken_soft.model.HelloModel;

public class HelloModelImpl implements HelloModel {

			//privateなフィールド
			private String msg;
			
			
			
			//ゲッター、フィールドの値を呼出元へ返す
			@Override
			public String getMsg() {
				return msg;
			}
			
			//セッター、フィールドに値をセット
			@Override
			public void setMsg(String msg) {
				this.msg = msg;
			}
}
