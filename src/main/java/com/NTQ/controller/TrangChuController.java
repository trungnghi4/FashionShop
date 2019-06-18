package com.NTQ.controller;

import java.io.Console;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.NTQ.entity.SanPham;
import com.NTQ.service.SanPhamService;

@Controller
@RequestMapping("/")
public class TrangChuController {
	
	@Autowired
	SanPhamService sanPhamService;
	
	@GetMapping
	@Transactional
//	public String Default(@SessionAttribute("user") String user, ModelMap modelMap, HttpSession httpSession) {
//		System.out.println(httpSession.getAttribute("user"));
//		if(httpSession.getAttribute("user")!=null)
//		{
//			String email = (String) httpSession.getAttribute("user");
//			String chucaidau = email.substring(0,1);
//			modelMap.addAttribute("chucaidau", chucaidau);
//		}
//		return "home";
//	}
    public String Default( ModelMap modelMap, HttpSession httpSession) {
		System.out.println(httpSession.getAttribute("user"));
		if(httpSession.getAttribute("user")!=null)
		{
			String email = (String) httpSession.getAttribute("user");
			String chucaidau = email.substring(0,1);
			modelMap.addAttribute("chucaidau", chucaidau);
		}
		return "home";
	}
	
}

