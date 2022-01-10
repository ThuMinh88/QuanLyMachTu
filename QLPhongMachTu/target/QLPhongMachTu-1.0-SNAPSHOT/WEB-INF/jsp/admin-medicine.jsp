<%-- 
    Document   : admin-medicine
    Created on : Oct 29, 2021, 4:36:25 PM
    Author     : ACER
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-end mb-4 ">
        <a href="<j:url value="/admin/create-medicine"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Thêm thuốc mới</a>
    </div>
    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3  d-sm-flex">
            <h5 class="m-0 font-weight-bold text-primary col-sm-4">Danh sách thuốc</h6>
            <form action ="" class="form-inline mr-auto w-100 navbar-search">
                <div class="input-group">
                    <input type="text" class="form-control bg-light border-1 small"
                           placeholder="Search for..."  name = "kw">
                    <div class="input-group-append">
                        <input class="btn btn-primary" type="submit" aria-label="Search" value="Tìm kiếm"
                                            aria-describedby="basic-addon2">
                    </div>
                </div>
            </form>

        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Mã</th>
                            <th>Tên thuốc</th>
                            <th>Số lượng</th>
                            <th>Ngày nhập hàng</th>
                            <th>Hạn sử dụng</th>
                            <th>Giá bán</th>
                            <th>Loại thuốc</th>
                            <th>Nhà cung cấp</th>
                            <th>Mô tả</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <j:forEach var="t" items="${thuoc}">
                            <tr>
                                <td>${t.idThuoc}</td>
                                <td>${t.tenThuoc}</td>
                                <td>${t.soLuong}</td>
                                <td>${t.ngayNhap}</td>
                                <td>${t.hansudung}</td>
                                <td>${t.giaBan}</td>
                                <td>${t.danhMucThuoc.tenDM}</td>
                                <td>${t.nhaCungCap.tenNCC}</td>
                                <td>${t.moTa}</td>
                                <td class="align-items-center d-none d-sm-block btn btn-sm btn-primary shadow-sm">
                                    <a style="color: #ffffff;" href="${pageContext.request.contextPath}/admin/medicine/deleted/${t.idThuoc}" onclick="return  confirm('Bạn chắc chắn xóa?')"><i class="fas fa-trash fa-tachometer-alt"></i></a> 
                            </tr>
                        </j:forEach>

                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->
