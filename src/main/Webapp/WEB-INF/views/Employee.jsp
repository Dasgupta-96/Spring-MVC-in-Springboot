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

<form action="save" method="post">

<table>
    <tr>
       <td>Name:</td>
       <td><input type="text" name="name"></td>
    </tr>
    
    <tr>
       <td>City:</td>
       <td><input type="text" name="city"></td>
    </tr>
    
    <tr>
       <td>Email:</td>
       <td><input type="text" name="email"></td>
    </tr>
    
    <tr>
       <td>State:</td>
       <td><input type="text" name="state"></td>
    </tr>

  <tr>
       <td>Phone:</td>
       <td><input type="text" name="phone"></td>
    </tr>
    
      <tr>
      
       <td><input type="submit">
    </tr>

</table>


</form>
  
  ${x}

</body>
</html>