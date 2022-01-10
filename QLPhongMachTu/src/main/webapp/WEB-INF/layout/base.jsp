<%-- 
    Document   : base
    Created on : Nov 2, 2021, 11:09:36 AM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring"
           uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 

        <title><tiles:insertAttribute name="title" /></title>
        <link href="<c:url value="/img/logo.png"/>" rel="icon">
        <!-- Vendor CSS Files -->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

        <link href="vendor/bootstrap4/css/bootstrap.min.css" rel="stylesheet">
        <link href="vendor/icofont/icofont.min.css" rel="stylesheet">
        <link href="vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="vendor/venobox/venobox.css" rel="stylesheet">
        <link href="vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="vendor/bootstrap-datepicker/css/bootstrap-datepicker.min.css" rel="stylesheet">
        <!-- Template Main CSS File -->
        <!--<link href="css/otc-admin.min.css" rel="stylesheet">-->
        <!--<link href="css/styleLogin.css" rel="stylesheet">-->
        <link href="<c:url value="css/style.css" />" rel="stylesheet">
    <body>

        <!-- HEADER -->
        <tiles:insertAttribute name="header"/>

        <!-- CONTENT -->
        <tiles:insertAttribute name="content"/>

        <!-- Footer -->
        <tiles:insertAttribute name="footer"/>
        <!-- End of Footer -->

        <div id="preloader"></div>
        <a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

        <!-- Vendor JS Files -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap4/js/bootstrap.bundle.min.js"></script>
        <script src="vendor/jquery.easing/jquery.easing.min.js"></script>
        <script src="vendor/php-email-form/validate.js"></script>
        <script src="vendor/venobox/venobox.min.js"></script>
        <script src="vendor/waypoints/jquery.waypoints.min.js"></script>
        <script src="vendor/counterup/counterup.min.js"></script>
        <script src="vendor/owl.carousel/owl.carousel.min.js"></script>
        <script src="vendor/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
        <!-- Template Main JS File -->
        <script src="js/main.js"></script>
        <script src="<c:url value="/js/stats.js" />"></script>
    </body>
</html>