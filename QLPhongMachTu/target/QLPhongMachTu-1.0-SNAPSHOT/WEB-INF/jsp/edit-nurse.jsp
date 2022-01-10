<%-- 
    Document   : edit-nurse
    Created on : Nov 14, 2021, 1:08:07 PM
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
            <c:url value="/admin/nurse/select/edit-nurse/{idYT}" var="action"/>
            <form:form action = "${action}" enctype="multipart/form-data" 
                       method="post" modelAttribute="yta" cssClass="row form-group col-xl-8 ">

                    <div class="form-group col-sm-4">
                        <div>
                            <label for="ho">Họ và tên đệm<span class="text-danger">*</span></label>
                            <form:input value="${yt.hoYTa}" type="text" path="hoYTa" id="ho" cssClass="form-control" />
                        </div>
                        <div class="my-4">
                            <label for="ten">Tên Y Tá<span class="text-danger">*</span></label>
                            <form:input value="${yt.tenYta}" type="text" path="tenYta" id="ten" cssClass="form-control" />
                        </div>
                        <div>
                            <label for="email">Email<span class="text-danger">*</span></label>
                            <form:input value="${yt.email}"  type="email" path="email" id="email" cssClass="form-control"/>
                        </div>
                        <div>
                            <label for="email">user_id<span class="text-danger">*</span></label>
                            <form:hidden type="number" path="userID" value="8" cssClass="form-control"/>
                        </div>
                    </div>
                    <div class="form-group col-sm-2">
                        <div>
                            <label for="sex">Giới tính<span class="text-danger">*</span></label>
                            <form:input value="${yt.gioiTinh}" type="text" path="gioiTinh" id="gioiTinh" cssClass="form-control form-select"/>
                        </div>
                        <div class="my-4">
                            <label for="date">Ngày sinh<span class="text-danger">*</span></label>
                            <form:input value="${yt.namSinh}"  type="text" path="namSinh" id="namSinh" cssClass="form-control"/>
                        </div>
                        <div class="my-4">
                            <label for="sdt">Số điện thoại<span class="text-danger">*</span></label>
                            <form:input value="${yt.sdt}" type="text" path="sdt" id="sdt" cssClass="form-control"/>
                        </div>
                    </div>
                    <div class="form-group col-sm-6">
                        <label for="address">Địa chỉ<span class="text-danger">*</span></label>
                        <form:input value="${yt.diaChi}" type="text" path="diaChi" cssClass="form-control"/>
                        <div>
                            <label for="cv">Chức vụ<span class="text-danger">*</span></label>
                            <form:input value="${yt.chucVu}" type="text" path="chucVu" id="chucVu" cssClass="form-control"/>
                        </div>
                        <div class="my-4">
                            <label for="bang">Bằng cấp<span class="text-danger">*</span></label>
                            <form:input value="${yt.bangCap}" type="text" path="bangCap" id="bangCap" cssClass="form-control"/>
                        </div>
                        <div>
                            <label for="knghiem">Kinh nghiệm</label>
                            <form:input value="${yt.kinhNghiem}" id="kinhNghiem" path="kinhNghiem" cssClass="form-control"/>
                        </div>

                    </div>                
                    <div class="form-group col-sm-4">
                        <input type="submit" class="btn btn-danger" id="btnClick" onclick="btnClick();">
                    </div>
            </form:form>
        </div>
    </div>
</div>