<%-- 
    Document   : admin
    Created on : Nov 11, 2021, 10:23:06 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <header>
        <div class="ogo-box">
            <img src="<c:url value="/img/logo.png"/>" class="logo" alt="logo">
        </div>
        <div class="text-box">
            <h3 class="heading-primary">
                <span class="heading-primary__sub mb-4">Quản lý</span>
                <span class="heading-primary__main">PHÒNG MẠCH OTC</span>
                
            </h3>
            <div class="row align-content-center">
                <div class="col-xl-4 col-md-6 mb-4"><a href="<c:url value="/admin/index" />" class=" btn btn-white btn-animated">ADMIN</a></div>
                
                <div class="col-xl-4 col-md-6 mb-4"><a href="<c:url value="/admin/index-doctor" />" class="btn btn-white btn-animated">BÁC SĨ</a></div>
                
                <div class="col-xl-4 col-md-6 mb-4"><a href="<c:url value="/admin/index-nurse" />" class="btn btn-white btn-animated">Y Tá</a></div>
                
            </div>
            
        </div>
    </header>
    <footer class="sticky-footer bg-white">
        <div class="container my-auto">
            <div class="copyright text-center my-auto">
                <span>Copyright &copy;2021 Đồ án tốt nghiệp Phạm Anh Đào - Nguyễn Hoàng Minh Thư</span>
            </div>
        </div>
</footer>
