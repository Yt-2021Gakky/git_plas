<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--@page import="com.seiken_soft.been.M_emploee, java.util.List" --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新画面</title>
<script type="text/Javascript">
//取得
function gamen(){
	const cookies = document.cookie;
	document.getElementById("msg").innerHTML = cookies;
	}
</script>




</head>
<body onload="gamen()">
<!-- 
画面内容は社員IDをラベル表示、社員名とe-mailアドレスのテキストボックス、保存ボタンを配置する
（社員IDはhidden項目とする）
保存ボタンを押すと検索画面へ遷移する
→updateを通った最後にRequest.dispattaureでsearchに移動
 -->
<p>更新する社員名、メールアドレスを入力してください</p>

<form action="update" method="post">
<!-- 値をラベル表示 -->
社員ID<label for="id" name="syainn_name"><div id="msg"></div></label>
<input type="hidden" name="id" value="msg">
社員名<input type="text" name="name">
メールアドレス<input type="text" name="mailaddress">
<input type="hidden" name="flg" value=1>
<input type="submit" value="保存">
</form> 
 
</body>
</html>