<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" import="java.io.*"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Parking Ticket - Parking Reservation System</title>
</head>
<body>

 <html:form action="/bookTicket">  
	 <html:radio name="choiceForm2" 
	  property="choice" value="Customer">Customer</html:radio>
	 <html:radio name="choiceForm2" 
	 property="choice" value="Emergency">Emergency</html:radio>
	 <html:radio name="choiceForm2" 
	 property="choice" value="VIP">VIP</html:radio>
	 <html:radio name="choiceForm2" 
	 property="choice" value="Reserved">Reserved</html:radio>
	 <html:radio name="choiceForm2" 
	 property="choice" value="ShopOwner">Shop Owner</html:radio>
 	 <html:submit/>
 </html:form>
</body>
</html>