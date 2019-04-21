package com.NTQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.NTQ.service.NhanVienService;

@Controller
@RequestMapping("api/")
public class ApiController {
	
	@Autowired
	NhanVienService nhanVienService;
	
	@GetMapping("KiemTraDangNhap")
	@ResponseBody
	public String KiemTraDangNhap(@RequestParam String email, @RequestParam String matkhau)
	{
		boolean kiemtra = nhanVienService.KiemTraDangNhap(email, matkhau);
		
		return ""+kiemtra;
	}
}