<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="3" bgcolor="yellow">
<tr><td>Costom field</td><td>I Name</td></tr>

<c:forEach items="${b}" var="t">

<td><c:out value="${t.custom_field_id}"></c:out></td>
<td><c:out value="${t.iname}"></c:out></td>

</tr>
</c:forEach>

</table>

</body>
</html>