<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title></title>
        <style>
            body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: beige;
}

.container {
  padding: 16px;
  background-color: white;
}
.Registrationbutton  {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  cursor: pointer;
  width: 10%;
  opacity: 0.9;
}
        </style>
            <body>
				<form action="http://localhost:8080/loginservlet/Registrationservlet" method="post">
               
                <h1>Registration Page For Payment Application</h1>
                <h2> Please fill in the form to create an account.</h2>
                <div class="container">
                <label>First Name</label>
                <input type="text" name="First Name"><br><br>
                <label>Last Name</label>
                <input type="text" name="Last Name"><br><br>
                <label>Phone Number</label>
                <input type="text" name="Phone Number"><br><br>
                <label>Email</label>
                <input type="text" name="Email"><br><br>
                <label>Create Password</label>
                <input type="text" name="Create Password"><br><br>
                <button type="submit" class="Registrationbutton">signup</button> 
            </div>
            </form>
          
            </body>
    </head>
</html>
