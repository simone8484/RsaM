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
   <td></td>
   <td><h3>Nome Reparto:</h3> <c:out value="${repartoCorrente.nome}"/>
       <h3>Tipologia Reparto:</h3> <c:out value="${repartoCorrente.tipologia}"/>
       <h3>Posizione Reparto:</h3> <c:out value="${repartoCorrente.collocazioneFisica}"/>
       <h3>Numero Stanze Singole Disponibili:</h3> <c:out value="${repartoCorrente.numeroStanzeSingoleDisponibili}"/>
       <h3>Numero Stanze Doppie Disponibili:</h3> <c:out value="${repartoCorrente.numeroStanzeDoppieDisponibili}"/>
            <c:out value="${q}"/>
   </td>
   <td>

   <h3>Associa un responsabile al reparto</h3>
   <h5>visualizza la lista dei medici a seconda della qualifica scelta. Dopo aver scelto il medico clicca su associa medico per selezionare il responsabile reparto</h5>
   
   <form method="POST" action="GestioneStrutturaHandler.do?action=visualizzaListaMedici">
  <select name="qualifica">
  <option></option>
  <option value="Geriatria">Geriatria</option>
  <option value="Psichiatria">Psichiatria</option>
  <option value="Cardiologo">cardiologo</option>
  </select> 
    <input type="submit" value="Visualizza Lista Medici">
    </form>
   
    <form method="POST" action="GestioneStrutturaHandler.do?action=selezionaResponsabileReparto">
    <c:forEach items="${sessionScope.listaMediciQualifica}" var="listaMedici" >
 
    <br>
     <input type="radio" name="responsabileReparto" value="<c:out value="${listaMedici.getCodiceFiscale()}"/>">  <c:out value="${listaMedici.getNome()}"/>&nbsp<c:out value="${listaMedici.getCognome()}"/><br>

     </c:forEach>
          <input type="submit" value="Aggiorna Repaonsabile Reparto">
     </form>
     
     
     
   </td>
 </tr>
  </table>
     
</body>
</html>