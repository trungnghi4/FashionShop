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
<title>ShopK</title>
</head>
<body class="body-login">
	<div class="container-login">
		<img class="login-image" src='<c:url value="/resources/images/login_left.jpg"/>'/>
		<div class="login-form p-l-55 p-r-55 p-t-65 p-b-54">
			<span class="login-form-title p-b-49">Login</span>
			<div class="wrap-input m-b-23">
				<span class="label-input">Email</span>
				<input class="input" type="text"/>
			</div>
			<div class="wrap-input">
				<span class="label-input">Password</span>
				<input class="input" type="password"/>
			</div>
			<div class="forgot-password-text text-right p-t-8 p-b-31">
				<a>Forgot password?</a>
			</div>
			<div class="container-login-form-btn">
				<div class="wrap-login-form-btn">
					<button class="login-form-btn"><span>LOGIN </span></button>
				</div>
			</div>
			<div class="sign-up-text text-center p-t-54 p-b-20">
				<span>Or sign up using</span>
			</div>
			<div class="container-social-login text-center">
				<img class="icon-facebook" alt="icon-facebook" src='<c:url value="/resources/images/facebook.png"/>'/>
				<img class="icon-google" alt="icon-google" src='<c:url value="/resources/images/google.png"/>'/>
			</div>
		</div>
	</div>
</body>
</html>
