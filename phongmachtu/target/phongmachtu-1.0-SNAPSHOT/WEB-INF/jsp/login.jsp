<%-- 
    Document   : login
    Created on : Nov 2, 2021, 11:29:28 AM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- ======= Login Section ======= -->

<section id="hero" class="d-flex align-items-center">
    <div class="container">
        <div class="col-lg-12 d-flex align-items-stretch">
            <div class="sub-main-w3">
                <div class="wthree-pro">
                    <h2>Đăng nhập</h2>
                    <c:if test="${param.error != null}">
                        <div class="alert alert-danger">
                            Da co loi xay ra! Vui long quay lai sau!
                        </div>
                    </c:if>
                    <c:if test="${param.accessDenied != null}">
                        <div class="alert alert-danger">
                            Ban khong co quyen truy cap!!!
                        </div>
                    </c:if>
                </div>
                <c:url value="/login" var="action" />
                <form action="${action}" method="post" class="user">
                    <div class="col-sm-10 pom-agile form-group">
                        <label for="username">Username</label>
                        <input placeholder="Tên đăng nhập" name="username" id="username" class="form-control" type="text" >
                        <span class="icon1"><i class="fa fa-user" aria-hidden="true"></i></span>
                    </div>
                    <div class="pom-agile col-sm-8 form-group">
                        <label for="password">Password</label>
                        <input placeholder="Password" type="password" id="password" name="password" class="form-control">
                        <span class="icon2"><i class="fa fa-unlock" aria-hidden="true"></i></span>
                    </div>
                    <div class="sub-w3l">
                        <h6><a href="<c:url value="/register"/>" class="text-gray-500"">Đăng kí tài khoản</a></h6>
                        <div class="right-w3l form-group">
                            <input type="submit" value="Đăng Nhập">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section><!-- End Hero -->