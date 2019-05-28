package com.NTQ.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/")
public class TrangChuController {
	
	@GetMapping
	@Transactional
	public String Default(@SessionAttribute("user") String user, ModelMap modelMap, HttpSession httpSession) {
		if(httpSession.getAttribute("user")!=null)
		{
			String email = (String) httpSession.getAttribute("user");
			String chucaidau = email.substring(0,1);
			modelMap.addAttribute("chucaidau", chucaidau);
		}
		return "home";
	}
}
