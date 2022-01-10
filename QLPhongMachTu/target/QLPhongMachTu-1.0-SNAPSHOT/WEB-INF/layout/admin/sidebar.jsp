<%-- 
    Document   : sidebar
    Created on : Oct 28, 2021, 10:26:03 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Sidebar -->
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

    <!-- Sidebar - Brand -->
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<c:url value="/admin/index"/>">
        <div class="sidebar-brand-icon">
            <image src="<c:url value="/img/logo_1.png"/>" width="100" height="50" alt="LOGO"/>
        </div>
        <div class="sidebar-brand-text mx-2 my-2">Admin<sup>2021</sup></div>
    </a>

    <!-- Divider -->
    <hr class="sidebar-divider my-0">

    <!-- Nav Item - Dashboard -->
    <li class="nav-item active">
        <a class="nav-link" href="<c:url value="/admin/index"/>">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Bảng điều kiển</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <div class="sidebar-heading">
        Hồ sơ
    </div>

    <!-- Nav Item - ListU Collapse Menu -->
    <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
            aria-expanded="true" aria-controls="collapseUtilities">
            <i class="fas fa-fw fa-list-alt"></i>
            <span>Danh sách</span>
        </a>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
            data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                <h6 class="collapse-header">Danh sách người dùng:</h6>
                <a class="collapse-item" href="<c:url value="/admin/patient" />">Bệnh nhân</a>
                <a class="collapse-item" href="<c:url value="/admin/doctor" />">Bác sĩ</a>
                <a class="collapse-item" href="<c:url value="/admin/nurse" />">Y tá</a>
                <a class="collapse-item" href="<c:url value="/admin/medicine" />">Thuốc</a>
            </div>
        </div>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <div class="sidebar-heading">
        Tiện ích
    </div>

    <!-- Nav Item - Pages Collapse Menu -->
    <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages"
            aria-expanded="true" aria-controls="collapsePages">
            <i class="fas fa-fw fa-calendar-times"></i>
            <span>Sắp lịch trực</span>
        </a>
        <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                <a class="collapse-item" href="<c:url value="/admin/doctor-schedule"/>">Bác sĩ</a>
                <a class="collapse-item" href="register.html">Y tá</a>
            </div>
        </div>
    </li>
<!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Nav Item - Charts -->
    <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
            <i class="fas fa-fw fa-chart-area"></i>
            <span>Báo cáo</span>
        </a>
            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                 <a class="collapse-item" href="<c:url value="/admin/report/patient" />">Thống kê bệnh nhân</a>
                <a class="collapse-item" href="<c:url value="/admin/report/bill"/>">Báo cáo doanh thu</a>
            </div>
        </div>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider d-none d-md-block">

    <!-- Sidebar Toggler (Sidebar) -->
    <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
    </div>

</ul>
<!-- End of Sidebar -->
