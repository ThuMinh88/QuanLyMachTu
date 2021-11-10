<%-- 
    Document   : new_user
    Created on : Nov 10, 2021, 12:01:51 AM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %><!DOCTYPE html>

<c:url value="/new_user" var="action"/>
<form:form action = "${action}" enctype="multipart/form-data" method="post" modelAttribute="user" cssClass="row form-group col-xl-4 ">
                <div class="form-group col-sm-4">
                    <div>
                        <label for="ho">User<span class="text-danger">*</span></label>
                        <form:input type="text" path="username" value="yta" cssClass="form-control" />
                        <form:errors type="text" path="username" cssClass="text-danger" element="div"/>
                    </div>
                    <div class="my-4">
                        <label for="ten">Pass<span class="text-danger">*</span></label>
                        <form:input type="text" path="password" value="123" cssClass="form-control" />
                        <form:errors type="password" path="password"  cssClass="text-danger" element="div"/>
                    </div>
                    
                    <div class="form-group col-sm-4">
                        <input type="submit" class="btn btn-danger" id="btnClick" onclick="btnClick();">
                    </div>
                </div></form:form>