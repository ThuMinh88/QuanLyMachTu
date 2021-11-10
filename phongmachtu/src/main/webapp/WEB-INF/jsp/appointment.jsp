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

                <c:if test="${errMsg != null}">
                    <div class="alert alert-danger">
                        ${errMsg}
                    </div>
                </c:if>
                <div class="form-group row">

                    <div class="col-sm-6 mb-3 mb-sm-0">
                        <label for="firstname">Họ và tên đệm</label>
                        <form:input type="firstname" class="form-control form-control-user" id="firstname" path="firstname"/>
                    </div>
                    <div class="col-sm-6">
                        <label for="lastname">Tên người bệnh</label>
                        <form:input type="lastname" class="form-control form-control-user" id="lastname" path="lastname"/>
                    </div>

                </div>


            </div>
            <div class="form-row">
                <div class="col-md-4 form-group">
                    <form:input type="tel" class="form-control" name="phone" id="phone" placeholder="Số điện thoại" data-rule="minlen:4" data-msg="Please enter at least 4 chars"/>
                    <div class="validate"></div>
                </div>
                <div class="col-md-4 form-group">
                    <form:input type="tel" class="form-control" name="address" id="address" placeholder="Địa chỉ" data-rule="minlen:4" data-msg="Please enter at least 4 chars"/>
                    <div class="validate"></div>
                </div>
                <div class="col-md-4 form-group">
                    <input type="datetime" name="date" class="form-control datepicker" id="date" placeholder="Ngày hẹn" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
                    <div class="validate"></div>
                </div>
            </div>

            <div class="form-group">
                <textarea class="form-control" name="message" rows="5" placeholder="Triệu chứng"></textarea>
                <div class="validate"></div>
            </div>
            <div class="mb-3">
                <div class="loading">Loading</div>
                <div class="error-message"></div>
                <div class="sent-message">Your appointment request has been sent successfully. Thank you!</div>
            </div>
            <div class="text-center"><button type="submit">Make an Appointment</button></div>
        </form:form>
        <c:if test="${benhnhan.currentUser != null}">
            ${benhnhan.currentUser.firtName}
        </c:if>
    </div>
</section><!-- End Appointment Section -->

