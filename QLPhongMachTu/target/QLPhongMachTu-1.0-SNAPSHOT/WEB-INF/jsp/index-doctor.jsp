
<%-- 
    Document   : doctor-index
    Created on : Nov 8, 2021, 12:22:48 AM
    Author     : DAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="align-items-center justify-content-between mb-4">
        <!-- Nested Row within Card Body -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-success">Danh sách khám bệnh</h6>
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
                                    <th>Triệu chứng</th>
                                    <th>Ngày đăng kí</th>
                                    <th>Bác sĩ nhận khám</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <j:url value="/index-doctor" var="action"/>
                            <form:form modelAttribute="donthuoc" enctype="multipart/form-data" role="form" class="form-group">
                                <tbody>

                                    <j:forEach items="${phieu}" var= "x">
                                        <tr>
                                            <td><form:label path="benhnhan"/>${x.bn_id.idBN}</td>
                                            <td>${x.bn_id.firstname} ${x.bn_id.lastname}</td>
                                            <td>${x.bn_id.gioiTinh}</td>
                                            <td>${x.bn_id.namSinh}</td>
                                            <td><form:label path="trieuchung"/>${x.bn_id.trieuChung}</td>
                                            <td>${x.created_date}</td>
                                            <td>
                                                <form:select path="bacsi" class="form-control">
                                                    <j:forEach items="${bacsi}" var="bs">
                                            <option value="${bs.idBS}">${bs.hoBS} ${bs.tenBS}</option>
                                        </j:forEach>
                                    </form:select>
                                    </td>
                                    <td >
                                        <input type="submit" style="color: #ffffff;" onclick="return confirm('Are you sure?')" value="Lập đơn thuốc" class="align-items-center d-none d-sm-block btn btn-sm btn-primary shadow-sm"></a>
                                    </td>
                                    </tr>
                                </j:forEach>
                                </tbody>
                            </form:form>
                        </table>
                    </form>
                </div>
            </div>
        </div>


    </div>
    <!-- /.container-fluid -->
</div>
<!-- End of Main Content -->