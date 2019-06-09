package com.NTQ.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.NTQ.entity.ChiTietSanPham;
import com.NTQ.entity.DanhMucSanPham;
import com.NTQ.entity.JSON_SanPham;
import com.NTQ.entity.MauSanPham;
import com.NTQ.entity.SanPham;
import com.NTQ.entity.SizeSanPham;
import com.NTQ.service.NhanVienService;
import com.NTQ.service.SanPhamService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
			html += "<tr style=\"border-bottom: 1px solid #eeeeee;\">";
			html += "<td><div class='checkbox'><label><input class='checkboxsanpham' type='checkbox' value='" + sanPham.getMasanpham() + "'></label></div></td>";
			html += "<td class='tensp'>" + sanPham.getTensanpham() + "</td>";
			html += "<td class='giatien'>" + sanPham.getGiatien() + "</td>";
			html += "<td class='gioitinh'>" + sanPham.getGianhcho() + "</td>";
			html += "<td style='color: white' class='btn btn-warning capnhatsanpham' data-id=" + sanPham.getMasanpham() + ">Update</td>";
			html += "</tr>";
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
	
	@Autowired
	ServletContext context;
	
	@PostMapping(path="UploadFile")
	@ResponseBody
	public String UploadFile(MultipartHttpServletRequest request)
	{
		String path_save_file = context.getRealPath("/resources/images/sanpham/");
		Iterator<String> listNames = request.getFileNames(); 
		MultipartFile mpf = request.getFile(listNames.next());
		
		File file_save = new File(path_save_file + mpf.getOriginalFilename());
		try {
			mpf.transferTo(file_save);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(path_save_file);
		return "true";	
	}
	
	@PostMapping(path="ThemSanPham")
	@ResponseBody
	public void ThemSanPham(@RequestParam String dataJson) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		JsonNode jsonObject;
		try {
			SanPham sanPham = new SanPham();
			jsonObject = objectMapper.readTree(dataJson);
			
			DanhMucSanPham danhMucSanPham = new DanhMucSanPham();
			danhMucSanPham.setMadanhmuc(jsonObject.get("danhmucsanpham").asInt());
			
			JsonNode jsonChiTiet = jsonObject.get("chitietsanpham");
			Set<ChiTietSanPham> listChiTiet = new HashSet<>();
			for (JsonNode objectChiTiet : jsonChiTiet ) {
				ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
				
				MauSanPham mauSanPham = new MauSanPham();
				mauSanPham.setMamau(objectChiTiet.get("mausanpham").asInt());
				
				SizeSanPham sizeSanPham = new SizeSanPham();
				sizeSanPham.setMasize(objectChiTiet.get("sizesanpham").asInt());
				
				chiTietSanPham.setMausanpham(mauSanPham);
				chiTietSanPham.setSizesanpham(sizeSanPham);
				chiTietSanPham.setSoluong(objectChiTiet.get("soluong").asInt());
				
				listChiTiet.add(chiTietSanPham);
			}
			
			String tensanpham = jsonObject.get("tensanpham").asText();
			String giatien = jsonObject.get("giatien").asText();
			String mota = jsonObject.get("mota").asText();
			String hinhsanpham = jsonObject.get("hinhsanpham").asText();
			String gianhcho = jsonObject.get("gianhcho").asText();
			
			
			sanPham.setChitietsanpham(listChiTiet);
			sanPham.setDanhmucsanpham(danhMucSanPham);
			sanPham.setTensanpham(tensanpham);
			sanPham.setGiatien(giatien);
			sanPham.setMota(mota);
			sanPham.setHinhsanpham(hinhsanpham);
			sanPham.setGianhcho(gianhcho);
			
			sanPhamService.ThemSanPham(sanPham);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@PostMapping(path="CapNhatSanPham")
	@ResponseBody
	public void CapNhatSanPham(@RequestParam String dataJson) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		JsonNode jsonObject;
		try {
			SanPham sanPham = new SanPham();
			jsonObject = objectMapper.readTree(dataJson);
			
			DanhMucSanPham danhMucSanPham = new DanhMucSanPham();
			danhMucSanPham.setMadanhmuc(jsonObject.get("danhmucsanpham").asInt());
			
			JsonNode jsonChiTiet = jsonObject.get("chitietsanpham");
			Set<ChiTietSanPham> listChiTiet = new HashSet<>();
			for (JsonNode objectChiTiet : jsonChiTiet ) {
				ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
				
				MauSanPham mauSanPham = new MauSanPham();
				mauSanPham.setMamau(objectChiTiet.get("mausanpham").asInt());
				
				SizeSanPham sizeSanPham = new SizeSanPham();
				sizeSanPham.setMasize(objectChiTiet.get("sizesanpham").asInt());
				
				chiTietSanPham.setMausanpham(mauSanPham);
				chiTietSanPham.setSizesanpham(sizeSanPham);
				chiTietSanPham.setSoluong(objectChiTiet.get("soluong").asInt());
				
				listChiTiet.add(chiTietSanPham);
			}
			
			String tensanpham = jsonObject.get("tensanpham").asText();
			String giatien = jsonObject.get("giatien").asText();
			String mota = jsonObject.get("mota").asText();
			String hinhsanpham = jsonObject.get("hinhsanpham").asText();
			String gianhcho = jsonObject.get("gianhcho").asText();
			int masanpham = jsonObject.get("masanpham").asInt();
			
			
			sanPham.setChitietsanpham(listChiTiet);
			sanPham.setDanhmucsanpham(danhMucSanPham);
			sanPham.setTensanpham(tensanpham);
			sanPham.setGiatien(giatien);
			sanPham.setMota(mota);
			sanPham.setHinhsanpham(hinhsanpham);
			sanPham.setGianhcho(gianhcho);
			sanPham.setMasanpham(masanpham);
			
			sanPhamService.CapNhatSanPham(sanPham);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@PostMapping(path="LayDanhSachSanPhamTheoMa", produces="application/json; charset=utf-8")
	@ResponseBody
	public JSON_SanPham LayDanhSachSanPhamTheoMa(@RequestParam int masanpham) {
		JSON_SanPham json_sanpham = new JSON_SanPham();
		
		SanPham sanPham = sanPhamService.LayDanhSachChiTietSanPhamTheoMa(masanpham);
		
		json_sanpham.setMasanpham(sanPham.getMasanpham());
		json_sanpham.setTensanpham(sanPham.getTensanpham());
		json_sanpham.setGiatien(sanPham.getGiatien());
		json_sanpham.setMota(sanPham.getMota());
		json_sanpham.setHinhsanpham(sanPham.getHinhsanpham());
		json_sanpham.setGianhcho(sanPham.getGianhcho());

		DanhMucSanPham danhMucSanPham = new DanhMucSanPham();
		danhMucSanPham.setMadanhmuc(sanPham.getDanhmucsanpham().getMadanhmuc());
		danhMucSanPham.setTendanhmuc(sanPham.getDanhmucsanpham().getTendanhmuc());
		
		json_sanpham.setDanhmucsanpham(danhMucSanPham);
		
		Set<ChiTietSanPham> chiTietSanPhams = new HashSet<>();
		
		for (ChiTietSanPham value : sanPham.getChitietsanpham()) {
			ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
			
			chiTietSanPham.setMachitietsanpham(value.getMachitietsanpham());
			
			MauSanPham mausanpham = new MauSanPham();
			mausanpham.setMamau(value.getMausanpham().getMamau());
			mausanpham.setTenmau(value.getMausanpham().getTenmau());
			
			chiTietSanPham.setMausanpham(mausanpham);
			
			SizeSanPham sizesanpham = new SizeSanPham();
			sizesanpham.setMasize(value.getSizesanpham().getMasize());
			sizesanpham.setSize(value.getSizesanpham().getSize());
			
			chiTietSanPham.setSizesanpham(sizesanpham);
			
			chiTietSanPham.setSoluong(value.getSoluong());
			
			chiTietSanPhams.add(chiTietSanPham);
		}
		
		json_sanpham.setChitietsanpham(chiTietSanPhams);
		
		return json_sanpham;
	}
}
