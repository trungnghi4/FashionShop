<%@page import="java.util.List" %>
<%@page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href='<c:url value="/resource/JS/jquery-3.3.1.min.js"/>'>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<link rel="stylesheet" href='<c:url value="/resource/JS/custom.js"/>'>
		<link rel="stylesheet" href='<c:url value="/resources/Styles/styles.css"/>'/>
	</head>
	<body>
		<div id="header" class="container-fluid">
			<nav class="navbar navbar-default none_nav">
				 <div class="container-fluid">
					<!-- Brand -->
					<div class="navbar-header">
						<a class="navbar-brand" href="/FashopShop"><img src ='<c:url value="/resources/images/logo.png"/>'></a>
					</div>
				
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div>
						<ul class="nav navbar_nav navbar_right">
						  	<c:choose>
						  		<c:when test="${chucaidau !=null }">
						  			<li><a class="circle-avatar" href="dangnhap"><span>Welcome, ${chucaidau.toUpperCase()}</span></a></li>
						  		</c:when>
						  		<c:otherwise>
						  			<li><a href="dangnhap">ĐĂNG NHẬP</a></li>
						  		</c:otherwise>
						  	</c:choose>
						</ul>
					</div>
				</div>
			</nav>
			<div class="event_header container">
				<span>Ngày 15/5/2019 - 30/5/2019</span><br/>
				<span style="font-size: 50px">MUA 1 TẶNG 1</span><br/>
				<button class="btn btn-info">XEM NGAY</button>
			</div>
		</div>	
	</body>
</html>
