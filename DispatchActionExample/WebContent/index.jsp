<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib uri="/WEB-INF/struts-bean.tld" prefix= "bean"%>
<html>
<head>
<script type="text/javascript">
</script>
</head>
<body>
<html:form action="CustomAction" >
<table>
<tr>
    <td>
        <bean:write name="CustomForm" property="message" />
    </td>
</tr>
<tr>
    <td>
        <html:submit property="method"><bean:message key="User.add"/></html:submit>
        <html:submit property="method"><bean:message key="User.delete"/></html:submit>
        <html:submit property="method"><bean:message key="User.update"/></html:submit>
    </td>
</tr>
</table>
</html:form>
</body>
</html>