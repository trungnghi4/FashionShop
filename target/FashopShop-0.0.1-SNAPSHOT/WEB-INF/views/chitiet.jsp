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
<jsp:include page="header.jsp"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ShopK</title>
</head>
<body>
<%--Start Header--%>
<div class="container-fluid ">
    <nav class="navbar navbar-default none_nav">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><img src="<c:url value='/resoures/image/icon_yame_shop.png'/> "></a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-center">
                    <li class="active"><a href="#">TRANG CHỦ</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                           aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">One more separated link</a></li>
                        </ul>
                    </li>
                    <li><a href="#">DỊCH VỤ</a></li>
                    <li><a href="#">LIÊN HỆ</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="dangnhap/">ĐĂNG NHẬP</a></li>
                    <li><a href="#">ĐĂNG KÝ</a></li>
                    <li>
                        <a href="#"><img src="<c:url value='/resoures/image/ic_shopping_cart_white_24dp_1x.png'/> "></a>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</div>
<%--End Header--%>

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

<%--Start footer--%>
<div id="footer">
    <div class="container">
        <div class="row">
            <div class="col-sm-4 col-md-4">
                <p><span>THÔNG TIN SẢN PHẨM</span></p>
                <h5>YaMe cam kết chất lượng cho tất cả sản phẩm bán tại cửa hàng </h5>
            </div>
            <div class="col-sm-4 col-md-4">
                <p><span>LIÊN HỆ</span></p>
                <h5>YaMe Q.10: 770F, Sư Vạn Hạnh (nd), P.12</h5>
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
                        <button class="material-button" type="submit">ĐỒNG Ý</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<%--End footer--%>

</body>
</html>
