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
<title>ShopK</title>
</head>
<body class="body-login">
	<div class="container-login">
		<div class="login-form p-l-55 p-r-55 p-t-65 p-b-54">
			<span class="login-form-title p-b-49">Login</span>
			<div class="wrap-input m-b-23">
				<span class="label-input">Email</span>
				<input class="input" type="text"/>
				<img class="icon-input" src='<c:url value="/resources/images/mail.png"/>'/>
			</div>
			<div class="wrap-input">
				<span class="label-input">Password</span>
				<input class="input" type="text"/>
				<img class="icon-input" src='<c:url value="/resources/images/locked.png"/>'/>
			</div>
			<div class="text-right p-t-8 p-b-31">
				<a>Forgot password?</a>
			</div>
			<div class="container-login-form-btn">
				<div class="wrap-login-form-btn">
					<button class="login-form-btn">Login</button>
				</div>
			</div>
			<div class="txt1 text-center p-t-54 p-b-20">
				<span>Or sign up using</span>
			</div>
			<div class="container-social-login text-center">
				<img alt="icon-facebook" src='<c:url value="/resources/images/icon-facebook.png"/>'/>
				<img alt="icon-google" src='<c:url value="/resources/images/icon-google.png"/>'/>
			</div>
		</div>
	</div>
</body>
</html>
