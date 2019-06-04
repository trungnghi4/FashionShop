package com.NTQ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.NTQ.entity.SanPham;
import com.NTQ.service.NhanVienService;
import com.NTQ.service.SanPhamService;

@Controller
@RequestMapping("api/")
@SessionAttributes("user")
public class ApiController {
	
	@Autowired
	NhanVienService nhanVienService;
	
	@Autowired
	SanPhamService sanPhamService;
	
	@GetMapping("KiemTraDangNhap")
	@ResponseBody
	public String KiemTraDangNhap(@RequestParam String email, @RequestParam String matkhau, ModelMap modelMap)
	{
		boolean kiemtra = nhanVienService.KiemTraDangNhap(email, matkhau);
		modelMap.addAttribute("user",email);
		return ""+kiemtra;
	}
	
	@GetMapping(path="LaySanPhamLimit", produces="text/plain; charset=utf-8")
	@ResponseBody
	public String LaySanPhamLimit(@RequestParam int spbatdau)
	{
		String html="";
		List<SanPham> listSanPhams = sanPhamService.LayDanhSachSanPhamLimit(spbatdau);
		for (SanPham sanPham : listSanPhams) {
			html+="<tr style=\"border-bottom: 1px solid #eeeeee;\">";
			html+="<td><div class='checkbox'><label><input class='checkboxsanpham' type='checkbox' value='" + sanPham.getMasanpham() + "'></label></div></td>";
			html+= "<td class='tensp'>" + sanPham.getTensanpham() + "</td>";
			html+= "<td class='giatien'>" + sanPham.getGiatien() + "</td>";
			html+= "<td class='gioitinh'>" + sanPham.getGianhcho() + "</td>";
			html+="</tr>";
		}
		return html;
		
	}
	
	@GetMapping(path="XoaSanPham")
	@ResponseBody
	public String XoaSanPhamTheoMaSanPham(@RequestParam int masanpham)
	{
		sanPhamService.XoaSanPhamTheoMaSanPham(masanpham);
		return "true";
		
	}
}
