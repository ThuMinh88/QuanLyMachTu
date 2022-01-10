<%-- 
    Document   : sidebar-doctor
    Created on : Nov 8, 2021, 7:45:56 AM
    Author     : DAO
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                <div class="sidebar-brand-icon rotate-n-15">
                    <image src="<c:url value="/img/logo_1.png"/>" width="100" height="50" alt="LOGO"/>
                </div>
                <div class="sidebar-brand-text mx-3">DOCTOR <sup>2021</sup></div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
                <a class="nav-link" href="<c:url value="/index-doctor.html"/>">
                    <i class="fas fa-fw fa-file-medical"></i>
                    <span>Lập toa thuốc</span></a>
            </li>
            
            <li class="nav-item active">
                <a class="nav-link" href="<c:url value="/medical_record"/>">
                    <i class="fas fa-fw fa-file-medical"></i>
                    <span>Tra cứu bệnh án</span></a>
            </li>
            
            <li class="nav-item active">
                <a class="nav-link" href="<c:url value="/index-doctor/medicine"/>">
                    <i class="fas fa-fw fa-file-medical"></i>
                    <span>Tra cứu thuốc</span></a>
            </li>

            <!-- Nav Item - Pages Collapse Menu -->
            <!--  <li class="nav-item">
                <a class="nav-link" href="charts.html">
                    <i class="fas fa-fw fa-hospital"></i>
                    <span>Tra cứu Thuốc</span></a>
            </li>
             -->
            <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">

            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>

        </ul>
        <!-- End of Sidebar -->
