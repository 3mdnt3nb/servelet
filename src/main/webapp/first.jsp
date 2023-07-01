<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>  
</head>
<body>


	<%! String s="prajwal"; %>
	<h1><%= s %></h1>
	
	<%String k="jsp file is print in web page only"; %>
	<h1><%= k %></h1>
	
	<%!  int []arr={10,20,30,40,50}; %>
	
	<%for(int i=0;i<arr.length;i++) {%>
	<h1><%= arr[i] %></h1>
	<% } %>
			

</body>
</html>