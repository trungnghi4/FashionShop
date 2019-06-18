package com.NTQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.NTQ.entity.SanPham;
import com.NTQ.service.DanhMucService;
import com.NTQ.service.SanPhamService;

@Controller
@RequestMapping("chitiet")
@SessionAttributes("giohang")
public class ChiTietController {

	@Autowired
	SanPhamService sanPhamService;
	
	@Autowired
	DanhMucService danhMucService;
	
	@GetMapping("/{masanpham}")
	public String Default(@PathVariable int masanpham, ModelMap modelMap) {
		SanPham sanPham = sanPhamService.LayDanhSachChiTietSanPhamTheoMa(masanpham);
		modelMap.addAttribute("sanpham", sanPham);
		return "chitiet"; 
	}
	
	
	
}