<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.vertical-menu {
  width: 400px;
}

.vertical-menu a {
  background-color: #eee;
  color: black;
  display: block;
  padding: 12px;
  text-decoration: none;
}

.vertical-menu a:hover {
  background-color: #ccc;
}

.vertical-menu a.active {
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>


<div class="vertical-menu">
  <a href="#" class="active">Welcome To Contact Management System</a>
  <a href="allcontacts">View Contact List</a>
  <a href="show_addcontact">Add New Contact</a>
  </div><br><br>
  <div
  style='margin-left: 500px; width: 600px; float: left; color: green;'>${status}</div>

</body>
</html>
