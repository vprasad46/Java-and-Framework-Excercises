<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Parking Reservation System</title>
</head>
<body>
<% 
   if(request.getAttribute("slotNo") != null){
    if((Integer)request.getAttribute("slotNo") > 0)
	 out.println("The booked Slot is F-" + (Integer)request.getAttribute("slotNo"));
    else if((Integer)request.getAttribute("slotNo") < 0)
	 out.println("The booked Slot is B" + (Integer)request.getAttribute("slotNo"));
    else 
    	out.println("Parking Full");
  }
 if(request.getAttribute("change") != null){
	 if(request.getAttribute("fl") != null)
 		out.println("Floor Slots: "+(String)request.getAttribute("fl"));
 	 if(request.getAttribute("bs") != null)
	 out.println("Basement Slots: "+(String)request.getAttribute("bs"));
 }
%>
 <br/>
 <ul>
 	<li> <a href="choice.do?choice=BookTicket">Book Parking Ticket</a></li>
	<li> <a href="choice.do?choice=Checkout">Checkout</a></li>
	<li> <a href="choice.do?choice=Floor">Floor Slots</a></li>
	<li> <a href="choice.do?choice=Basement">Basement Slots</a></li>
</ul>
</body>
</html>