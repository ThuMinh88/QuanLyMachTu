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
            <h6 class="m-0 font-weight-bold text-primary">Thêm Bác Sĩ</h6>
        </div>
        <div class="card shadow h-100 py-2">
            <c:url value="/create-medicine" var="action"/>

            <form:form action = "${action}" enctype="multipart/form-data" method="post" modelAttribute="bacsi" class="row form-group col-xl-12 ">
                <c:if test="${errMsg != null}">
                    <div class="alert alert-danger">
                        ${errMsg}
                    </div>
                </c:if>

                <div class="form-group col-sm-4">
                    <div>
                        <label for="ten">Tên Thuốc<span class="text-danger">*</span></label>
                        <form:input path="tenThuoc" class="form-control"/>
                    </div>
                    <div class="my-4">
                        <label for="sl">Số lượng<span class="text-danger">*</span></label>
                        <form:input path="soLuong" class="form-control"/>
                    </div>
                    
                </div>
                <div class="form-group col-sm-2">
                    <div>
                        <label for="date">Hạn sử dụng<span class="text-danger">*</span></label>
                        <form:input type="date"  path="hanSuDung" class="form-control"/>
                    </div>
                    <div class="my-4">
                        <label for="date">Giá bán<span class="text-danger">*</span></label>
                        <form:input path="giaBan" class="form-control"/><span> đ</span>
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <div>
                        <label for="knghiem">Mô Tả</label>
                        <form:input type="text-area" id="moTa" path="moTa" class="form-control"/>
                    </div>
                    
                </div>
                <div class="form-group col-sm-4">
                    <input type="submit" class="btn btn-danger">
                </div>
            </form:form>
        </div>
    </div>
</div>

