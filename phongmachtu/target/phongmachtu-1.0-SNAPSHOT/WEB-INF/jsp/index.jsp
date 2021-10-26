<%-- 
    Document   : index.jsp
    Created on : Sep 22, 2021, 2:23:57 PM
    Author     : DAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>


<ul>      
    <j:forEach var="dm" items="${danhmucthuoc}">
    <li> ${dm.idDM} - ${dm.tenDM} </li>
    </j:forEach>
</ul>
