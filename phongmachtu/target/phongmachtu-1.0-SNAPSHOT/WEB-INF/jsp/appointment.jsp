<%-- 
    Document   : appointment
    Created on : Nov 3, 2021, 10:39:30 AM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- ======= Appointment Section ======= -->
<section id="appointment" class="appointment section-bg">
    <div class="container">

        <div class="section-title">
            <h2>Đăng kí khám bệnh</h2>
        </div>

        <c:url value="/appointment" var="action"/>
        <form:form method="POST" action="${action}" enctype="multipart/form-data" modelAttribute="benhnhan">
            
            <div class="form-row">
                <div class="col-md-4 form-group">
                    <label for="firstname">Họ và tên đệm</label>
                    <form:input type="firstname" class="form-control form-control-user" id="firstname" path="firstname" />
                    <div class="validate"></div>
                </div>
                <div class="col-md-4 form-group">
                    <label for="lastname">Tên người bệnh</label>
                    <form:input type="lastname" class="form-control form-control-user" id="lastname" path="lastname" />
                    <div class="validate"></div>
                </div>
                <div class="col-md-4 form-group">
                    <label for="namsinh">Năm Sinh</label>
                    <form:input type="lastname" class="form-control form-control-user" id="lastname" path="namSinh" />
                    <div class="validate"></div>
                </div>

            </div>
            <div class="form-row">
                <div class="col-md-2 form-group">
                    <label for="sex">Giới tính</label>
                    <form:input type="text" class="form-control" name="gioiTinh" id="gioiTinh" path="gioiTinh" />
                    <div class="validate"></div>
                </div>
                <div class="col-md-2 form-group">
                    <label for="sdt">Số điện thoại</label>
                    <form:input type="tel" class="form-control" name="sdt" id="phone" path="sdt" placeholder="Số điện thoại"/>
                    <div class="validate"></div>
                </div>
                <div class="col-md-4 form-group">
                    <label for="email">Email</label>
                    <form:input type="email" class="form-control form-control-user" id="email" path="email" />
                    <div class="validate"></div>
                </div>
                <div class="col-md-4 form-group">
                    <label for="email">Địa Chỉ</label>
                    <form:input type="text" class="form-control form-control-user" id="email" path="diachi" />
                    <div class="validate"></div>
                </div>
            </div>

            <div class="form-group">
                <form:textarea class="form-control" name="message" rows="5" placeholder="Triệu chứng" path="benhAn" />
                <div class="validate"></div>
            </div>

            <div class="text-center"><button type="submit">Đăng ký</button></div>
        </form:form> 
    </div>
</section><!-- End Appointment Section -->

