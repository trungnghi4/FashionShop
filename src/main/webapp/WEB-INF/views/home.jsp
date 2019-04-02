<%@page import="java.util.List" %>
<%-- <%@page import="com.NTQ.entity.NhanVien" %> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="header.jsp"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ShopK</title>
</head>
<body>
	<div id="header" class="container-fluid">
		<div>
			<nav class="navbar navbar-expand-sm none-nav">
			  <!-- Brand -->
			  <a class="navbar-brand" href="#">Logo</a>
			
			  <!-- Links -->
			  <ul class="navbar-nav navbar_center">
			    <li class="nav-item">
			      <a class="nav-link" href="#">TRANG CHỦ</a>
			    </li>
			    <!-- Dropdown -->
			    <li class="nav-item dropdown">
			      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
			        Dropdown link
			      </a>
			      <div class="dropdown-menu">
			        <a class="dropdown-item" href="#">Link 1</a>
			        <a class="dropdown-item" href="#">Link 2</a>
			        <a class="dropdown-item" href="#">Link 3</a>
			      </div>
			    </li>
			    <li class="nav-item">
			      <a class="nav-link" href="#">DỊCH VỤ</a>
			    </li>
			    <li class="nav-item">
			      <a class="nav-link" href="#">LIÊN HỆ</a>
			    </li>
			  </ul> 
			  <ul class="nav navbar_nav navbar_right">
			  	<li><a href="#">ĐĂNG NHẬP</a></li>
			  	<li><a href="#">ĐĂNG KÝ</a></li>
			  	<li><a href="#"><img src='<c:url value="/resources/images/home.png"/>'></a></li>
			  </ul>
			</nav>
		
		</div>
	</div>
	<div>
	</div>
	<div>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>
