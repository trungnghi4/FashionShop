<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href='<c:url value="/resources/JS/jquery-3.3.1.min.js"/>'>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<link rel="stylesheet" href='<c:url value="/resources/JS/custom.js"/>'>
		<link rel="stylesheet" href='<c:url value="/resources/Styles/styles.css"/>'/>
	</head>
	<body>
		<div id="footer">
		    <div class="container">
		        <div class="row">
		            <div class="col-sm-4 col-md-4" style="text-align: justify;">
		                <p><span>THÔNG TIN</span></p>
		                <h5>Chúng tôi đang tạo ra những bộ trang phục sản xuất trong nước hoàn toàn có thể sánh ngang với các thương hiệu thời trang nam đến từ nước ngoài về kiểu dáng, chất lượng lẫn phong cách thời trang</h5>
		            </div>
		            <div class="col-sm-4 col-md-4">
		                <p><span>LIÊN HỆ</span></p>
		                <h5>ShopK Q.10: 770F, Sư Vạn Hạnh (ND), P.12</h5>
		                <h5>(028) 7307 1441</h5>
		            </div>
		            <div class="col-sm-4 col-md-4">
		                <div class="noidung">
		                    <p><span>GÓP Ý</span></p>
		                    <form action="" method="post">
		                        <input name="name" type="text" placeholder="Email"
		                               style="margin-bottom: 10px; width: 100%;height: 35px"/><br/>
		                        <textarea name="age" style="margin-bottom: 10px; width: 100%" rows="4" cols="50" placeholder="Nội Dung"
		                                  class="text-noidung"></textarea><br/>
		                        <button class="btn btn-warning" type="submit">ĐỒNG Ý</button>
		                    </form>
		                </div>
		            </div>
		        </div>
		    </div>
		</div>
	</body>
</html>
