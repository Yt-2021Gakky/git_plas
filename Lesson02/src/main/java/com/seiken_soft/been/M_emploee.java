package com.seiken_soft.been;

//DBの値をセットする
public class M_emploee implements java.io.Serializable {

	private int employee_id;
	private String employee_name;
	private String e_mailaddress;

	//DBの値を取得（ゲット）
	public int getId() {
		return employee_id;
	}
	public String getName() {
		return employee_name;
	}
	public String getMailaddress() {
		return e_mailaddress;
	}

	//DBで取得した値を設定(セット)
	public void setId(int employee_id) {
		this.employee_id=employee_id;
	}
	public void setName(String employee_name) {
		this.employee_name=employee_name;
	}
	public void setMailaddress(String e_mailaddress) {
		this.e_mailaddress=e_mailaddress;
	}
}