<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<!-- <meta http-equiv="refresh" content="3" />  -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Chi tiết</title>
<meta name="viewport" content="width=device-width, initial-scale=1">


<link rel="stylesheet" type="text/css" media="screen"
	href="../resources/Styles/formatTrangChu.css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="../resources/Styles/fomatChiTiet.css" />
</head>
<body style="background: #fff5f7">

	<jsp:include page="header.jsp"/>
	<div class="container" style="margin-top:20px;">
		<div class="row">
		
			<div class="col-sm-3 col-md-3 col-xs-4">
				<h3  style="margin-top: 50px;">DANH MỤC</h3>
				<ul style="padding-left: 1px;"  >
				<c:forEach var="value" items="${danhmuc}">
					<li style="margin:3px 0; font-size: 19px; font-weight: 400;"><a href="<c:url value="/sanpham/${value.getMadanhmuc() }/${value.getTendanhmuc() }"/>">${value.getTendanhmuc() }</a></li>
				</c:forEach>
				</ul>
			</div>
			
			<div class="col-sm-9 col-md-9 col-xs-8">
				<div class="row">
					<div class="col-sm-4 col-md-4 col-xs-12">
						<img style="width: 100%;" src="../resources/Image/sanpham/${sanpham.getHinhsanpham() }"
					alt="hinh" />
					</div>
					<div class="col-sm-8 col-md-8 col-xs-12">
						 <div class="tensp format-tensp" data-masp ="${sanpham.getMasanpham()}"> ${sanpham.getTensanpham()} </div>
						<div  id="giatien"  class="cost" data-value="${sanpham.getGiatien() }" style="color:red">${sanpham.getGiatien() },000 VND</div>
						<table class="table">
							<thead>
								<tr>
									<td><div class="format-thead" >Màu sản phẩm</div> </td>
									<td><div class="format-thead" >Size sản phẩm</div></td>
									<td><div class="format-thead" >Số lượng</div></td>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="chitietsanpham" items="${sanpham.getChitietsanpham() }">
									<tr>
										<td class="mau" data-mamau="${chitietsanpham.getMausanpham().getMamau()}">${chitietsanpham.getMausanpham().getTenmau() }</td>
										<td class="size"data-masize="${chitietsanpham.getSizesanpham().getMasize()}">${chitietsanpham.getSizesanpham().getSize() }</td>
										<td class="soluong" >${chitietsanpham.getSoluong()}</td>
										<td><button data-machitiet ="${chitietsanpham.getMachitietsanpham() }" class="btn btn-success btn-giohang">Thêm vào giỏ</button></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

					</div>
				</div>
			</div>

		</div>
		
		
		<div class="row" >
			<div class="col-sm-6 col-md-6 col-xs-12">
				<br/><div class="gioithieusanpham">Giới thiệu sản phẩm</div>
				<pre>${sanpham.getMota()}</pre>
			</div>
			<div  class="col-sm-6 col-md-6 col-xs-12" >
				<c:forEach var="hinhbosungsanpham" items="${hinhbosung }">
					<br/><span ><img class="format-hinhsanphambosung" src="<c:url value="/resources/Image/sanpham/${hinhbosungsanpham.getHinhsanphambosung()}" /> " /></span>				
				</c:forEach>
			</div>
		</div>
	</div>
	
	<jsp:include page="footer.jsp" />


	

</body>
</html>
