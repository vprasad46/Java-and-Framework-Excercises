<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<html:form action="InputAction" >
			<html:select property="country" >
				<html:option value="0">Select Country</html:option>
			
			</html:select>
			
			<html:select property="state" >
				<html:option value="0">Select State</html:option>
				
			</html:select>
			<html:submit property="method">save</html:submit>
		</html:form>
		
</body>
</html>