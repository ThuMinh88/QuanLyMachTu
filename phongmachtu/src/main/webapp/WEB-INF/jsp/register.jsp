<%-- 
    Document   : register
    Created on : Nov 2, 2021, 4:53:37 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- ======= Login Section ======= -->
  <section id="hero" class="d-flex align-items-center">
    <div class="container">
      <div class="col-lg-12 d-flex align-items-stretch">
        <div class="sub-main-w3">
          <div class="wthree-pro">
            <h2>Đăng kí tài khoản</h2>
          </div>
          <form action="#" method="post">
            <div class="form-group row">
                <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" id="exampleFirstName"
                        placeholder="Họ và tên đệm">
                </div>
                <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" id="exampleLastName"
                        placeholder="Tên bệnh nhân">
                </div>
            </div>
            <div class="form-group">
                <input type="email" class="form-control form-control-user" id="exampleInputEmail"
                    placeholder="Email">
            </div>
            <div class="form-group">
                <input type="password" class="form-control form-control-user"
                        id="exampleInputPassword" placeholder="Password">
            </div>
            <div class="form-group row">
                <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="password" class="form-control form-control-user"
                        id="exampleInputPassword" placeholder="Password">
                </div>
                <div class="col-sm-6">
                    <input type="password" class="form-control form-control-user"
                        id="exampleRepeatPassword" placeholder="Repeat Password">
                </div>
            </div>
            <div class="pom-agile">
                
            </div>
            <div class="sub-w3l">
                <h6><a href="<c:url value="/login"/>">Đã có tài khoản?</a></h6>
              <div class="right-w3l">
                <input type="submit" value="Đăng kí">
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </section><!-- End Hero -->