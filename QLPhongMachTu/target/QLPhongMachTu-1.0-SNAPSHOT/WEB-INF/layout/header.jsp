<%-- 
    Document   : header
    Created on : Nov 2, 2021, 11:23:57 AM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- ======= Top Bar ======= -->
<div id="topbar" class="d-none d-lg-flex align-items-center fixed-top">
    <image class="fixed-top" src="<c:url value="/img/logo.png"/>" width="200" height="100" alt="LOGO"/>
    <div class="container d-flex">
        <div class="contact-info mr-auto">
            <i class="icofont-envelope"></i> <a href="mailto:otc@example.com">otc@example.com</a>
            <i class="icofont-phone"></i> +84 1600 0001 
            <i class="icofont-google-map"></i> 371, Nguyễn Kiệm, Gò vấp
        </div>
        <div class="social-links">
            <a href="#" class="twitter"><i class="icofont-twitter"></i></a>
            <a href="#" class="facebook"><i class="icofont-facebook"></i></a>
            <a href="#" class="instagram"><i class="icofont-instagram"></i></a>
            <a href="#" class="skype"><i class="icofont-skype"></i></a>
            <a href="#" class="linkedin"><i class="icofont-linkedin"></i></i></a>
        </div>
    </div>
</div>
<!-- ======= Header ======= -->
<header id="header" class="fixed-top">
    <div class="container d-flex align-items-center">

        <h1 class="logo mr-auto"><a href="<c:url value="/"/><img src="<c:url value="/img/logo.png" var="images"/>" width="100%" alt="logo"></a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="index.html" class="logo mr-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

        <nav class="nav-menu d-none d-lg-block">
            <ul>
                <li class="active"><a href="<c:url value="/"/>">Trang chủ</a></li>
                <li><a href="<c:url value="/about"/>">Về chúng tôi</a></li>
                <li><a href="#services">Dịch vụ</a></li>
                <li><a href="#departments">Các phòng ban</a></li>
                <li><a href="#doctors">Bác sĩ</a></li>
                <li><a href="<c:url value="/contact"/>">Liên hệ</a></li>
            </ul>

        </nav><!-- .nav-menu -->
        <c:if test="${pageContext.request.userPrincipal.name == null}">

            <a href="<c:url value="/login"/>" class="appointment-btn">
                <i class="icofont-user" aria-hidden="true"></i> Đăng kí</a>
            </c:if>

        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <c:if test="${pageContext.request.isUserInRole('USER')}">
                <nav class="nav-item">
                <a href="<c:url value="/appointment"/>" class="appointment-btn">Đăng kí khám</a>
            </nav>
            </c:if>
            
            <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
                <nav class="nav-item">
                <a href="<c:url value="/admin/index"/>" class="appointment-btn">ADMIN</a>
            </nav>
            </c:if>
            <c:if test="${pageContext.request.isUserInRole('NURSE')}">
                <nav class="nav-item">
                <a href="<c:url value="/index-nurse"/>" class="appointment-btn">Y TÁ</a>
            </nav>
            </c:if>
            
            
            <c:if test="${pageContext.request.isUserInRole('DOCTOR')}">
                <nav class="nav-item">
                <a href="<c:url value="/index-doctor"/>" class="appointment-btn">BÁC SĨ</a>
            </nav>
            </c:if>
            <nav class="nav-item">
                
            </nav>
            <nav class="nav-item">
                <a href="#" class="nav-link text-success">
                    <c:if test="${currentUser.avatar != null}">
                        <img style="width:30px;" src="${currentUser.avatar}" class="rounded-circle" />
                    </c:if>
                    <c:if test="${currentUser.avatar == null}">
                        <i class="icofont-user" aria-hidden="true"></i>
                    </c:if>
                    ${pageContext.request.userPrincipal.name}
                </a>
            </nav>
            <!--<nav class="nav-item">-->
                <a href="<c:url value="/logout" />" class="nav-link text-success">
                    <i class="icofont-logout"></i>
                </a>
            <!--</nav>-->
            
        </c:if>
    </div>
</header><!-- End Header -->

