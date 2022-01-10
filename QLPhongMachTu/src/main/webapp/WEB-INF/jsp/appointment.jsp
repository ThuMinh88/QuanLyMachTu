<%-- 
    Document   : appointment
    Created on : Nov 3, 2021, 10:39:30 AM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- ======= Appointment Section ======= -->
<section id="hero" class="d-flex align-items-center">
    <div class="container" style="margin-top: 7rem;">
        <div class="col-xl-9">
            <div class="border-0 shadow-lg card o-hidden ">
                <div class="p-4">
                    <div class="text-center">
                        <h1 class="h3 text-gray-900 mb-2">đăng kí khám bệnh</h1>
                    </div>
                    <hr>
                    <c:url value="/appointment" var="action"/>
                    <form:form method="POST" action="${action}" modelAttribute="benhnhan">
                        <div class="form-row">
                            <c:if test="${errMsg != null}">
                                <div class="alert alert-danger">
                                    ${errMsg}
                                </div>
                            </c:if>
                        </div>
                        <div class="form-row">
                            <div class="col-md-4 form-group">
                                <label for="firstname" class="text-info font-weight-bold">Họ và tên đệm</label>
                                <form:input type="text" class="form-control form-control-user" id="firstname" path="firstname" />
                                <div class="validate"></div>
                            </div>
                            <div class="col-md-4 form-group">
                                <label for="lastname" class="text-info font-weight-bold">Tên người bệnh</label>
                                <form:input type="text" class="form-control form-control-user" id="lastname" path="lastname" />
                                <div class="validate"></div>
                            </div>
                            <div class="col-md-4 form-group">
                                <label for="namsinh" class="text-info font-weight-bold" >Năm Sinh</label>
                                <form:input type="text" class="form-control form-control-user" id="namsinh" path="namSinh" />
                                <div class="validate"></div>
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col-md-2 form-group">
                                <label for="sex" class="text-info font-weight-bold">Giới tính</label>
                                <form:input type="text" class="form-control" name="gioiTinh" id="gioiTinh" path="gioiTinh" />
                                <div class="validate"></div>
                            </div>
                            <div class="col-md-2 form-group">
                                <label for="sdt" class="text-info font-weight-bold">Số điện thoại</label>
                                <form:input type="tel" class="form-control" name="sdt" id="phone" path="sdt" />
                                <div class="validate"></div>
                            </div>
                            <div class="col-md-4 form-group">
                                <label for="email" class="text-info font-weight-bold">Email</label>
                                <form:input type="email" class="form-control form-control-user" id="email" path="email" />
                                <div class="validate"></div>
                            </div>
                            <div class="col-md-4 form-group">
                                <label for="diachi" class="text-info font-weight-bold">Địa Chỉ</label>
                                <form:input type="text" class="form-control form-control-user" id="email" path="diachi" />
                                <div class="validate"></div>
                            </div>
                                
                        </div>
                        <div class="form-group">
                            <form:textarea class="form-control" name="message" rows="5" placeholder="Triệu chứng" path="trieuChung" />
                            <div class="validate"></div>
                        </div>

                        <div class="text-center"><input class="btn btn-danger" type="submit"></div>
                        </form:form> 


                </div>
            </div>
        </div>

    </div>

</section><!-- End Appointment Section -->
