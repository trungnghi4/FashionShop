<%-- 
    Document   : chitiet
    Created on : Jun 17, 2019, 10:35:02 PM
    Author     : quanhandsome
--%>
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
		
		<%--Start content--%>
		<div class="container">
		    <div class="row">
		        <div class="col-xs-12 col-sm-2 col-md-2">
		            <h3>DANH MUC SAN PHAM</h3>
		            <ul>
		                <li>Ao so mi</li>
		                <li>Ao Khoac</li>
		                <li>Quan Dai</li>
		            </ul>
		        </div>
		        <div class="col-xs-12 col-sm-8 col-md-8">
		            <div class="row">
		                <div class=" col-xs-12 col-sm-4 col-md-4">
		                    <img src="<c:url value='/resoures/image/sanpham.png'/> "/>
		                </div>
		                <div class="col-xs-12 col-sm-8 col-md-8">
		                    <h3>Aó sơ mi nam </h3>
		                    <h5>Giá Tiền</h5>
		                    <table>
		                        <tr>
		                            <td>222aaa</td>
		                            <td>dđ</td>
		                            <td>ffff</td>
		                            <td>aaaa</td>
		                        </tr>
		                    </table>
		                </div>
		            </div>
		        </div>
		        <div class="col-xs-12 col-sm-2 col-md-2">
		            <span>U23 Thái Lan kết thúc vòng bảng với vị trí thứ 3, vỏn vẹn 2 điểm và phải về nước sớm. Người hâm mộ và truyền thông nước này đang thực sự giận dữ về thành tích tệ hại của đội nhà.</span>
		        </div>
		    </div>
		</div>
		
		<%--End content--%>
		
		<jsp:include page="footer.jsp"/>
	</body>
</html>
