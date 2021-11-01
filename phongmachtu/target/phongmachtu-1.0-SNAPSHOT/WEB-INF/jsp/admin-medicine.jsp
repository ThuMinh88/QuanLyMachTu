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
    <h1 class="h3 mb-2 text-gray-800">Danh sách</h1>
    <p class="mb-4">Danh sách các loại thuốc trong kho</p>

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
                            <th></th>
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
                            <td class="align-items-center d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" role="button">...</td>
                        </tr>
                        </j:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->
<!-- Showall Modal -->
    <div class="modal fade" id="showModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Chi tiết thông tin</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>

                <div class="col-xl-12 mb-4">
                    <div class="card border-left-success shadow h-100 py-2">
                        <div class="card-body">
                            <div class="row no-gutters text-center">
<!--                                <div class="col-auto mb-4">
                                    <img class="img-profile rounded mx-auto d-block align-items-center" width="50%" src="1.jpg" alt="logo" >
                                </div>-->
                                <j:forEach var="t" items="${thuoc}">
                                <div class="col mr-2">
                                    <div class="text-xs font-weight-bold text-success text-uppercase mb-1">
                                        Loại Thuốc gì đó</div>
                                    <div class="h5 mb-1 font-weight-bold text-gray-800">${t.tenThuoc}</div>
                                </div>
                                <!-- Divider -->
            
                                <div class="col-lg-12 mr-2">
                                    <hr class="sidebar-divider my-0 mb-4">
                                    <div class="text-xs font-weight-bold text-info text-uppercase mb-1">
                                        Số lượng</div>
                                    <div class="h7 mb-4 font-weight-bold text-gray-800">${t.soLuong}</div>
                                </div>
                                <div class="col-lg-12 mr-2">
                                    <div class="text-xs font-weight-bold text-info text-uppercase mb-1">
                                        Giá bán</div>
                                    <div class="h7 mb-4 font-weight-bold text-gray-800">${t.giaBan}</div>
                                </div>
                                <div class="col-lg-12 mr-2">
                                    <div class="text-xs font-weight-bold text-info text-uppercase mb-1">
                                        Hạn sử dụng</div>
                                    <div class="h7 mb-4 font-weight-bold text-gray-800">${t.hanSuDung}</div>
                                </div>
                                <div class="col-lg-12 mr-2">
                                    <div class="text-xs font-weight-bold text-info text-uppercase mb-1">
                                        Nhà cung cấp</div>
                                    <div class="h7 mb-4 font-weight-bold text-gray-800">CTY ....</div>
                                </div>
                                <div class="col-lg-12 mr-2">
                                    <div class="text-xs font-weight-bold text-info text-uppercase mb-1">
                                        Mô tả</div>
                                    <div class="h7 mb-4 font-weight-bold text-gray-800">${t.moTa}</div>
                                </div>
                                </j:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
