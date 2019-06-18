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
<meta charset="utf-8" />
<!-- <meta http-equiv="refresh" content="3" />  -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Chi tiết</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<jsp:include page="header.jsp" />


<link rel="stylesheet" type="text/css" media="screen"
	href="../resources/Styles/formatTrangChu.css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="../resources/Styles/fomatChiTiet.css" />
</head>
<body style="background: #fff5f7">

	<div id="header_chitiet" class="container-fluid">


		<nav class="navbar navbar-default none-nav navbar-fixed-top" style="background: none; border: none;">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed btn_toggle"
					data-toggle="collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="../"><span
					style="font-family: 'Edwardian Script ITC'; color: #ffc000; font-size: 55px; padding-top: 20px;"><span
					style="color: #ff6699;">Baby</span>Point</span></a>
			</div>
			<div class="collapse navbar-collapse menu_toggle" id="myNavbar">
				<ul class="nav navbar-nav navbar-left " style="margin-left: 25% ;">
					<li class="active"><a href="<c:url value="/"/>">TRANG CHỦ</a></li>
					<!-- Thuộc tính Active là để nó bôi trắng chữ trang chủ khi duyệt web -->
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">SẢN PHẨM <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<c:forEach var="value" items="${danhmuc }">
								<li  style="margin:3px 0; font-size: 18px; font-weight: 400;"><a href="<c:url value="/sanpham/${value.getMadanhmuc() }/${value.getTendanhmuc() }"/>">${value.getTendanhmuc() }</a></li>
								<li role="separator"></li>
							</c:forEach>
						</ul></li>
					<li><a href="#">DỊCH VỤ</a></li>
					<li><a href="#">LIÊN HỆ</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<c:choose>
						<c:when test="${chucaidau != null }">
							<li><a class="circle-avartar" href="../dangnhap/"><span >${chucaidau}</span></a></li>
						</c:when>

						<c:otherwise>
							<li><a href="../dangnhap/">ĐĂNG NHẬP</a></li>
						</c:otherwise>
					</c:choose>
					<li><a style=" margin-right:10px;" href="../giohang/"><img style="height: 26px;" src="../resources/Image/giohang3.png" />
					<div class="circle-giohang" style="position: absolute;text-align: center;margin-top: -35px;line-height: 22px;margin-left: 14px;background: red;height: 18px;width: 18px;border-radius: 9px;">
					<span style="color: #7aff00;">${soluongsanphamgiohang }</span>
					</div></a></li>
				</ul>
			</div>
		</nav>

	</div>

	<div class="container" style="margin-top:20px;">
		<div class="row">
		
			<div class="col-sm-3 col-md-3 col-xs-4">
				<h3  style="margin-top: 50px;">DANH MỤC</h3>
				<ul style="padding-left: 1px;"  >
				<c:forEach var="value" items="${danhmuc }">
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

	<!-- footer -->
	<div id="footer" class="container-fluid">

		<div class="row ">

			<div class="col-sm-4 col-md-4 wow tada">
				<p class="title-footer text-center">THÔNG TIN SHOP</p>
				<br /><br/> <p> 🔹BabyPoint là một thương hiệu thời trang đầy uy tín,
					luôn đảm bảo chất lượng sản phẩm tốt nhất cho khách hàng</p> <br/>
					<p> 🔹BabyPoint cam kết chất lượng phục vụ tốt nhất, chuyên nghiệp nhất cho 
					mọi khách hàng bằng chính sách hoàn tiền và tặng quà nếu nhân viên phục vụ quí khách không chu đáo.</p>
					<br/><p> 🔹Nếu bạn gặp rắc rối về sản phẩm hay chất lượng dịch vụ của BabyPoint, hãy gọi ngay đến số 094 788 78 86 hoặc inbox ở 
					fanpage <a href="https://www.facebook.com/babypoint.hn/" >https://www.facebook.com/babypoint.hn/</a></p>
			</div>
			<div class="col-sm-4 col-md-4 wow tada">
				<p class="title-footer text-center">ĐẢM BẢO HÀI LÒNG</p>
				<br /><br /> <P>Với hệ thống cửa hàng trải khắp trung tâm Hà Nội cho bạn mua sắm dễ dàng hơn</p>
				<p><a>Chính sách đổi trả</a></p>
				<p><a>Than phiền/Chăm sóc khách hàng</a></p>
				
				<div style="margin-top: 30px;">
					<a href="https://www.facebook.com/babypoint.hn"><img src="<c:url value="/resources/Image/icon-facebook.png"  />" /></a>
					<img src="<c:url value="/resources/Image/icon-google.png"  />" />
				</div>
			</div>
			<div class="col-sm-4 col-md-4 wow tada">
				<div class="">
				
				<div class="text-center title-footer" >BabyPoint - Thiên Đường Cho Bé ❣</div>
				<div class="text-center" style="font-size: 22px;  " >☎ Hotline: 094 788 78 86</div> <br/>
				<br/><br/>💠 Địa Chỉ:<br/><br/>
				🔹 Cơ sở 1: 109A12 Nghĩa Tân, Tô Hiệu, Cầu Giấy, HN <br/>
				🔹 Cơ sở 2: Tầng 5 TTTM Lotte, 54 Liễu Giai, Ba Đình, Hà Nội<br/>
				🔹 Cơ sở 3: Tầng 2 & tầng G TTTM The Garden, đường Mễ Trì, phường Mỹ Đình 1, quận Nam Từ Liêm, Hà Nội<br/>
				🔹 Cơ sở 4: TTTM Robins, B1-R4 Royal City, Thanh Xuân, Hà Nội<br/>
				
				</div>
			
				<!-- <p class="title-footer text-center">GÓP Ý</p>
				<br />
				<form action="" method="post">
					<input name="tenNhanVien" class="format-input" type="text"
						placeholder="Email" /><br />
					<textarea class="format-textarea" name="tuoi" id="#" cols="30" 
						rows="4" placeholder="Ghi chú"></textarea>
					<br />
					<button class="format-button" >Đồng ý</button>
				</form> -->
			</div>

		</div>
		
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
			-------------------------------------------------
				<br/>© 2019 - CÔNG TY TNHH YAME VN
			</div>
		
		</div>
	</div>


	<jsp:include page="footer.jsp" />


	

</body>
</html>

			