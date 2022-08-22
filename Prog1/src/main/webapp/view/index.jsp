<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Here</title>
</head>
<body>
	<h1>Enter the Details</h1>

	<form action="/addCustomer">
		<label>Cust Id</label> <input type="text" name="custId"> <br>
		<label>Cust Name</label> <input type="text" name="custName"> <br>
		<label>Cust Phone</label> <input type="number" name="custPhn">
		<br> <label>Cust Address</label> <input type="text"
			name="custAddress"> <br> <label>Cust LoginId</label> <input
			type="text" name="custLogin"> <br> <label>Cust
			Password</label> <input type="text" name="custPass"> <br>
			<input type = "submit"	>

	</form>

</body>
</html>