<%-- 
    Document   : admin
    Created on : Nov 11, 2021, 10:23:06 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Phân quyền</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/access.css" rel="stylesheet">
</head>

<body>
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
                <div class="col-xl-4 col-md-6 mb-4"><a href="<c:url value="/admin-index" />" class=" btn btn-white btn-animated">ADMIN</a></div>
                
                <div class="col-xl-4 col-md-6 mb-4"><a href="<c:url value="/doctor-index" />" class="btn btn-white btn-animated">BÁC SĨ</a></div>
                
                <div class="col-xl-4 col-md-6 mb-4"><a href="#" class="btn btn-white btn-animated">Y Tá</a></div>
                
            </div>
            
        </div>
    </header>
</body>

</html>