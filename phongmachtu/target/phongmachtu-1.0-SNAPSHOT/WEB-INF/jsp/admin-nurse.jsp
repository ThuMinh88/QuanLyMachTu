<%-- 
    Document   : admin-nurse
    Created on : Oct 30, 2021, 2:55:15 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<!-- Begin Page Content -->


<div class="container-fluid">
    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Bảng danh sách</h1>
        <a href="#showModal" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"
           data-toggle="modal" role="button"> Chỉnh sửa</a>
    </div>
    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Danh sách Y tá</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Họ và tên đệm</th>
                            <th>Tên</th>
                            <th>Giới tính</th>
                            <th>Năm sinh</th>
                            <th>Chức vụ</th>
                            <th>Bằng cấp</th>
                            <th>Kinh nghiệm</th>
                            <th>Số điện thoại</th>
                            <th>Email</th>
                            <th>Địa Chỉ</th> 
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <j:forEach var="t" items="${yta}">
                            <tr>
                                <td>${t.idYT}</td>
                                <td>${t.hoYTa}</td>
                                <td>${t.tenYta}</td>
                                <td>${t.gioiTinh}</td>
                                <td>${t.namSinh}</td>
                                <td>${t.chucVu}</td>
                                <td>${t.bangCap}</td>
                                <td>${t.kinhNghiem}</td>
                                <td>${t.sdt}</td>
                                <td>${t.email}</td>
                                <td>${t.diaChi}</td> 
                                <td class="align-items-center d-none d-sm-block btn btn-sm btn-primary shadow-sm" role="button">Xóa</a></td>
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
                <h5 class="modal-title" id="exampleModalLabel">Thêm thông tin</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>

            <div class="col-xl-12 mb-4">
                <div class="card border-left-success shadow h-100 py-2">
                    <div class="card-body">
                        <div class="row no-gutters align-items-center">
                            <form:form method="post" enctype="multipart/form-data" modelAttribute="yta" class="form-group col-xl-12 ">
                                <div>
                                    <label for="ho">Họ và tên đệm<span class="text-danger">*</span></label>
                                    <form:input id="hoYTa" path="hoYTa" class="form-control"/>
                                </div>
                                <div class="my-4">
                                    <label for="ten">Tên Y Tá<span class="text-danger">*</span></label>
                                    <form:input id="tenYta" path="tenYta" class="form-control"/>
                                </div>
                                <div>
                                    <label for="sex">Giới tính<span class="text-danger">*</span></label>
                                    <form:input id="gioiTinh" path="gioiTinh" class="form-control"/>
                                </div>
                                <div class="my-4">
                                    <label for="date">Ngày sinh<span class="text-danger">*</span></label>
                                    <form:input id="namSinh" path="namSinh" class="form-control"/>
                                </div>
                                <div class="my-4">
                                    <label for="sdt">Số điện thoại<span class="text-danger">*</span></label>
                                    <form:input id="sdt" path="sdt" class="form-control"/>
                                </div>
                                <div>
                                    <label for="email">Email<span class="text-danger">*</span></label>
                                    <form:input id="email" path="email" class="form-control"/>
                                </div>
                                <div class="my-4">
                                    <label for="address">Địa chỉ<span class="text-danger">*</span></label>
                                    <form:input id="diaChi" path="diaChi" class="form-control"/>
                                </div>
                                <div>
                                    <label for="cv">Chức vụ<span class="text-danger">*</span></label>
                                    <form:input id="diaChi" path="chucVu" class="form-control"/>
                                </div>
                                <div class="my-4">
                                    <label for="bang">Bằng cấp<span class="text-danger">*</span></label>
                                    <form:input id="bangCap" path="bangCap" class="form-control"/>
                                </div>
                                <div>
                                    <label for="knghiem">Kinh nghiệm</label>
                                    <form:input id="kinhNghiem" path="kinhNghiem" class="form-control"/>
                                </div>
                            
                            <input type="submit" class="btn btn-primary"></input>
                        </form:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
 