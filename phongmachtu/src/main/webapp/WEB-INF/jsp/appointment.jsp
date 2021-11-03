<%-- 
    Document   : appointment
    Created on : Nov 3, 2021, 10:39:30 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- ======= Appointment Section ======= -->
<section id="appointment" class="appointment section-bg">
    <div class="container">

      <div class="section-title">
        <h2>Đăng kí khám bệnh</h2>
      </div>

      <form action="forms/appointment.php" method="post" role="form" class="php-email-form">
        <div class="form-row">
          <div class="col-md-4 form-group">
            <input type="text" name="name" class="form-control" id="name" placeholder="Họ và tên đệm" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
            <div class="validate"></div>
          </div>
          <div class="col-md-4 form-group">
            <input type="text" name="name" class="form-control" id="name" placeholder="Tên" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
            <div class="validate"></div>
          </div>
          <div class="col-md-4 form-group">
            <input type="email" class="form-control" name="email" id="email" placeholder="Email" data-rule="email" data-msg="Please enter a valid email">
            <div class="validate"></div>
          </div>
          
        </div>
        <div class="form-row">
          <div class="col-md-4 form-group">
            <input type="tel" class="form-control" name="phone" id="phone" placeholder="Số điện thoại" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
            <div class="validate"></div>
          </div>
          <div class="col-md-4 form-group">
            <input type="tel" class="form-control" name="address" id="address" placeholder="Địa chỉ" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
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
      </form>

    </div>
  </section><!-- End Appointment Section -->

