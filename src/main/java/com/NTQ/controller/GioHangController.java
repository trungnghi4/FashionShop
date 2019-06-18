/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NTQ.controller;

/**
 *
 * @author quanhandsome
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.NTQ.entity.ChiTietHoaDon;
import com.NTQ.entity.ChiTietHoaDonId;
import com.NTQ.entity.DanhMucSanPham;
import com.NTQ.entity.GioHang;
import com.NTQ.entity.HoaDon;
import com.NTQ.service.ChiTietHoaDonService;
import com.NTQ.service.DanhMucService;
import com.NTQ.service.HoaDonService;

@Controller
@RequestMapping("giohang/")
public class GioHangController {
	
	@Autowired
	DanhMucService danhMucService;
	
	@Autowired
	HoaDonService hoaDonService;
	
	@Autowired
	ChiTietHoaDonService chiTietHoaDonService;
	
	@GetMapping
	public String Default(ModelMap map, HttpSession httpSession) {
		
		List<DanhMucSanPham> danhMucSanPhams = danhMucService.LayDanhMuc();
		
		if(null != httpSession.getAttribute("giohang")) {
			List<GioHang> gioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
			map.addAttribute("soluongsanphamgiohang", gioHangs.size());
			map.addAttribute("giohangs",gioHangs );
		}
		
		map.addAttribute("danhmuc", danhMucSanPhams);
		
		return "giohang";
		
	}
	
	@PostMapping() //produces="text/plain;charset=utf-8"
	public String ThemHoaDon(HttpSession httpSession, @RequestParam String tenkhachhang,@RequestParam String sodt,@RequestParam String diachigiaohang,@RequestParam String hinhthucgiaohang,@RequestParam String ghichu) {
		
		if(null != httpSession.getAttribute("giohang")){
			List<GioHang> gioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
			
			HoaDon hoaDon = new HoaDon();
			hoaDon.setTenkhachhang(tenkhachhang);
			hoaDon.setSodt(sodt);
			hoaDon.setDiachigiaohang(diachigiaohang);
			hoaDon.setHinhthucgiaohang(hinhthucgiaohang);
			hoaDon.setGhichu(ghichu);
			
			int idHoaDon = hoaDonService.ThemHoaDon(hoaDon);
			if(idHoaDon > 0){
				Set<ChiTietHoaDon> listChiTietHoaDons = new HashSet<ChiTietHoaDon>();
				for (GioHang gioHang : gioHangs) {
					ChiTietHoaDonId chiTietHoaDonId = new ChiTietHoaDonId();
					chiTietHoaDonId.setMachitietsanpham(gioHang.getMachitiet());
					chiTietHoaDonId.setMahoadon(hoaDon.getMahoadon());
					
					ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
					chiTietHoaDon.setChitiethoadonid(chiTietHoaDonId);
					chiTietHoaDon.setGiatien(gioHang.getGiatien().toString());
					chiTietHoaDon.setSoluong(gioHang.getSoluong());
					
					chiTietHoaDonService.ThemChiTietHoaDon(chiTietHoaDon);
				}
			}else{
				System.out.println("Them tb");
			};	
			
		}
		
		return "thongbaodathang";
	}

}

