<%-- 
    Document   : header
    Created on : Oct 26, 2021, 12:10:47 PM
    Author     : DAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="/">Trang chu</a>
    </li>
    <j:forEach var="dm" items="${danhmucthuoc}" >
    <li class="nav-item">
      <a class="nav-link" href="#">${dm.tenDM}</a>
    </li>
    </j:forEach>
  </ul>
</nav> 
