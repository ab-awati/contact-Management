<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script>
function goBack() {
  window.history.back();
}
</script>
<p style='margin-left:220px;color:red;'>${status}</p><br>
<table>
<tr>
   <th> <button style='margin-left: 200px; background-color: #008CBA;' type='submit'  value='submit' id="submit" onclick="goBack()">Go Back!</button></th>
   <th> <a button style='margin-left: 100px;' type='submit'  value='submit' id="submit1" href="/">Home</button></th>
</t>
</table><br><br>
</body>
</html>