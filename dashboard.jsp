<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dashboard page</title>
<style>
#btn {
	display: flex;
	flex-direction: row;
	padding: 350px;
	justify-content: center;
}

.a {
	height: 50px;
	width: 150px;
}
button{
      margin-right:16px;
     

}

</style>
</head>
<body>
	<h2 style="text-align: center;">Welcome to paymentsCLI</h2>
	
	<% String s=(String)session.getAttribute("name"); %>
         <h2>Welcome <%=s %></h2> 
         
	<div id="btn">
		<form action="http://localhost:8080/paymentapp/addBankaccount.jsp">
			<button class="a">Add bank account</button>
		</a> 
		<form action="http://localhost:8080/paymentapp/requestStmt.jsp">
			<button class="a">Request Statement</button>
		</a> 
		<a href="sendmonet.jsp">
			<button class="a">Send Money</button>
		</a> 
		<!--  <a href="statementRequest.jsp">
			<button class="a">Check Balance</button>
		</a> 
		<a href="WalletBalance.jsp">
			<button class="a">Wallet Balance</button>
		</a> -->
		<a href="http://localhost:8081/PaymentsCli/LogoutServlet">
			<button class="a">Logout</button>
		</a>
	</div>
	</form>
</body>
</html>
