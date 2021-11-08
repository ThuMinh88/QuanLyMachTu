<%-- 
    Document   : doctor-index
    Created on : Nov 8, 2021, 12:22:48 AM
    Author     : DAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
 <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="align-items-center justify-content-between mb-4">
                        <!-- Nested Row within Card Body -->
                        <div class="col-lg-12 mb-4">
                            <div class="text-center">
                                <h1 class="h4 font-weight-bold text-primary text-uppercase mb-4">Lập toa thuốc</h1>
                            </div>
                            <div class="user row col-sm-12 ">
                                <div class="form-group col-sm-4">
                                    <div class="heading mb-2">Nhập mã ID bệnh nhân: </div>
                                    <div class="input-group  mb-2">
                                        <input type="text"
                                            class="form-control border-info col-sm-3 bg-light border-2 small"
                                            placeholder="ID" aria-label="Search" aria-describedby="basic-addon2" >
                                        <div class="input-group-append">
                                            <button class="btn btn-primary" type="button">
                                                <i class="fas fa-search fa-sm"></i>
                                            </button>
                                        </div>
                                    </div>
                                    <div class="mb-2">
                                        <input type="none" class="form-control form-control-user"
                                            placeholder="Họ và tên bệnh nhân"disabled>
                                    </div>
                                </div>
                                <div class= "form-group col-sm-4">
                                    <div class="heading mb-2">Triệu chứng: </div>
                                    <div class="mb-2">
                                        <input type="none" class="form-control form-control-user">
                                    </div>
                                    <div class="heading mb-2">Chuẩn đoán: </div>
                                    <div class="mb-2">
                                        <input type="none" class="form-control form-control-user">
                                    </div>
                                </div>
                                
                            </form>
                            <div class= "form-group col-sm-4">
                                    <div class="col-lg-12 mb-4">
                                        <div class="card bg-primary text-white shadow">
                                            <div class="card-body mx-3">
                                                <h3 class="">Phòng mạch tư OTC</h3>
                                                <div class="text-white-50 small">Hotline: +84 1600 0001</div>
                                                <div class="text-white-50 small">Địa chỉ: 371, Nguyễn Kiệm, Gò vấp</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </div>
                        <form action="">
                            <table class="table table-bordered" width="100%" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th>Mã</th>
                                        <th>Tên thuốc</th>
                                        <th>Mô tả</th>
                                        <th>Giá</th>
                                        <th>Số lượng</th>
                                        <th>Liều lượng</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Tiger Nixon</td>
                                        <td>System Architect</td>
                                        <td>Edinburgh</td>
                                        <td>$320,800</td>
                                        <td><div class="form-group">
                                            <input type="number" 
                                                   class="form-control" />
                                        </div></td>
                                        <td>
                                            <input type="text"class="form-control"/>
                                        </td>
                                        <td><button type="submit" class="btn btn-primary">Xóa</button></td>
                                    </tr>

                                </tbody>
                            </table>
                        </form>
                        
                        <div class="form-group">
                            <div class="custom-control custom-checkbox small">
                                <input type="checkbox" class="custom-control-input" id="customCheck">
                                <label class="custom-control-label" for="customCheck">Remember
                                    Me</label>
                            </div>
                        </div>
                        </form>
                    </div>
                    <div class="col-sm-2 mb-4">
                        <a href="#" class="btn btn-danger btn-user btn-block">
                            DONE
                        </a>
                    </div>
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
