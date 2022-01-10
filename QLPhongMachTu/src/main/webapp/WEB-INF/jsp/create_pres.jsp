<%-- 
    Document   : create_prescription
    Created on : Dec 19, 2021, 9:23:10 AM
    Author     : ACER
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="align-items-center justify-content-between mb-4">
        <!-- Nested Row within Card Body -->
        <j:url value="/create_pres" var="action"/>
        <form:form action = "${action}" enctype="multipart/form-data" method="post" modelAttribute="cttoathuoc" class="form-group">
            <div class="col-lg-12 mb-4">
                <div class="text-center">
                    <h1 class="h4 font-weight-bold text-primary text-uppercase mb-4">Lập toa thuốc</h1>
                </div>
                <div class="user row col-sm-12 ">
                    
                    <div class= "form-group col-sm-4">
                        <div class="heading mb-2">Triệu chứng: </div>
                        <div class="mb-2">
                            <form:input type="none" path ="ChiTietDonThuoc" class="form-control form-control-user"/>
                        </div>
                        <div class="heading mb-2">Chuẩn đoán: </div>
                        <div class="mb-2">
                            <input type="none" class="form-control form-control-user">
                        </div>
                    </div>

                    </form>
                    
                </div>
            <div class="col-sm-2 mb-4">
                <a href="#" class="btn btn-danger btn-user btn-block">
                    DONE
                </a>
            </div>
        </form:form>
                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Danh sách thuốc</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <form>
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>Mã</th>
                                                <th>Tên thuốc</th>
                                                <th>Mô tả</th>
                                                <th>Số lượng</th>
                                                <th>Chọn thuốc</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <j:forEach var="t" items="${thuoc}">
                                                <tr>
                                                    <td>${t.idThuoc}</td>
                                                    <td>${t.tenThuoc}</td>
                                                    <td>${t.moTa}</td>
                                                    <td>${t.soLuong}</td>
                                                    <td><button type="submit" class="btn btn-primary">Chọn</button></td>
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
            </div>
            <!-- End of Main Content -->