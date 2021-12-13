<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
//ボタンを押された時
function dispHidden_2(){
	
	//form のname属性を取得(name部分)
	const formElements = document.forms.hidden;
	
	//input部分のname属性の値を(name属性のvalue部)をセットして
	//cookieに値をセット
	document.cookie = formElements.hid.value;
}

</script>

</head>
<body>

<form action="hidden" method="post" name="hidden">
<!-- hidden<input type="hidden" name="hid" value="ああああ"> -->
hidden<input type="hidden" name="hid" value="table.rows[ 0 ].cells[ 0 ].firstChild.data;">
<!-- table.rows[ 0 ].cells[ 0 ].firstChild.data; tableの0行目の列0番目を指定-->
社員ID<input type="text" name="id">
社員名<input type="text" name="name">
<input type="submit" value="検索" onclick="dispHidden_2()">
</form>

<table border=1>
<tr>
<td>10</td><td>20</td><td>30</td>
</tr>
</table>

</body>
</html>