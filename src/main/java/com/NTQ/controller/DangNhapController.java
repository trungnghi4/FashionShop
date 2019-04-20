package com.NTQ.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.NTQ.entity.NhanVien;
import com.NTQ.service.NhanVienService;

@Controller
@RequestMapping("dangnhap/")
public class DangNhapController {
	@GetMapping
	public String Default() {
		return "dangnhap";
	}
	@Autowired 
	SessionFactory sessionFactory;
	@Autowired
	NhanVienService nhanVienService;
	
	@PostMapping
	@Transactional
	public String XuLyDangNhap(@RequestParam String email, @RequestParam String matkhau,ModelMap modelMap){
		
		boolean kiemtra = nhanVienService.KiemTraDangNhap(email, matkhau);
		
		if(kiemtra) {
			modelMap.addAttribute("kiemtradangnhap","Đăng nhập thành công!");			
		}else {
			modelMap.addAttribute("kiemtradangnhap","Đăng nhập thất bại!");
		}
		
		return "dangnhap";
	}
}

