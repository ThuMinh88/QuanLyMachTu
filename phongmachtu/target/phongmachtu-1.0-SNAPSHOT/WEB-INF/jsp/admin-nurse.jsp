<%-- 
    Document   : admin-nurse
    Created on : Oct 30, 2021, 2:55:15 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Bảng danh sách</h1>
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
                            <th>Mô tả</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Mã</th>
                            <th>Tên thuốc</th>
                            <th>Số lượng</th>
                            <th>Hạn sử dụng</th>
                            <th>Giá bán</th>
                            <th>Mô tả</th>
                            <th></th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <tr>
                            <td>Tiger Nixon</td>
                            <td>System Architect</td>
                            <td>Edinburgh</td>
                            <td>61</td>
                            <td>2011/04/25</td>
                            <td>$320,800</td>
                            <td class="align-items-center d-none d-sm-block btn btn-sm btn-primary shadow-sm"><a class = "dropdown-item" href="#"  data-target="#showModal"  data-toggle="modal" role="button">...</a></td>
                        </tr>

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
                                <div class="col-auto mb-4">
                                    <img class="img-profile rounded mx-auto d-block align-items-center" width="50%" src="1.jpg" alt="logo" >
                                </div>
                                <div class="col mr-2">
                                    <div class="text-xs font-weight-bold text-success text-uppercase mb-1">
                                        Loại Thuốc gì đó</div>
                                    <div class="h5 mb-1 font-weight-bold text-gray-800">Tên thuốc</div>
                                </div>
                                <!-- Divider -->
            
                                <div class="col-lg-12 mr-2">
                                    <hr class="sidebar-divider my-0 mb-4">
                                    <div class="text-xs font-weight-bold text-info text-uppercase mb-1">
                                        Số lượng</div>
                                    <div class="h7 mb-4 font-weight-bold text-gray-800">20000</div>
                                </div>
                                <div class="col-lg-12 mr-2">
                                    <div class="text-xs font-weight-bold text-info text-uppercase mb-1">
                                        Giá bán</div>
                                    <div class="h7 mb-4 font-weight-bold text-gray-800">20000đ</div>
                                </div>
                                <div class="col-lg-12 mr-2">
                                    <div class="text-xs font-weight-bold text-info text-uppercase mb-1">
                                        Hạn sử dụng</div>
                                    <div class="h7 mb-4 font-weight-bold text-gray-800">20 năm</div>
                                </div>
                                <div class="col-lg-12 mr-2">
                                    <div class="text-xs font-weight-bold text-info text-uppercase mb-1">
                                        Nhà cung cấp</div>
                                    <div class="h7 mb-4 font-weight-bold text-gray-800">CTY ....</div>
                                </div>
                                <div class="col-lg-12 mr-2">
                                    <div class="text-xs font-weight-bold text-info text-uppercase mb-1">
                                        Mô tả</div>
                                    <div class="h7 mb-4 font-weight-bold text-gray-800">CTY ....</div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>