<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  <f:form action="login" modelAttribute="ok">
  <table border="2" bgcolor="yellow">
  <tr><td>UID</td><td><f:input path="uid"/></td></tr>
  <tr><td>Pass</td><td><f:password path="pass"/></td></tr>
  <tr><td><input type="submit" value="LOGIN"></td></tr>
  </table>
  
  </f:form>
  
</body>
</html>