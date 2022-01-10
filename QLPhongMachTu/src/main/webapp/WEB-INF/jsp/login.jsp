<%-- 
    Document   : login
    Created on : Nov 2, 2021, 11:29:28 AM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<!-- ======= Login Section ======= -->

<section id="hero" class="d-flex align-items-center">
    <div class="container">
        <div class="col-xl-5">
            <div class="border-0 shadow-lg">
                <div class="p-5">
                    <div class="text-center">
                        <h1 class="h4 text-gray-900 mb-4">Đăng nhập</h1>
                    </div>
                    <c:if test="${param.error != null}">
                        <div class="alert alert-danger">
                            Vui lòng nhập lại!
                        </div>
                    </c:if>
                    <c:if test="${param.accessDenied != null}">
                        <div class="alert alert-danger">
                            Bạn không có quyền truy cập!!!
                        </div>
                    </c:if>
                    <c:url value="/login" var="action" />
                    <form:form action="${action}" method="post" modelAttribute="user" class="user">
                        <div class="form-group">
                            <label for="username">Username</label>
                            <form:input path="username" id="username" class="form-control form-control-user" type="text" />
                            <form:errors path="username" cssClass="alert-danger" element="div"/>

                            <span class="icon1"><i class="fa fa-user" aria-hidden="true"></i></span>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <form:input type="password" id="password" path="password" class="form-control form-control-user"/>
                            <form:errors path="password" cssClass="alert-danger" element="div"/>
                            <span class="icon2"><i class="fa fa-unlock" aria-hidden="true"></i></span>
                        </div>
                        <div class="sub-w3l">
                            <h6><a href="<c:url value="/register"/>" class="text-center text-danger">Chưa có tài khoản?</a></h6>
                            <div class="right-w3l form-group">
                                <input type="submit" value="Đăng Nhập" class="btn btn-dark btn-user btn-block">
                            </div>
                        </div>
                    </form:form>
                    <hr>
                </div>
            </div>
        </div>
    </div>
</section><!-- End Hero -->