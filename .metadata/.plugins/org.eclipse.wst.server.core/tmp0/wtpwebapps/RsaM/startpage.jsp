<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='css/style.css' rel='stylesheet' type='text/css'>
<title>Insert title here</title>
</head>
<body>

 <table style="width:100%">
  <tr>
    <th></th>
    <th><h1>Rsa Managment</h1></th>
    <th><div class="login-block">
 <form method="POST" action="GestioneUtenteHandler.do?action=logout">
    <input type="submit" value="logout">
</form> 
</div></th>
  </tr>
  <tr>
    <td></td>
    <td><c:forEach items="${sessionScope.menuPrincipaleMappato}" var="myMap" >
<nav>
<ul class="dropdown">
        	<li class="drop"><a href="<c:out value="${myMap.value}"/>"><c:out value="${myMap.key}"/></a></li>
 </ul>
 </nav>
 </c:forEach></td>
    <td></td>
  </tr>
 
</table> 






 

 

 
  




 

</body>
</html>