<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--@page import="com.seiken_soft.been.M_emploee, java.util.List" --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新画面</title>
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
<!-- <label for="id" name= a.onload()>社員ID -->
<!-- onload()する？ -->
<label for="id" name="syainn_name">社員ID</label><!-- 値をラベル表示 -->

<input type="hidden" name="setid" id="name" placeholder="社員ID"><br />
社員名<input type="text" name="name">
メールアドレス<input type="text" name="mailaddress">
<input type="submit" value="保存">
</form> 

<script>
<!-- getする-->
<!-- id=setid -->
function gamen(){
document.getElementById('setid');
}
</script>
 
</body>
</html>