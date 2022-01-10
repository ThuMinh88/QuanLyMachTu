<%-- 
    Document   : report_bill.jsp
    Created on : Dec 30, 2021, 8:55:13 PM
    Author     : DAO
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>

<div class="container-fluid py-3">
    <!-- Links -->
    <h1 class="text-center h3 mb-4 text-primary-800 ">DANH MỤC THỐNG KÊ - BÁO CÁO</h1>
    <div class="row">
        <form action="" class="form-group col-sm-4">
            <div class="form-group">
                <lable>Từ thời điểm</lable>
                <input type="date" name="fromDate" class="form-control"/>
            </div>
            <div class="form-group">
                <lable>Đến thời điểm</lable>
                <input type="date" name="toDate" class="form-control"/>
            </div>
            <input type="submit" value="Báo cáo" class="btn btn-success"/>
        </form>

    <!--<div class="container-fluid">-->
        <div class="card shadow mb-4 col-sm-8">
            <div>
                <canvas id="myBillChart"></canvas>
            </div>
        </div>
    <!--</div>-->
    </div>
    
    <table class="table">
        <tr>
            <th>Tháng</th>
            <th>Doanh thu</th>
        </tr>
        <c:forEach items="${billMonthStats}" var="p">
            <tr>
                <td>${p[0]}/${p[1]}</td>
                <td>${p[2]}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<script>
    let pLabels=[], pInfo=[]
    <c:forEach items="${billMonthStats}" var="p">
        pLabels.push('${p[1]}')
        pInfo.push(${p[2]})
    </c:forEach>
    window.onload = function () {
        bChart("myBillChart", pLabels, pInfo);
    }
</script>
