<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ page import = "org.apache.struts.action.*" %>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table cellpadding="2" cellspacing="2" border="1">
    <tr>
        <th>
        	Id
        </th>
        <th>
        	Name
        </th>
    </tr>
    <logic:iterate id="data" name="LoginForm" property="list">
        <tr>
            <td>
            	<bean:write name="data" property="id" />
            </td>
            <td>
            	<bean:write name="data" property="name" />
            </td>
        </tr>
    </logic:iterate>
</table>
</body>
</html>