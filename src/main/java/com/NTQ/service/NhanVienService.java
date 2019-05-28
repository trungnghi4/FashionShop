package com.NTQ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NTQ.dao.NhanVienDAO;
import com.NTQ.daoimp.NhanVienImp;
import com.NTQ.entity.NhanVien;

@Service
public class NhanVienService implements NhanVienImp {
	@Autowired
	NhanVienDAO nhanVienDAO;

	public boolean KiemTraDangNhap(String email, String matkhau) {

		boolean kiemtra = nhanVienDAO.KiemTraDangNhap(email, matkhau);
		return kiemtra;
	}

	public boolean ThemNhanVien(NhanVien nhanVien) {
		boolean ktThem = nhanVienDAO.ThemNhanVien(nhanVien);
		return ktThem;
	}

}
