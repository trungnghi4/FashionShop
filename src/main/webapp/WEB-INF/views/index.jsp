 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ShopK</title>
<jsp:include page="header.jsp"/>
</head>
<body id="body-login">
	<div id="body-flex-login">
		<div id="container-login">
			<div id="container-login-left">
				<div id="header-top-left" class="header-login">
				<span id="text-logo">Welcome</span><br/>
				<span id="hint-text-logo">Hãy tạo nên phong cách của bạn cùng ShopK</span>
				</div>
			
				<div id="header-bottom-left">
					<p><img alt="icon_tick" src='<c:url value="/resources/images/tick.png"/>'/><span>Luôn luôn cập nhật xu hướng thời trang mới nhất</span></p>
					<p><img alt="icon_tick" src='<c:url value="/resources/images/tick.png"/>'/><span>Giảm hơn 50% tất cả các mặt hàng giành cho khách VIP</span></p>
					<p><img alt="icon_tick" src='<c:url value="/resources/images/tick.png"/>'/><span>Tận tình tư vấn để tạo nên phong cách của bạn</span></p>
				</div>
			</div>
			<div id="container-login-right">
				<div id="header-top-right" class="header-login">
					<span class="actived">Đăng nhập</span> / <span>Đăng ký</span>
				</div>
				<div id="container-center-login-right"> 
					<form action="">
						<input class="material-textinput input-icon-email" placeholder="Email" type="text"/><br/>
						<input class="material-textinput input-icon-password" placeholder="Mật khẩu" type="text"/><br/>
						<input class="material-primary-button" type="submit" value="ĐĂNG NHẬP"/><br/>
					</form>
				</div>
				<div id="container-social-login">
				<img alt="icon-facebook" src='<c:url value="/resources/images/icon-facebook.png"/>'/>
				<img alt="icon-google" src='<c:url value="/resources/images/icon-google.png"/>'/>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
