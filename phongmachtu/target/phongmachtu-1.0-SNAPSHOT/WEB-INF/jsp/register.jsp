<%-- 
    Document   : register
    Created on : Nov 2, 2021, 4:53:37 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" 
           uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/register" var="action"/>
<!-- ======= Login Section ======= -->
<section id="login" class="d-flex align-items-center">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
            <div class="col-lg-12 d-flex align-items-stretch">
                <div class="sub-main-w3">

                    

                    <div class="wthree-pro">
                        <h2>Đăng kí tài khoản</h2>
                    </div>
                    <form:form method="POST" action="${action}" enctype="multipart/form-data" modelAttribute="benhnhan">
                        <c:if test="${errMsg != null}">
                            <div class="alert alert-danger">
                                ${errMsg}
                            </div>
                        </c:if>
                        <div class="form-group row">

                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <label for="firstname">Họ và tên đệm</label>
                                <form:input type="firstname" class="form-control form-control-user" id="firstname" path="firstname"/>
                            </div>
                            <div class="col-sm-6">
                                <label for="lastname">Tên người dùng</label>
                                <form:input type="lastname" class="form-control form-control-user" id="lastname" path="lastname"/>
                            </div>

                        </div>
                    </form:form>

                    <form:form action="${action}" method="POST" enctype="multipart/form-data" modelAttribute="taikhoan">
                        <form:errors path="*" class="alert alert-danger" element="div"/>
               
                        
                        <div class="form-group">
                            <label for="username">Tên đăng nhập</label>
                            <form:input type="username" class="form-control form-control-user"
                                        id="username" path="username" placeholder="Username"/>
                            <form:errors path="username" class="text-danger" element="div"/>

                        </div>
                        <div class="form-group row">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <label for="password">Mật khẩu</label>
                                <form:input type="password" class="form-control form-control-user"
                                            id="password" path="password" placeholder="Password"/>
                                <form:errors path="password" class="alert alert-danger" element="div"/>

                            </div>
                            <div class="col-sm-6">
                                <label for="confirm-password">Nhập lại mật khẩu</label>
                                <form:input type="password" class="form-control form-control-user"
                                            id="confirm-password" path="confirmPassword"  placeholder="Confirm Password"/>
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
                                    <input type="submit" value="Đăng kí" class="btn btn-danger">
                                </div>
                            </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</section><!-- End Hero -->