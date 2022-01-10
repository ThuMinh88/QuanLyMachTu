<%-- 
    Document   : index-nurse
    Created on : Nov 8, 2021, 4:49:19 PM
    Author     : ACER
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- Begin Page Content -->
<div class="container-fluid">
    <!-- DataTales  -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Danh sách đơn đăng kí chưa xác nhận</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <form>
                    <table class="table table-bordered" id="dataTableDK" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Mã</th>
                                <th>Tên bệnh nhân</th>
                                <th>Giới Tính</th>
                                <th>Năm Sinh</th>
                                <th>Số điện thoại</th>
                                <th>Email</th>
                                <th>Địa chỉ</th>
                                <th>Triệu chứng</th>
                                <th>Ngày đăng kí</th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                       
                        <tbody>
                            
                            <c:forEach items="${cxn}" var= "p">
                            <tr>
                                <td>${p.bn_id.idBN}</td>
                                <td>${p.bn_id.firstname} ${p.bn_id.lastname}</td>
                                <td>${p.bn_id.gioiTinh}</td>
                                <td>${p.bn_id.namSinh}</td>
                                <td>${p.bn_id.sdt}</td>
                                <td>${p.bn_id.email}</td>
                                <td>${p.bn_id.diachi}</td>
                                <td>${p.bn_id.trieuChung}</td>
                                <td>${p.created_date}</td>
                                <td class="align-items-center d-none d-sm-block btn btn-sm btn-primary shadow-sm">
                                    <a style="color: #ffffff;" href="${pageContext.request.contextPath}/index-nurse/accept/${p.idphieuKB}" onclick="return confirm('Are you sure?')"><i class="fas fa-check"></i></a>
                                </td>
                                <td class="align-items-center d-none d-sm-block btn btn-sm btn-danger shadow-sm">
                                    <a style="color: #ffffff;" href="${pageContext.request.contextPath}/index-nurse/del/${p.idphieuKB}" onclick="return confirm('Are you sure?')"><i class="fas fa-window-close"></i></a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>
    </div>
    
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-success">Danh sách đơn đã xác nhận</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <form>
                    <table class="table table-bordered" id="dataTableDK" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Mã</th>
                                <th>Tên bệnh nhân</th>
                                <th>Giới Tính</th>
                                <th>Năm Sinh</th>
                                <th>Số điện thoại</th>
                                <th>Email</th>
                                <th>Địa chỉ</th>
                                <th>Triệu chứng</th>
                                <th>Ngày đăng kí</th>
                            </tr>
                        </thead>
                        
                        <tbody>
                            
                            <c:forEach items="${xn}" var= "x">
                            <tr>
                                <td>${x.bn_id.idBN}</td>
                                <td>${x.bn_id.firstname} ${x.bn_id.lastname}</td>
                                <td>${x.bn_id.gioiTinh}</td>
                                <td>${x.bn_id.namSinh}</td>
                                <td>${x.bn_id.sdt}</td>
                                <td>${x.bn_id.email}</td>
                                <td>${x.bn_id.diachi}</td>
                                <td>${x.bn_id.trieuChung}</td>
                                <td>${x.created_date}</td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>
    </div>

    
    <!-- DataTales  -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Danh sách thanh toán hóa đơn</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <form>
                    <table class="table table-bordered" id="dataTableTT" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Mã</th>
                                <th>Tên thuốc</th>
                                <th>Số lượng còn</th>
                                <th>Hạn sử dụng</th>
                                <th>Giá bán</th>
                                <th>Mô tả</th>
                                <th>Số lượng</th>
                            </tr>
                        </thead>
                        
                        <tbody>
                            <tr>
                                <td>Tiger Nixon</td>
                                <td>System Architect</td>
                                <td>Edinburgh</td>
                                <td>61</td>
                                <td>2011/04/25</td>
                                <td>$320,800</td>
                                <td><button type="submit" class="btn btn-primary">Xác nhận</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->
