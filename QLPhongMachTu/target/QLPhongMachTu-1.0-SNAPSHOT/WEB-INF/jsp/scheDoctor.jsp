<%-- 
    Document   : ScheDoctor
    Created on : Dec 23, 2021, 5:28:09 PM
    Author     : ACER
--%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container-fluid">
    <!-- Page Heading -->
    <!--    <div class="d-sm-flex align-items-center justify-content-end mb-4 ">
            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">Thêm mới y tá</a>
        </div>-->
    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Lập lịch trực cho Bác Sĩ</h6>
        </div>
        <div class="card-body">
            <c:url value="/admin/doctor-schedule" var="action"/>

            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">

                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Bác sĩ</th>
                            <th>Ca khám bệnh</th>
                        </tr>
                    </thead>
                    <tbody>
                        
                            <c:forEach var="bs" items="${bacsi}">
                                <form:form modelAttribute="chitietcakham" enctype="multipart/form-data" role="form" class="form-group">
                                <tr>
                                    <td><form:label path="bacSi">${bs.idBS}</form:label></td>
                                    <td>${bs.hoBS} ${bs.tenBS}</td>
                                
                                    <td>
                                        <form:select path="id" class="form-control">
                                            <c:forEach items="${catruc}" var="ca">
                                                <option value="${ca.id}">${ca.moTa}</option>
                                            </c:forEach>
                                        </form:select>
                                    </td>
                                
                                <td>
                                    <div >
                                        <input class="align-items-center d-none d-sm-block btn btn-sm btn-primary shadow-sm" type="submit" value="Sắp lịch trực">
                                    </div>
                                </td>
                            </tr></form:form>
                        </c:forEach>
                    

                    </tbody>
                    <tfoot>

                    </tfoot>

                </table>

            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->
