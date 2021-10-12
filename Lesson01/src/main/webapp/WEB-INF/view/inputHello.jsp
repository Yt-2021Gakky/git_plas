<!-- 
●View						
　⇒「WEB-INF」フォルダの下に「view」フォルダを作成する						
　　入力画面を「inputHello.jsp」とし、表示画面を「showHello.jsp」とする						
　　※入力画面のformのaction属性には「/hello」を指定すること						
　　　テキストボックスと送信ボタンを実装すること						
 -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inputHello</title>
</head>
<body>
<!-- ①msg送信 -->
<p>メッセージ送信するyoyoyoyyo</p>
<form action="hello" method="post">
メッセージ<input type="text" name="msg">
<input type="submit" value="送信">
</form>


</body>
</html>