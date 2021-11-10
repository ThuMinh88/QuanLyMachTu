<%-- 
    Document   : admin-medicine
    Created on : Oct 29, 2021, 4:36:25 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-end mb-4 ">
        <a href="<j:url value="/create-medicine"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Thêm thuốc mới</a>
        
        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Chỉnh sửa</a>
    </div>
    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Danh sách thuốc</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Mã</th>
                            <th>Tên thuốc</th>
                            <th>Số lượng</th>
                            <th>Hạn sử dụng</th>
                            <th>Giá bán</th>
                            <th>Loại thuốc</th>
                            <th>Nhà cung cấp</th>
                            <th>Mô tả</th>
                        </tr>
                    </thead>
                    <tbody>
                        <j:forEach var="t" items="${thuoc}">
                            <tr>
                                <td>${t.idThuoc}</td>
                                <td>${t.tenThuoc}</td>
                                <td>${t.soLuong}</td>
                                <td>${t.hanSuDung}</td>
                                <td>${t.giaBan}</td>
                                <td>${t.danhMucThuoc.tenDM}</td>
                                <td>${t.nhaCungCap.tenNCC}</td>
                                <td>${t.moTa}</td>
                                <!--<td class="align-items-center d-none d-sm-block btn btn-sm btn-primary shadow-sm"><a class = "dropdown-item" href="#showModal"  data-toggle="modal" role="button">...</a></td> --> 
                            </tr>
                        </j:forEach>

                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->
