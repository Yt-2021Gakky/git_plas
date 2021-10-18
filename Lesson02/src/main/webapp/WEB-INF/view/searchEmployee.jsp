<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--@page import="com.seiken_soft.been.M_emploee, java.util.List" --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search title here</title>
</head>
<body>
<!-- ①msg送信 -->
<p>検索する社員IDと社員名を入力してください</p>
<form action="search" method="post">
社員ID<input type="text" name="id">
社員名<input type="text" name="name">
<input type="submit" value="送信">
</form>

<%--JSPでタグライブラリを使用する場合は、「taglib」ディレクティブを使用して、利用したいタグライブラリを宣言 --%>
<%--JSTLタグライブラリを使用、Coreタグライブラリの繰り返し文を使用(foreach) --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<table border = 1>
	<c:forEach var="p" items="${list}">
		<tr>
		<td>${p.id}</td><td>${p.name}</td><td>${p.mailaddress}</td>
		</tr>
	</c:forEach>
</table>

<%-- うまくいかなかった。別ファイルで表示はうまくいった --%>
<%--取り出し、取得 現状はList型を使いたいためObject型を戻すためキャスト変換 --%>
<%-- List<M_emploee> list=(List<M_emploee>)request.getAttribute("list"); --%>
<%-- 取り出し、取得 --%>
<%--for(M_emploee p : list){-- %>
		<%= p.getId() %>：<%= p.getName() %>：<%= p.getMailaddress() %><br>
<% }--%>


</body>
</html>