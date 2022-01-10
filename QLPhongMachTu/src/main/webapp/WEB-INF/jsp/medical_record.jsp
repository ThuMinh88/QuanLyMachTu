<%-- 
    Document   : medical_record
    Created on : Nov 15, 2021, 3:19:07 PM
    Author     : DAO
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<div class="container-fluid">
    <div class="align-items-center justify-content-between mb-4">
        <!-- Nested Row within Card Body -->
        <div class="col-lg-12 mb-4">
            <div class="text-center">
                <h1 class="h4 font-weight-bold text-primary text-uppercase mb-4">Hồ Sơ Bệnh Nhân</h1>
            </div>
            <div class="card shadow mb-4">
                <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary">Danh sách bệnh nhân</h6>
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <form>
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Họ và tên </th>
                                        <th>Bệnh Án</th>
                                        <th>Giới tính</th>
                                        <th>Năm sinh</th>
                                        <th>Số điện thoại</th>
                                        <th>Email</th>
                                        <th>Địa Chỉ</th> 
                                    </tr>
                                </thead>
                                <tbody>
                                    <j:forEach var="x" items="${benh}">
                                        <tr>
                                            <td>${x.bn_id.idBN}</td>
                                            <td>${x.bn_id.firstname} ${x.bn_id.lastname}</td>
                                            <td>${x.bn_id.trieuChung}</td>
                                            <td>${x.bn_id.gioiTinh}</td>
                                            <td>${x.bn_id.namSinh}</td>
                                            <td>${x.bn_id.sdt}</td>
                                            <td>${x.bn_id.email}</td>
                                            <td>${x.bn_id.diachi}</td>
                                        </tr>
                                    </j:forEach>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
</div>