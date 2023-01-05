<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "com.nttdata.tomcat.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FP DUAL - NTT DATA - JSP - CLS</title>
</head>
<body>
	<h1> ¡FELIZ AÑO NUEVO! </h1>
	
	<%
	
	for(int i=0; i<=10; i++){
		
		out.println("A la de..." + i);
		
	}
	
	%>
	
	<p><%= NTTDataJSP.helloNTTDataDual("Proyecto 2021-2023") %>
</body>
</html>