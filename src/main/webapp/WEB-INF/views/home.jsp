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
	<jsp:include page="header.jsp"/>
	
	<div id="info" class="container" style="text-align: center; padding-top: 70px; padding-bottom: 70px">
		<div class="row">
			<div class="col-12 col-sm-4 col-md-4 ">
					<img class="icon" src ='<c:url value="/resources/images/icon-chatluong.png"/>'> <br/>
					<span style="font-size: 32px; font-weight: 500">CHẤT LƯỢNG</span><br/>
					<span>Chúng tôi cam kết chất lượng cho tất cả sản phẩm bán tại cửa hàng bằng chính sách bảo hành 365 ngày và chăm sóc trọn đời sau khi hết bảo hành</span>
			</div>
			<div class="col-12 col-sm-4 col-md-4 ">
					<img  class="icon" src ='<c:url value="/resources/images/icon-conheo.jpg"/>'><br/>
					<span style="font-size: 32px; font-weight: 500">TIẾT KIỆM CHI PHÍ</span><br/>
					<span>Chúng tôi cam kết tất cả các sản phẩm của chúng tôi đều có mức giá rẻ nhất, cạnh tranh nhất trên thị trường Việt Nam</span>

			</div>
			<div class="col-12 col-sm-4 col-md-4 ">
					<img  class="icon" src ='<c:url value="/resources/images/icon-giaohang.png"/>'><br/>
					<span style="font-size: 32px; font-weight: 500">GIAO HÀNG</span><br/>
					<span>Chúng tôi cam kết giao hàng nhanh nhất có thể đến tận tay khách hàng. Bên cạnh đó, khách hàng có thể đổi trả ngay nếu không ưng ý với sản phẩm</span>
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
	
	<jsp:include page="footer.jsp"/>
</body>
</html>
