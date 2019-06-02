$(document).ready(function(){
	$("#btnDangNhap").click(function() {
		var tendangnhap = $("#email").val();
		var password = $("#matkhau").val();
		$.ajax({
			url:"/FashopShop/api/KiemTraDangNhap",
			type:"GET",
			data:{
				email:tendangnhap, 
				matkhau:password
			},
			success:function(value){
				if(value == "true"){
					duongDanHienTai = window.location.href;
					duongDan = duongDanHienTai.replace("dangnhap","");
					window.location = duongDan;
				}else{
					$("#result").text("Đăng nhập thất bại!")
				}
			}
		})
	});

	$("#dangnhap").click(function(){
		$(this).addClass("actived");
		$("#dangky").removeClass("actived");
		$("#container-login-form").show();
		$("#container-signup-form").hide();
	});
	$("#dangky").click(function(){
		$(this).addClass("actived");
		$("#dangnhap").removeClass("actived");
		$("#container-login-form").hide();
		$("#container-signup-form").show();
	});
	
	
	$("body").on("click",".paging-item",function(){
		$(".paging-item").removeClass("active");
		$(this).addClass("active");
		var sotrang = $(this).text();
		var spbatdau = (sotrang - 1)*5;
		$.ajax({
			url:"/FashopShop/api/LaySanPhamLimit",
			type:"GET",
			data:{
				spbatdau:spbatdau
			},
			success:function(value){
				var tbodysanpham = $("#table-sanpham").find("tbody");
				tbodysanpham.empty();
				tbodysanpham.append(value);
			}
		})
		
	});
}) 