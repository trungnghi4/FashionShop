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
<body class="body-login">
	<div class="container-login">
		<div class="login-form">
			<span class="login-form-title">Login</span>
			<div class="wrap-input">
				<span class="label-input">Email</span>
				<input class="input" placeholder="Type your email" type="text"/>
			</div>
			<div class="wrap-input">
				<span class="label-input">Password</span>
				<input class="input" placeholder="Type your password" type="text"/>
			</div>
			<div class="text-right">
				<a>Forgot password?</a>
			</div>
			<div class="container-login-form-btn">
				<div class="wrap-login-form-btn">
					<button class="login-form-btn">Login</button>
				</div>
			</div>
			<div class="">
				<span>Or Sign Up Using</span>
			</div>
			<div id="container-social-login">
				<img alt="icon-facebook" src='<c:url value="/resources/images/icon-facebook.png"/>'/>
				<img alt="icon-google" src='<c:url value="/resources/images/icon-google.png"/>'/>
			</div>
		</div>
	</div>
</body>
</html>
