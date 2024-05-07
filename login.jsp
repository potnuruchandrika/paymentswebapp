<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#a{
text-align:center;
background-color:beige;
}
.loginbutton{
background-color : #04AA6D;
color : white;
width : 70px;
cursor : pointer;


</style>
</head>

<body>
<form action="http://localhost:8080/paymentapp/dashboard.jsp" method=post>
<div id="a">
<h1>Welcome To Payment Application </h1>
<label>Username*</label>
<input type="text" name="Username"><br><br>
<label>Password*</label>
<input type="password" name="Password"><br><br>
<button type="submit" class="loginbutton">Login</button>
</div>
</form>
</body>
</html>
