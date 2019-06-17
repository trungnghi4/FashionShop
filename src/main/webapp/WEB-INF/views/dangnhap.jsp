<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href='<c:url value="/resources/Styles/styles.css"/>'/>
<link rel="stylesheet" href='<c:url value="/resources/Styles/util.css"/>'/>
<link href="<c:url value="/resources/bootstrap-4.0.0-dist/css/bootstrap.min.css" />" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="/resources/fonts/iconic/css/material-design-iconic-font.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src='<c:url value ="/resources/JS/custom.js"/>'></script>
<title>ShopK</title>
</head>
<body class="body-login">
	<div class="container-login">
		<img class="login-image" src='<c:url value="/resources/images/login_left.jpg"/>'/>
		
		<div class="login-form p-l-55 p-r-55 p-t-65 p-b-54">
		<span id ="dangnhap" class="login-form-title p-b-49" >Login</span>/
		<span id="dangky" class="login-form-title p-b-49" >SignUp</span>
		
		<div>	
			<div id="container-login-form">
					<div class="wrap-input m-b-23">
						<span class="label-input">Email</span>
						<input id ="email" name="email" class="input" type="text"/>
					</div>
					<div class="wrap-input">
						<span class="label-input">Password</span>
						<input id ="matkhau" name="matkhau"class="input" type="password"/>
					</div>
					<div class="forgot-password-text text-right p-t-8 p-b-31">
						<a>Forgot password?</a>
					</div>
				<div class="container-login-form-btn">
					<div class="wrap-login-form-btn">
						<button class="login-form-btn">
						<span id="btnDangNhap">LOGIN </span>
						</button>
						<span id="result"></span>
					</div>
				</div>
			</div>
			<div id ="container-signup-form">
				<form action="" method="post">
					<div class="wrap-input m-b-23">
						<span class="label-input">Email</span>
						<input id ="email" name="email" class="input" type="text"/>
					</div>
					<div class="wrap-input">
						<span class="label-input">Password</span>
						<input id ="matkhau" name="matkhau"class="input" type="password"/>
					</div>
					<div class="wrap-input">
						<span class="label-input">Nhap Lai Password</span>
						<input id ="nhaplaimatkhau" name="nhaplaimatkhau"class="input" type="password"/>
					</div>
					<div class="forgot-password-text text-right p-t-8 p-b-31">
					</div>
					<div class="container-login-form-btn">
						<div class="wrap-login-form-btn">
							<button class="login-form-btn">
							<span id="btnDangKy">SIGNUP</span>
							</button>
						</div>
					</div>
					<span>${kiemtradangnhap}</span>
					
				</form>
				<span id="result"></span>
			</div>
		</div>
		</div>
	</div>
</body>
</html>