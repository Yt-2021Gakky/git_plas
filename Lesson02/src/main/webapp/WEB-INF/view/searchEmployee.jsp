<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.seiken_soft.been.M_emploee, java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索画面</title>
<%-- clickBtn()のconstに値を設定(set)--%>
		<script>
			//Javascriptで、どこを選択するか
			function clickBtn(pid) {	

			//form のname属性を取得(name部分)
			const formElements = document.hid;
			
			//どこ？社員IDで
			//input部分のname属性の値にpidをセット
			formElements.h_name.value = pid;
			
			//input部分のname属性の値を(name属性のvalue部)をセット
			 //formElements.h_name.value;
			
			
			//cookieに値をセット
			//document.cookie = formElements.id.value;
			
			}
		</script>
</head>
<body>
<!-- 方法2 -->
<!-- List型で受け取った値をBeenにセット -->
<%-- request.getDispather()--%>

<!-- セットした値をリクエストで送る -->


<!-- ①msg送信 -->
<p>検索する社員IDと社員名を入力してください</p>
<form action="search" method="post">
社員ID<input type="text" name="id">
社員名<input type="text" name="name">
<input type="submit" value="検索">
</form>
 
<%--JSPでタグライブラリを使用する場合は、「taglib」ディレクティブを使用して、利用したいタグライブラリを宣言 --%>
<%--JSTLタグライブラリを使用、Coreタグライブラリの繰り返し文を使用(foreach) --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<form action="mainte" name="hid" method="post">
<!--  ここのクッキーでわたせない<input type="hidden" name="id" value="${p.id}"> -->

	<table border = 1>

<!-- クリックした時どの値を取得するか -->

	<c:forEach var="p" items="${list}">
		<tr>
		<!--   tdにある、n番目の修正ボタンが押された時 -->
		
		<!-- input type valueの値にtdの一番目の値をセットしたい -->
		<td>${p.id}</td><td>${p.name}</td><td>${p.mailaddress}</td>
		<td>
		
		<!-- clickBtnの引数に社員IDを指定  -->
		<input type="submit" value="修正" onclick="clickBtn(${p.id})" >
		<!--  <input type="hidden" name="id" value="${p.id}"> -->
		<!--</form>--></td>
		</tr>
		<!--  ここのクッキーでわたせない<input type="hidden" name="id" value="${p.id}">-->
	
	</c:forEach>
	
	</table>
	
	<!-- valueはいらない -->
	<!--  -->
	<input type="hidden" name="h_name">
</form>
	



<%-- うまくいかなかった。同じjspファイルではうまくいかないが、別のjspファイルではうまくいった --%>
<%--取り出し、取得 現状はList型を使いたいためObject型を戻すためキャスト変換 --%>
<%-- List<M_emploee> list=(List<M_emploee>)request.getAttribute("list"); --%>
<%-- 取り出し、取得 --%>
<%--for(M_emploee p : list){-- %>
		<%= p.getId() %>：<%= p.getName() %>：<%= p.getMailaddress() %><br>
<% }--%>



</body>
</html>