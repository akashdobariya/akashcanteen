<%-- 
    Document   : admin
    Created on : May 28, 2013, 3:32:34 AM
    Author     : akash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
        <%@taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:include page="menuheader.jsp"></jsp:include>
        
      
        welcome,
        <s:property value="uname"></s:property>
        
        <jsp:include page="footer.jsp"></jsp:include>
        
    </body>
</html>
