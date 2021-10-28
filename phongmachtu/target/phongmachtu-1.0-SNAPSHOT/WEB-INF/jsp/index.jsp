<%-- 
    Document   : index.jsp
    Created on : Sep 28, 2021, 10:23:57 AM
    Author     : THU
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
                    <tfoot>
                        <tr>
                            <th>Mã</th>
                            <th>Tên thuốc</th>
                            <th>Số lượng</th>
                            <th>Hạn sử dụng</th>
                            <th>Giá bán</th>
                            <th>Loại thuốc</th>
                            <th></th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <j:forEach var="t" items="${thuoc}">
                        <tr>
                            <td>${t.idThuoc}</td>
                            <td>${t.tenThuoc}</td>
                            <td>${t.soLuong}</td>
                            <td>${t.hanSuDung}</td>
                            <td>${t.giaBan}</td>
                            <td>${t.danhMucThuoc}</td>
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


