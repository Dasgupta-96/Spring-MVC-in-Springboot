<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border='5'>
    <tr>
       <th>Name</th>
       <th>City</th>
       <th>Email</th>
       <th>State</th>
       <th>Phone</th>
       <th>Delete</th>
       <th>Update</th>
    </tr>
    
  <c:forEach var="r" items="${res}">
  
  <tr>
       <td>${r.name}</td>
       <td>${r.city}</td>
       <td>${r.email}</td>
       <td>${r.state}</td>
       <td>${r.phone}</td>
       <td><a href="delete?id=${r.id}">delete</a></td>
       <td><a href="update?id=${r.id}">update</a></td>
    </tr>
  
  
  </c:forEach>
    
    

</table>
</body>
</html>