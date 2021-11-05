<%-- 
    Document   : register
    Created on : Nov 2, 2021, 4:53:37 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- ======= Login Section ======= -->
<section id="hero" class="d-flex align-items-center">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
            <div class="col-lg-12 d-flex align-items-stretch">
                <div class="sub-main-w3">

                    <c:if test="${errMsg != null}">
                        <div class="alert alert-danger">
                            ${errMsg}
                        </div>
                    </c:if>
                    <c:url value="/register" var="action"/>
                    <div class="wthree-pro">
                        <h2>Đăng kí tài khoản</h2>
                    </div>
                    <form:form action="${action}" method="post" enctype="multipart/form-data" modelAttribute="user">
                        <div class="form-group row">
                          
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <label for="firstname">Họ và tên đệm</label>
                                <input type="text" class="form-control form-control-user" id="firstname" path="firstname"/>
                            </div>
                            <div class="col-sm-6">
                                <label for="lastname">Tên người dùng</label>
                                <input type="text" class="form-control form-control-user" id="lastname" path="lastname"/>
                            </div>
                            
                        </div>
                        <div class="form-group">
                            <label for="username">Tên đăng nhập</label>
                            <input type="username" class="form-control form-control-user"
                                   id="username" path="username" placeholder="Username"/>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <label for="password">Mật khẩu</label>
                                <input type="password" class="form-control form-control-user"
                                       id="password" path="password" placeholder="Password"/>
                            </div>
                            <div class="col-sm-6">
                                <label for="confirm-password">Nhập lại mật khẩu</label>
                                <input type="password" class="form-control form-control-user"
                                       id="confirm-password" path="confirmPassword"  placeholder="Confirm Password"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="avatar">Avatar</label>
                            <input type="file" id="avatar" path="file" class="form-control"/>
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