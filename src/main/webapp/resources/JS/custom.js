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
					$("#result").text("Đăng nhập thành công!")
				}else{
					$("#result").text("Đăng nhập thất bại!")
				}
			}
		})
	});
})