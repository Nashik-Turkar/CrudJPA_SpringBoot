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
<table border="1"  style="width:100%">
<tr style="height:45px;" ><th colspan="6" >----------------All Employee Details----------------</th></tr>
<tr>
<th>Id </th>
<th>Name </th>
<th>Address </th>
<th>Action</th>
</tr>
<c:forEach items="${Data}" var="a">
<tr style="height:35px;">
<td>${a.eid}</td>
<td>${a.ename}</td>
<td>${a.addr}</td>
<td align="center">|<a href="edit?eid=${a.eid}">Edit</a>|------|<a href="delete?eid=${a.eid}">Delete</a>|</td>
</tr>
</c:forEach>
<tr><th colspan="6" style="height:35px;">
<a href="home" ><button>BACK</button></a></th>
</tr>
</table>


</body>
</html>