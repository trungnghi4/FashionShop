package com.NTQ.controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.NTQ.entity.DanhMucSanPham;
import com.NTQ.entity.MauSanPham;
import com.NTQ.entity.SanPham;
import com.NTQ.entity.SizeSanPham;
import com.NTQ.service.DanhMucService;
import com.NTQ.service.MauSanPhamService;
import com.NTQ.service.SanPhamService;
import com.NTQ.service.SizeSanPhamService;

@Controller
@RequestMapping("themsanpham")
public class ThemSanPhamController {
	@Autowired
	SanPhamService sanPhamService;
	
	@Autowired
	DanhMucService danhMucService;
	
	@Autowired
	SizeSanPhamService sizeSanPhamService;
	
	@Autowired
	MauSanPhamService mauSanPhamService;
	
	@GetMapping
	public String Default(ModelMap modelMap) {
		List<SanPham> listSanPhams = sanPhamService.LayDanhSachSanPhamLimit(0);
		List<SanPham> allSanPhams = sanPhamService.LayDanhSachSanPhamLimit(-1);
		List<SizeSanPham> listSizeSanPham = sizeSanPhamService.LayDanhSachSize();
		List<MauSanPham> listMauSanPham = mauSanPhamService.LayDanhSachMau();
		double tongpage = Math.ceil((double) allSanPhams.size()/5);
		modelMap.addAttribute("listSanPham", listSanPhams);
		modelMap.addAttribute("allSanPham", allSanPhams);
		modelMap.addAttribute("tongpage", tongpage);
		modelMap.addAttribute("listsize", listSizeSanPham);
		modelMap.addAttribute("listmau", listMauSanPham);
		
		List<DanhMucSanPham> danhMucSanPhams = danhMucService.LayDanhMuc();
		modelMap.addAttribute("danhmuc", danhMucSanPhams);
		return "themsanpham"; 
	}
}
