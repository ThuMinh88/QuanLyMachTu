<%-- 
    Document   : create-nurse
    Created on : Nov 11, 2021, 9:37:42 AM
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
            <c:url value="/admin/create-nurse" var="action"/>
            <form:form action = "${action}" enctype="multipart/form-data" method="post" modelAttribute="yta" cssClass="row form-group col-xl-8 ">
                <div class="form-group col-sm-4">
                    <div>
                        <label for="ho">Họ và tên đệm<span class="text-danger">*</span></label>
                        <form:input type="text" path="hoYTa" id="ho" cssClass="form-control" />
                        <form:errors type="text" path="hoYTa" cssClass="text-danger" element="div"/>
                    </div>
                    <div class="my-4">
                        <label for="ten">Tên Y Tá<span class="text-danger">*</span></label>
                        <form:input type="text" path="tenYta" id="ten" cssClass="form-control" />
                        <form:errors type="text" path="tenYta" cssClass="text-danger" element="div"/>
                    </div>
                    <div>
                        <label for="email">Email<span class="text-danger">*</span></label>
                        <form:input type="email" path="email" id="email" cssClass="form-control"/>
                        <form:errors type="text" path="email" cssClass="text-danger" element="div"/>
                    </div>
                    
                </div>
                <div class="form-group col-sm-2">
                    <div>
                        <label for="sex">Giới tính<span class="text-danger">*</span></label>
                        <form:input type="text" path="gioiTinh" id="gioiTinh" cssClass="form-control form-select"/>
                        <form:errors type="text" id="gioiTinh" path="gioiTinh" cssClass="text-danger" element="div"/>
                    </div>
                    <div class="my-4">
                        <label for="date">Ngày sinh<span class="text-danger">*</span></label>
                        <form:input type="text" path="namSinh" id="namSinh" cssClass="form-control"/>
                        <form:errors type="text" path="namSinh" cssClass="text-danger" element="div"/>
                    </div>
                    <div class="my-4">
                        <label for="sdt">Số điện thoại<span class="text-danger">*</span></label>
                        <form:input type="text" path="sdt" id="sdt" cssClass="form-control"/>
                        <form:errors type="text" path="sdt" cssClass="text-danger" element="div"/>
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <label for="address">Địa chỉ<span class="text-danger">*</span></label>
                    <form:input type="text" path="diaChi" cssClass="form-control"/>
                    <div>
                        <label for="cv">Chức vụ<span class="text-danger">*</span></label>
                        <form:input type="text" path="chucVu" id="chucVu" cssClass="form-control"/>
                        <form:errors type="text" path="chucVu" cssClass="text-danger" element="div"/>
                    </div>
                    <div class="my-4">
                        <label for="bang">Bằng cấp<span class="text-danger">*</span></label>
                        <form:input type="text" path="bangCap" id="bangCap" cssClass="form-control"/>
                        <form:errors type="text" path="bangCap" cssClass="text-danger" element="div"/>
                    </div>
                    <div>
                        <label for="knghiem">Kinh nghiệm</label>
                        <form:input id="kinhNghiem" path="kinhNghiem" cssClass="form-control"/>
                    </div>
                </div>                
                <div class="form-group col-sm-4">
                    <input type="submit" class="btn btn-danger" id="btnClick" onclick="btnClick();">
                </div>

            </form:form>
        </div>
    </div>
</div>