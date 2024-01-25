<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ include file="menue.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updateEmp" method="post">

<table>
<input type="hidden" name="id" value="${r.id}">
    <tr>
       <td>Name:</td>
       <td><input type="text" name="name" value="${r.name}"></td>
    </tr>
    
    <tr>
       <td>City:</td>
       <td><input type="text" name="city" value="${r.city}"></td>
    </tr>
    
    <tr>
       <td>Email:</td>
       <td><input type="text" name="email" value="${r.email}"></td>
    </tr>
    
    <tr>
       <td>State:</td>
       <td><input type="text" name="state" value="${r.state}"></td>
    </tr>

  <tr>
       <td>Phone:</td>
       <td><input type="text" name="phone" value="${r.phone}"></td>
    </tr>
    
      <tr>
      
       <td><input type="submit" value="update"></td>
    </tr>

</table>


</form>
  
 

</body>
</html>