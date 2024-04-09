<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="regUpdate">
<fieldset>
<h3>----------------------------Update Data------------------------------------</h3>
Employee ID : <input type="hidden" name="eid" value="${e.eid}">${e.eid}<br><br>
Enter Name : <input  name="ename" value="${e.ename}"><br><br>
Enter Address : <input  name="addr" value="${e.addr}"><br><br>

<button type="submit">Submit</button>
</fieldset>
</form>
</body>
</html>