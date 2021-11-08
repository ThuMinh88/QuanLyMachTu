<%-- 
    Document   : create-nurse
    Created on : Nov 7, 2021, 11:30:17 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container-fluid">
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Thêm Y Tá</h6>
        </div>
        <div class="card shadow h-100 py-2">
            <c:url value="/create-nurse" var="action"/>

            <form:form action = "${action}" method="post" modelAttribute="yta" class="row form-group col-xl-12 ">
                <div class="form-group col-sm-4">
                    <div>
                        <label for="ho">Họ và tên đệm<span class="text-danger">*</span></label>
                        <form:input path="hoYTa" class="form-control"/>
                    </div>
                    <div class="my-4">
                        <label for="ten">Tên Y Tá<span class="text-danger">*</span></label>
                        <form:input path="tenYta" class="form-control"/>
                    </div>
                    <div>
                        <label for="email">Email<span class="text-danger">*</span></label>
                        <form:input  path="email" class="form-control"/>
                    </div>
                </div>
                <div class="form-group col-sm-2">
                    <div>
                        <label for="sex">Giới tính<span class="text-danger">*</span></label>
                        <form:input  path="gioiTinh" class="form-control"/>
                    </div>
                    <div class="my-4">
                        <label for="date">Ngày sinh<span class="text-danger">*</span></label>
                        <form:input path="namSinh" class="form-control"/>
                    </div>
                    <div class="my-4">
                        <label for="sdt">Số điện thoại<span class="text-danger">*</span></label>
                        <form:input path="sdt" class="form-control"/>
                    </div>

                </div>
                <div class="form-group col-sm-6">
                    <label for="address">Địa chỉ<span class="text-danger">*</span></label>
                    <form:input  path="diaChi" class="form-control"/>
                    <div>
                        <label for="cv">Chức vụ<span class="text-danger">*</span></label>
                        <form:input  path="chucVu" class="form-control"/>
                    </div>
                    <div class="my-4">
                        <label for="bang">Bằng cấp<span class="text-danger">*</span></label>
                        <form:input  path="bangCap" class="form-control"/>
                    </div>
                    <div>
                        <label for="knghiem">Kinh nghiệm</label>
                        <form:input type="kinhnghiem" id="kinhNghiem" path="kinhNghiem" class="form-control"/>
                    </div>
                </div>
                <div class="form-group col-sm-4">
                    <input type="submit" class="btn btn-danger">
                </div>
            </form:form>
        </div>
    </div>
</div>

