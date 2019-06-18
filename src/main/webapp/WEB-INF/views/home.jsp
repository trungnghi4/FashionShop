<%@page import="java.util.List" %>
<%-- <%@page import="com.NTQ.entity.NhanVien" %> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html>
<head>
<jsp:include page="header.jsp"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ShopK</title>
</head>
<body>
	<div id="header" class="container-fluid">
		<nav class="navbar navbar-default none_nav">
		 <div class="container-fluid">
				<!-- Brand -->
				<div class="navbar-header">
                            			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#"><img src ='<c:url value="/resources/images/logo.png"/>'></a>
					</div>
			
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav navbar-center">
							<li class="active"><a href="#">TRANG CHỦ</a></li>
							<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="#">Action</a></li>
										<li><a href="#">Another action</a></li>
										<li><a href="#">Something else here</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="#">Separated link</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="#">One more separated link</a></li>
									</ul>
								</li>
							<li><a href="#">DỊCH VỤ</a></li>
							<li><a href="#">LIÊN HỆ</a></li>
							
						</ul>
					
						<ul class="nav navbar_nav navbar_right">
						  	<c:choose>
						  		<c:when test="${chucaidau !=null }">
						  			<li><a class="circle-avatar" href="dangnhap"><span>${chucaidau}</span></a></li>
						  		</c:when>
						  		<c:otherwise>
						  			<li><a href="dangnhap">ĐĂNG NHẬP</a></li>
						  		</c:otherwise>
						  	</c:choose>
						  	
						  	<li><a href="#"><img src='<c:url value="/resources/images/home.png"/>'></a></li>
						</ul>
					</div>
				</div>
			</nav>
			<div class="event_header container">
				<span>Ngày 15/5/2019 - 30/5/2019</span><br/>
				<span style="font-size: 50px">MUA 1 TẶNG 1</span><br/>
				<button>XEM NGAY</button>

			</div>
	</div>	
	<div id="info" class="container">
		<div class="row">
			<div class="col-12 col-sm-4 col-md-4 ">
					<img class="icon" src ='<c:url value="/resources/images/icon-chatluong.png"/>'> <br/>
					<span style="font-size: 32px; font-weight: 500">CHẤT LƯỢNG</span><br/>
					<span>Chúng tôi cam kết mang đến chất lượng tốt nhất!</span>
			</div>
			<div class="col-12 col-sm-4 col-md-4 ">
					<img  class="icon" src ='<c:url value="/resources/images/icon-conheo.jpg"/>'><br/>
					<span style="font-size: 32px; font-weight: 500">TIẾT KIỆM CHI PHÍ</span><br/>
					<span>Chúng tôi cam kết mang đến chất lượng tốt nhất!</span>

			</div>
			<div class="col-12 col-sm-4 col-md-4 ">
					<img  class="icon" src ='<c:url value="/resources/images/icon-giaohang.png"/>'><br/>
					<span style="font-size: 32px; font-weight: 500">GIAO HÀNG</span><br/>
					<span>Chúng tôi cam kết mang đến chất lượng tốt nhất!</span>
			</div>
		</div>
		
	</div>
	<div id="title-sanpham" class="container">
			<span>SẢN PHẨM HOT</span>
			<div class="row" style="margin-top: 42px">
			
			<c:forEach var="sanpham" items="${listSanPham}">
				<div class="col-md-3 col-sm-6 ">
					<div class="sanpham">
						<img  alt="hinh" src ='<c:url value="/resources/images/${sanpham.getHinhsanpham()}"/>'/><br/>
						<span>${sanpham.getTensanpham()}</span><br/>
						<span class="gia">${sanpham.getGiatien()} VNĐ</span>
					</div>
				</div>
			
			</c:forEach>
			</div>
	</div>
	<div id="footer" class="container-fluid">
		<div class="row">
				<div class="col-md-4">
						<p><span class="title-footer">Thông tin Shop</span></p>	
						<span></span>
				</div>
		    <div class="col-md-4">
						<p><span class="title-footer">Liên Hệ</span></p>
						<span></span>
				</div>
		    <div class="col-md-4">
						<p><span class="title-footer">Góp ý</span></p>
						<input class ="material-textinput" style="margin-bottom: 8px" type="text" placeholder="Email"/>
					<textarea class ="material-textinput" rows ="4" cols="50" placeholder="Nội dung"></textared>
						<button class ="material-primary-button">Đồng ý</button>
						<span></span>
				</div>
		</div>
	
	</div>
	</div>
	<div>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>
