$(document).ready(function(){
	$("#btnDangNhap").click(function() {
		var email = $("#email").val();
		var password = $("#matkhau").val();
		$.ajax({
			url:"/FashopShop/api/KiemTraDangNhap",
			type:"GET",
			data:{
				email:email, 
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
	
	$("#check-all").change(function() {
		if(this.checked) {
			$("#table-sanpham input").each(function() {
				$(this).attr("checked", true);
			})
		} else {
			$("#table-sanpham input").each(function() {
				$(this).attr("checked", false);
			})
		}
	})
	
	$("#xoa-sanpham").click(function() {
		$("#table-sanpham >tbody input:checked").each(function() {
			var masanpham=$(this).val();
			var This=$(this);
			
			$.ajax({
				url:"/FashopShop/api/XoaSanPham",
				type:"GET",
				data:{
					masanpham:masanpham
				},
				success:function(value){
					This.closest("tr").remove();
				}
			})	
		})
	})
	
	var files=[];
	var tenhinh = "";
	$("#hinhanh").change(function(event) {
		files = event.target.files;
		tenhinh = files[0].name;
		forms = new FormData();
		forms.append("file", files[0]);
		
		$.ajax({
			url:"/FashopShop/api/UploadFile",
			type:"POST",
			data:forms,
			contentType:false,
			processData:false,
			enctype:"multipart/form-data",
			success:function(value){
				
			}
		})	
	})
	
	$("body").on("click", ".btn-chitiet", function() {
		$(this).remove();
		var chitietclone = $("#chitietsanpham").clone().removeAttr("id");
		$("#containterchitietsanpham").append(chitietclone);
	})
	
	$("#btn-themsanpham").click(function(event) {
		event.preventDefault();
		var formdata = $("#form-sanpham").serializeArray();
		json = {};
		arrayChiTiet = [];
		$.each(formdata, function(i, field) {
			json[field.name] = field.value;
		});

		$("#containterchitietsanpham >.chitietsanpham").each(function() {
			objectChiTiet = {};
			mausanpham = $(this).find("#mausanpham").val();
			sizesanpham = $(this).find("#sizesanpham").val();
			soluong = $(this).find("#soluong").val();
			objectChiTiet["mausanpham"] = mausanpham;
			objectChiTiet["sizesanpham"] = sizesanpham;
			objectChiTiet["soluong"] = soluong;

			arrayChiTiet.push(objectChiTiet);
		});
		
		json["hinhsanpham"] = tenhinh;
		json["chitietsanpham"] = arrayChiTiet;
		
		$.ajax({
			url:"/FashopShop/api/ThemSanPham",
			type:"POST",
			data: {
				dataJson: JSON.stringify(json)
			},
			success:function(value){
				
			}
		})	
	})
	
	var masanpham = 0;
	
	$("#btn-capnhat").click(function(event) {
		event.preventDefault();
		var formdata = $("#form-sanpham").serializeArray();
		json = {};
		arrayChiTiet = [];
		$.each(formdata, function(i, field) {
			json[field.name] = field.value;
		});

		$("#containterchitietsanpham >.chitietsanpham").each(function() {
			objectChiTiet = {};
			mausanpham = $(this).find("#mausanpham").val();
			sizesanpham = $(this).find("#sizesanpham").val();
			soluong = $(this).find("#soluong").val();
			objectChiTiet["mausanpham"] = mausanpham;
			objectChiTiet["sizesanpham"] = sizesanpham;
			objectChiTiet["soluong"] = soluong;

			arrayChiTiet.push(objectChiTiet);
		});
		
		json["masanpham"] = masanpham;
		json["hinhsanpham"] = tenhinh;
		json["chitietsanpham"] = arrayChiTiet;
		
		$.ajax({
			url:"/FashopShop/api/CapNhatSanPham",
			type:"POST",
			data: {
				dataJson: JSON.stringify(json)
			},
			success:function(value){
				
			}
		})	
	})
	
	$("body").on("click", ".capnhatsanpham", function() {
		masanpham = $(this).attr("data-id");
		
		$("#btn-capnhat").removeClass("hidden");
		$("#btn-themsanpham").addClass("hidden");
		
		$.ajax({
			url:"/FashopShop/api/LayDanhSachSanPhamTheoMa",
			type:"POST",
			data: {
				masanpham: masanpham
			},
			success:function(value){
				$("#tensanpham").val(value.tensanpham);
				$("#giatien").val(value.giatien);
				$("#mota").val(value.mota);
				
				if (value.gianhcho.toLowerCase() === "nam") {
					$("#rd-nam").prop("checked", true);
				} else {
					$("#rd-nu").prop("checked", true);
				}
				
				$("#danhmucsanpham").val(value.danhmucsanpham.madanhmuc);
				
				$("#containterchitietsanpham").empty();
				
				for (i=0; i<value.chitietsanpham.length; i++) {
					var chitietclone = $("#chitietsanpham").clone().removeAttr("id");
					chitietclone.find("#mausanpham").val(value.chitietsanpham[i].mausanpham.mamau);
					chitietclone.find("#sizesanpham").val(value.chitietsanpham[i].sizesanpham.masize);
					chitietclone.find("#soluong").val(value.chitietsanpham[i].soluong);
					
					if (i !== value.chitietsanpham.length-1) {
						chitietclone.find("#btn-chitiet").hide();
					}
					
					$("#containterchitietsanpham").append(chitietclone);
				}
				
				if (value.chitietsanpham.length === 0) {
					var chitietclone = $("#chitietsanpham").clone().removeAttr("id");
					chitietclone.find("#btn-chitiet").show();
					$("#containterchitietsanpham").append(chitietclone);
				}
			}
		})	
	}) 
}) 