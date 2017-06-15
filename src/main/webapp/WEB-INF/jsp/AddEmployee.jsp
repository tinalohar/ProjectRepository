<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="bootsample/submitform" method="post">

<center>
<table>
<thead> Add Employees details</thead>
<tr>
<td>Employee ID:</td>
<td><input type="number" name="employeeId"></td>
</tr>
<tr>
<td>Employee Name:</td>
<td><input type="text" name="employeeName"></td>
</tr>
<tr>
<td>Location:</td>
<td><input type="text" name="location"></td>
</tr>
<tr>
<td>Email ID:</td>
<td><input type="text" name="emailId"></td>
</tr>
<tr>
<td>Mobile No:</td>
<td><input type="number" name="MobileNo"  ></td>
</tr>
<tr>
<td><input type="submit" value="Add" name="submit"></td>
</tr>
</table>
</center>
</form>


</body>
</html>