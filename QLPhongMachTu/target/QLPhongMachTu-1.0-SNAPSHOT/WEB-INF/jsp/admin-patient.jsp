<%-- 
    Document   : admin-patient
    Created on : Oct 30, 2021, 2:57:17 PM
    Author     : ACER
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!-- Begin Page Content -->


<div class="container-fluid">
    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Bảng danh sách</h1>
        
    </div>
    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Hồ sơ bệnh nhân</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <form>
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Họ và tên đệm</th>
                            <th>Tên</th>
                            <th>Bệnh Án</th>
                            <th>Giới tính</th>
                            <th>Năm sinh</th>
                            <th>Số điện thoại</th>
                            <th>Email</th>
                            <th>Địa Chỉ</th> 
                        </tr>
                    </thead>
                    <tbody>
                        <j:forEach var="t" items="${benhnhan}">
                            <tr>
                                <td>${t.idBN}</td>
                                <td>${t.firstname}</td>
                                <td>${t.lastname}</td>
                                <td>${t.trieuChung}</td>
                                <td>${t.gioiTinh}</td>
                                <td>${t.namSinh}</td>
                                <td>${t.sdt}</td>
                                <td>${t.email}</td>
                                <td>${t.diachi}</td>
                            </tr>
                    </j:forEach>
                    </tbody>
                </table>
                </form>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->
