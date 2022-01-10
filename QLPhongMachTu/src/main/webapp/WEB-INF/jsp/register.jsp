<%-- 
    Document   : register
    Created on : Nov 2, 2021, 4:53:37 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/register" var="action"/>
<!-- ======= Login Section ======= -->
<section id="hero" class="d-flex align-items-center">
    <div class="container">
        <div class="col-xl-5">
            <div class="border-0 shadow-lg">
                <div class="p-5">
                    <div class="text-center">
                        <h1 class="h4 text-gray-600 mb-4">Đăng Kí</h1>
                    </div>
                    <form:form action="${action}" method="POST" enctype="multipart/form-data" modelAttribute="taikhoan">
                        <form:errors path="*" class="alert alert-danger" element="div"/>
               
                        
                        <div class="form-group">
                            <label for="username">Tên đăng nhập</label>
                            <form:input type="username" class="form-control form-control-user"
                                        id="username" path="username"/>
                            <form:errors path="username" class="text-danger" element="div"/>

                        </div>
                        <div class="form-group row">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <label for="password">Mật khẩu</label>
                                <form:input type="password" class="form-control form-control-user"
                                            id="password" path="password" />
                                <form:errors path="password" class="alert alert-danger" element="div"/>

                            </div>
                            <div class="col-sm-6">
                                <label for="confirm-password">Nhập lại mật khẩu</label>
                                <form:input type="password" class="form-control form-control-user"
                                            id="confirm-password" path="confirmPassword"/>
                                <form:errors path="confirmPassword" class="alert alert-danger" element="div"/>

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="avatar">Avatar</label>
                            <form:input type="file" id="avatar" path="file" class="form-control"/>
                        </div>
                        <div class="pom-agile">

                        </div>

                        <div class="form-group">
                            <c:if test="${pageContext.request.userPrincipal.name == null}">
                                <div class="sub-w3l">
                                    <h6><a href="<c:url value="/login"/>" class="text-gray-500">Đã có tài khoản?</a></h6>

                                </div></c:if>
                                <div class="align-items-center">
                                    <input type="submit" value="Đăng kí" class="btn btn-danger btn-user btn-block">
                                </div>
                            </div>
                    </form:form>
                <hr>
                </div>
            </div>
        </div>
    </div>
</section><!-- End Hero -->