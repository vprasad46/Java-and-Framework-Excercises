<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" import="java.io.*"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<ul>
		<li><a href="bookTicket.do?choice=Customer">Customer</a></li>
		<li><a href="bookTicket.do?choice=Emergency">Emergency</a></li>
		<li><a href="bookTicket.do?choice=VIP">VIP</a></li>
		<li><a href="bookTicket.do?choice=Reserved">Reserved</a></li>
		<li><a href="bookTicket.do?choice=ShopOwner">Shop Owner</a></li>
	</ul>
</body>
</html>