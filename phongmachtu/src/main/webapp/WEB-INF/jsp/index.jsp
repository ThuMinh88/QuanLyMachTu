<%-- 
    Document   : index
    Created on : Nov 2, 2021, 11:08:19 AM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

  <!-- ======= Hero Section ======= -->
  <section id="hero" class="top d-flex align-items-center">
    <div class="container">
      <h1>Chăm sóc sức khỏe cùng OTC</h1>
      <h2>Hãy cùng chúng tôi để được hỗ trợ sức khỏe tốt nhất!</h2>
      <a href="#about" class="btn-get-started scrollto">Bắt đầu</a>
    </div>
  </section><!-- End Hero -->

  <main id="main">

  
    <!-- ======= Why Us Section ======= -->
    <section id="why-us" class="why-us">
      <div class="container">

        <div class="row">
          <div class="col-lg-4 d-flex align-items-stretch">
            <div class="content">
              <h3>Tại sao nên chọn phòng mạch OTC?</h3>
              <p>
                  Với kinh nghiệm hơn 10 năm hoạt động trong lĩnh vực chăm sóc sức khỏe,
                  phòng khám OTC đã được nhiều giải thưởng quý giá của ngành y tế Việt Nam. 
                  Tại đây, được trang bị nhiều trang thiết bị y khoa hiện đại. Đến với phòng khám OTC 
                  bệnh nhân sẽ nhận được sự chăm sóc sức khỏe tốt nhất đến từ các đội ngũ bác sĩ giàu kinh nghiệm, có chuyên môn cao.
              </p>
              <div class="text-center">
                <a href="#" class="more-btn">Đọc thêm <i class="bx bx-chevron-right"></i></a>
              </div>
            </div>
          </div>
          <div class="col-lg-8 d-flex align-items-stretch">
            <div class="icon-boxes d-flex flex-column justify-content-center">
              <div class="row">
                <div class="col-xl-4 d-flex align-items-stretch">
                  <div class="icon-box mt-4 mt-xl-0">
                    <i class="bx bx-receipt"></i>
                    <h4>Giới thiệu</h4>
                    <p> OTC là phòng khám tư nhân được thành lập từ năm 2010. 
                        Phòng khám OTC hiện có hơn 20 bác sĩ điều trị và có khoảng 100 nhân viên y tế để phục vụ bệnh nhân. 
                        OTC hoạt động với châm ngôn "Sức khỏe của bệnh nhân là trên hết"</p>
                  </div>
                </div>
                <div class="col-xl-4 d-flex align-items-stretch">
                  <div class="icon-box mt-4 mt-xl-0">
                    <i class="bx bx-cube-alt"></i>
                    <h4>Trang thiết bị hiện đại</h4>
                    <p>Sở hữu nhiều loại thiết bị hiện đại như: Hệ thống CT Scanner 160 lát của hãng Toshiba - Nhật,
                        Hệ thống kính hiển vi phẫu thuật CarlZeiss Vario S88, Hệ thống MRI 1.5 Tesla của hãng Siemens - Đức,...
                    </p>
                  </div>
                </div>
                <div class="col-xl-4 d-flex align-items-stretch">
                  <div class="icon-box mt-4 mt-xl-0">
                    <i class="bx bx-images"></i>
                    <h4>Hoạt động</h4>
                    <p>OTC cung cấp nhiều dịch vụ y khoa gồm: khám ngoại trú, điều trị điều dưỡng - phục hồi chức năng,
                        chuẩn đoán hình ảnh, xét nghiệm màu, chăm sóc sức khỏe sinh sản,...
                    </p>
                  </div>
                </div>
              </div>
            </div><!-- End .content-->
          </div>
        </div>

      </div>
    </section><!-- End Why Us Section -->

    <!-- ======= Doctors Section ======= -->
    <section id="doctors" class="doctors">
      <div class="container">

        <div class="section-title">
          <h2>Đội ngũ nhân viên</h2>
          <p>Sở hữu đội ngũ y bác sĩ có chuyên môn cao, tận tâm với nghề và được đào tạo chuyên nghiệp từ
              đến từ các Trường Đại Học Y Khoa hàng đầu cả nước như: Đại học Y Hà Nội, Đại học Pari của Pháp, Đại học Y Dược TpHCM,...
          </p>
        </div>

        <div class="row">

          <div class="col-lg-6">
            <div class="member d-flex align-items-start">
              <div class="pic"><img src="<c:url value="/img/doctors/doctors-1.jpg"/>" class="img-fluid" alt=""></div>
              <div class="member-info">
                <h4>Đào Văn Xiêu</h4>
                <span>Trưởng Khoa Thần Kinh</span>
                <p>Giáo sư của Trường Đại học Y Dược TpHCM.</p>
                <div class="social">
                  <a href=""><i class="ri-twitter-fill"></i></a>
                  <a href=""><i class="ri-facebook-fill"></i></a>
                  <a href=""><i class="ri-instagram-fill"></i></a>
                  <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-6 mt-4 mt-lg-0">
            <div class="member d-flex align-items-start">
              <div class="pic"><img src="<c:url value="/img/doctors/doctors-2.jpg"/>" class="img-fluid" alt=""></div>
              <div class="member-info">
                <h4>Mai Tiến Hợp</h4>
                <span>Trưởng Khoa Tai-Mũi-Họng</span>
                <p>Tốt nghiệp tiễn sĩ Trường Đại học Y Hà Nội</p>
                <div class="social">
                  <a href=""><i class="ri-twitter-fill"></i></a>
                  <a href=""><i class="ri-facebook-fill"></i></a>
                  <a href=""><i class="ri-instagram-fill"></i></a>
                  <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-6 mt-4">
            <div class="member d-flex align-items-start">
              <div class="pic"><img src="<c:url value="/img/doctors/doctors-3.jpg"/>"class="img-fluid" alt=""></div>
              <div class="member-info">
                <h4>Nguyễn Tiến Đạt</h4>
                <span>Trưởng Khoa Da Liễu</span>
                <p>Tốt nghiệp tiến sĩ tại Đại học Paris năm 2015</p>
                <div class="social">
                  <a href=""><i class="ri-twitter-fill"></i></a>
                  <a href=""><i class="ri-facebook-fill"></i></a>
                  <a href=""><i class="ri-instagram-fill"></i></a>
                  <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-6 mt-4">
            <div class="member d-flex align-items-start">
              <div class="pic"><img src="<c:url value="/img/doctors/doctors-4.jpg"/>" class="img-fluid" alt=""></div>
              <div class="member-info">
                <h4>Mai Thi Sếu</h4>
                <span>Điều dưỡng viên</span>
                <p>Tốt nghiệp Trường Đại học Y Dược TpHCM.</p>
                <div class="social">
                  <a href=""><i class="ri-twitter-fill"></i></a>
                  <a href=""><i class="ri-facebook-fill"></i></a>
                  <a href=""><i class="ri-instagram-fill"></i></a>
                  <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                </div>
              </div>
            </div>
          </div>

        </div>

      </div>
    </section><!-- End Doctors Section -->

  
    <!-- ======= Gallery Section ======= -->
    <section id="gallery" class="gallery">
      <div class="container">

        <div class="section-title">
          <h2>Thư viện</h2>
          <p>Trang thiết bị hiện đại</p>
        </div>
      </div>

      <div class="container-fluid">
        <div class="row no-gutters">

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="<c:url value="/img/gallery/gallery-1.jpg"/>" class="venobox" data-gall="gallery-item">
                <img src="<c:url value="/img/gallery/gallery-1.jpg"/>" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="<c:url value="/img/gallery/gallery-2.jpg"/>" class="venobox" data-gall="gallery-item">
                <img src="<c:url value="/img/gallery/gallery-2.jpg"/>" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="<c:url value="/img/gallery/gallery-3.jpg"/>" class="venobox" data-gall="gallery-item">
                <img src="<c:url value="/img/gallery/gallery-3.jpg"/>" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="<c:url value="/img/gallery/gallery-4.jpg"/>" class="venobox" data-gall="gallery-item">
                <img src="<c:url value="/img/gallery/gallery-4.jpg"/>" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="<c:url value="/img/gallery/gallery-5.jpg"/>" class="venobox" data-gall="gallery-item">
                <img src="<c:url value="/img/gallery/gallery-5.jpg"/>" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="<c:url value="/img/gallery/gallery-6.jpg"/>" class="venobox" data-gall="gallery-item">
                <img src="<c:url value="/img/gallery/gallery-6.jpg"/>" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="<c:url value="/img/gallery/gallery-7.jpg"/>" class="venobox" data-gall="gallery-item">
                <img src="<c:url value="/img/gallery/gallery-7.jpg"/>" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="<c:url value="/img/gallery/gallery-8.jpg"/>" class="venobox" data-gall="gallery-item">
                <img src="<c:url value="/img/gallery/gallery-8.jpg"/>" alt="" class="img-fluid">
              </a>
            </div>
          </div>

        </div>

      </div>
    </section><!-- End Gallery Section -->

