<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/Javascript">
//取得
function onload(){
	const cookies = document.cookie;
	document.getElementById("msg").innerHTML = "cookieの内容:" + cookies;
	}
</script>

</head>
<body onload="onload();">
<div id="msg">

</div>

<table border=1>
<tr>
<td>10</td><td>20</td><td>30</td>
</tr>
</table>

</body>
</html>