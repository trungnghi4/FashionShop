package com.NTQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	
	@GetMapping
	public String Default() {
		return "chitiet"; 
	}
	
	
	
}