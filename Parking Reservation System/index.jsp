<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insert page="/baseLayout.jsp" flush="true">
    <tiles:put name="title" value="Parking Reservation System" />
    <tiles:put name="header" value="/header.jsp" />
    <tiles:put name="menu" value="/choiceform.jsp" />
    <tiles:put name="body" value="/body.jsp" />
</tiles:insert>