<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #E6E6FA">
	<h1 style="margin-left: 580px; color: green;">Contact Management</h1>

	<form action="addcontact" id='testform' name='testform'>

		<div
			style='margin-left: 500px; width: 120px; float: left; color: black;'>First
			Name</div>
		<input type='text' name='firstName' id='firstName' class='required' min="4" maxlength="32" pattern="[A-Za-z]{1,32}" title="First Name should be start with Alphabates only" required> <br>
		<br>

		<div
			style='margin-left: 500px; width: 120px; float: left; color: black;'>Last
			Name</div>
		<input type='text' name='lastName' id='lastName' class="required" maxlength="32" name="first_name" pattern="[A-Za-z]{1,32}" title="Last Name should be start with Alphabates only" required> <span
			id='lasterror' style="margin-left: 120px;"></span><br>
		<br>

		<div
			style='margin-left: 500px; width: 120px; float: left; color: black;'>EMail</div>
		<div>
			<input type='email' name='emailId' class="required email" title="Please Enter Valid Email Address" required>
		</div>
		<br>
		<br>

		<div
			style='margin-left: 500px; width: 120px; float: left; color: black;'>Phone
			Number</div>
		<input type='text' name='phoneNumber' id='phoneNumber'
           pattern="[6-9]{1}[0-9]{9}" min="10" max="10" title="Phone number with 6-9 and remaing 9 digit with 0-9" required> <span
			id='lasterror' style="margin-left: 120px;"></span><br>
		<br>

		<div
			style='margin-left: 500px; width: 120px; float: left; color: black;'>Status</div>
		<select name='contactStatus'>
			<option value='active'>Active</option>
			<option value='inactive'>Inactive</option>
		</select><br>
		<br>
		
		<table>
<tr>
   <th> <button style='margin-left: 600px; background-color: #008CBA;' type='submit'  value='submit' id="submit">Submit</button></th>
   <th> <a button style='margin-left: 100px; type='submit'  value='submit' id="submit1" style="background-color: #008CBA" href="/">Home</button></th>
</tr>
</table><br><br>
		<div
			style='margin-left: 500px; width: 600px; float: left; color: red;'>${status}</div>
	</form>
</body>
</html>