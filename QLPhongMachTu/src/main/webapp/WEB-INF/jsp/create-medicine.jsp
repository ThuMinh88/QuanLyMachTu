<%-- 
    Document   : add-madicine
    Created on : Nov 8, 2021, 2:13:30 PM
    Author     : DAO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container-fluid">
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Thêm Thuốc</h6>
        </div>
        <div class="card shadow h-100 py-2">

            <c:if test="${errMsg != null}">
                <div class="alert alert-danger">${errMsg} </div>
            </c:if>
            <c:url value="/admin/create-medicine" var="action"/>
            <form:form action = "${action}" enctype="multipart/form-data" method="post" modelAttribute="thuoc" class="row form-group col-xl-12 ">
                <div class="form-group col-sm-3">
                    <div>
                        <label for="ten">Tên Thuốc<span class="text-danger">*</span></label>
                        <form:input path="tenThuoc" class="form-control"/>
                        <form:errors path="tenThuoc" cssClass="text-danger" element="div"/>
                    </div>
                    <div class="my-4">
                        <label for="tenDM">Danh Mục Thuốc<span class="text-danger">*</span></label>
                        <form:select path="danhMucThuoc" class="form-control">
                            <c:forEach items="${danhmucthuoc}" var="dm">
                                <option value="${dm.idDM}">${dm.tenDM}</option>
                            </c:forEach>
                        </form:select>
                    </div>

                </div>
                <div class="form-group col-sm-3">
                    <div>
                        <label for="tenNCC">Nhà Cung Cấp<span class="text-danger">*</span></label>
                        <form:select path="nhaCungCap" class="form-control">
                            <c:forEach items="${nhacungcap}" var="ncc">
                                <option value="${ncc.idNCC}">${ncc.tenNCC}</option>
                            </c:forEach>
                        </form:select>
                    </div>
                    <div class="my-4">
                        <label for="sl">Số lượng<span class="text-danger">*</span></label>
                        <form:input path="soLuong" type="number" class="form-control"/>
                        <form:errors path="soLuong" cssClass="text-danger" element="div"/>
                    </div>
                </div>
                <div class="form-group col-sm-2">
                    <div>
                        <label for="date">Hạn sử dụng<span class="text-danger">*</span></label>
                        <form:input type="text" path="hansudung" id="hanSuDung" class="form-control"/>
                    </div>
                    <div class="my-4">
                        <label for="gia">Giá bán<span class="text-danger">*</span></label>
                        <form:input path="giaBan" type="number" class="form-control"/><span></span>
                        <form:errors path="giaBan" cssClass="text-danger" element="div"/>
                    </div>
                </div>
                <div class="form-group col-sm-4">

                    <div>
                        <label for="mt">Mô Tả</label>
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
