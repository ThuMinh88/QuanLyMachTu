<%-- 
    Document   : index.jsp
    Created on : Sep 22, 2021, 2:23:57 PM
    Author     : DAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>


<h1 class="text-center">Danh mục thuốc</h1>

<form action="">
    <div class="row">
        <div class="col-md-11">
            <input class="form-control" type="text" name="kw" placeholder="Nhập tên thuốc cần tìm"/>
        </div>
        <div>
            <input type="submit" value="Tìm Kiếm" class="btn btn-danger"/>
        </div>
    </div>
</form>

<div class="row">
    <j:forEach var="t" items="${thuoc}">
        <div class="card">
            <div class="card-body">
                <div>
                    <img src="<j:url value="images/Astmodil-10Mg.jpg"/>" alt="${t.tenThuoc}"/>
                </div>
            </div>
            <div class="card-footer">
                <h3>${t.tenThuoc}</h3>
                <p>${t.giaBan} VND</p>
            </div>
      </div> 
    </j:forEach>
    
</div>