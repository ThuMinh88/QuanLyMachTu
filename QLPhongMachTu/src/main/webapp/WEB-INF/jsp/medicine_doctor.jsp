<%-- 
    Document   : medicine_doctor
    Created on : Dec 23, 2021, 11:36:09 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container-fluid">
    <div class="align-items-center justify-content-between mb-4">
        <div class="card shadow mb-4">
            <div class="card-header py-3  d-sm-flex">
                <h6 class="m-0 font-weight-bold text-primary col-sm-4">Danh sách thuốc</h6>

            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
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

                            </tr>
                        </j:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>