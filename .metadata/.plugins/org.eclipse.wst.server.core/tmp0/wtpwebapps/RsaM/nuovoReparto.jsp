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
    <th width="1000"><h1>Rsa Managment</h1></th>
    <th><c:out value="${user}"/></th>
  </tr>
  <tr>
    <td></td>
    <td width="1000"><c:forEach items="${sessionScope.menuPrincipaleMappato}" var="myMap" >
<nav>
<ul class="dropdown">
        	<li class="drop"><a href="<c:out value="${myMap.value}"/>"><c:out value="${myMap.key}"/></a></li>
 </ul>
 </nav>
 </c:forEach></td>
    <td></td>
  </tr>
  
  <tr>
    <th></th>
    <th><h2>Inserisci nuovo Reparto</h2>
  <form method="POST" action="GestioneStrutturaHandler.do?action=creaReparto">
   Nome:<br>
  <input type="text" name="nome"><br>
   Tipologia:<br>
  <input type="text" name="tipologia"><br>
   Collocazione Fisica:<br>
  <input type="text" name="collocazioneFisica"><br>
   Numero Stanze Singole:<br>
  <input type="text" name="numeroStanzeSingole"><br>
     Numero Stanze Doppie:<br>
  <input type="text" name="numeroStanzeDoppie"><br>
    <input type="submit" value="Submit">
</form> 
</div></th>
    <th></th>
  </tr>
  
</body>
</html>