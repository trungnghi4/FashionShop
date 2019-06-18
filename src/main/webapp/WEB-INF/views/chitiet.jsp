<%-- 
    Document   : chitiet
    Created on : Jun 17, 2019, 10:35:02 PM
    Author     : quanhandsome
--%>
<%@page import="java.util.List" %>
<%-- <%@page import="com.NTQ.entity.NhanVien" %> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="<c:url value="/resources/bootstrap-4.0.0-dist/css/bootstrap.min.css" />" rel="stylesheet">
		<title>ShopK</title>
	</head>
	<body>
		<div style="padding: 10px 16px; background: #555; color: #f1f1f1;">
  			<div class="navbar-header">
				<a class="navbar-brand" href="/FashopShop"><img src ='<c:url value="/resources/images/logo.png"/>'></a>
			</div>
		</div>
		
		<%--Start content--%>
		<div class="container" style="padding-top: 70px">
		    <div class="row">
		        <div class="col-xs-12 col-sm-12 col-md-12">
		            <div class="row">
		                <div class=" col-xs-12 col-sm-12 col-md-3">
		                    <img style="width: 250px;" alt="hinh" src ='<c:url value="/resources/images/sanpham/${sanpham.getHinhsanpham() }"/>'/>
		                </div>
		                <div class="col-xs-12 col-sm-12 col-md-7" >
			                <div style="padding-left: 15px;">
			                 	<h3 class="font-weight-bold">${sanpham.getTensanpham() }</h3>
			                    <h5 class="font-weight-bold">${sanpham.getDanhmucsanpham().getTendanhmuc() }</h5>
			                    <h5 class="font-weight-bold">${sanpham.getGiatien() }</h5>
			                </div>
		                    </br>
		                    <table class="table">
		                    	<thead>
		                    		<tr class="font-weight-bold" style="font-size: 18px;">
		                    			<td>Màu sản phẩm</td>
		                    			<td>Size</td>
		                    			<td>Số lượng</td>
		                    			<td></td>
		                    		</tr>	
		                    	</thead>
		                        <tbody>
		                        	<c:forEach var="chitietsanpham" items="${sanpham.getChitietsanpham() }">
		                        		<tr>
		                        			<td>${chitietsanpham.getMausanpham().getTenmau() }</td>
		                        			<td>${chitietsanpham.getSizesanpham().getSize() }</td>
		                        			<td>${chitietsanpham.getSoluong() }</td>
		                        			<td><button class="btn btn-success">Giỏ hàng</button></td>
		                        		</tr>
		                        	</c:forEach>
		                        </tbody>
		                    </table>
		                </div>
		              	<div class="col-xs-12 col-sm-12 col-md-2" style="text-align: justify;">
		            		<span>${sanpham.getMota() }</span>
		        		</div>
		            </div>
		        </div>
		      
		    </div>
		</div>
		
		<%--End content--%>
		
		<jsp:include page="footer.jsp"/>
	</body>
</html>
