package com.NTQ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NTQ.dao.SanPhamDAO;
import com.NTQ.daoimp.SanPhamImp;
import com.NTQ.entity.SanPham;

@Service
public class SanPhamService implements SanPhamImp {
	@Autowired
	SanPhamDAO sanPhamDAO;

	@Override
	public List<SanPham> LayDanhSachSanPhamLimit(int spbatdau) {
		List<SanPham> listSanPhams = sanPhamDAO.LayDanhSachSanPhamLimit(spbatdau);
		return listSanPhams;
	}

	@Override
	public boolean XoaSanPhamTheoMaSanPham(int masanpham) {
		return sanPhamDAO.XoaSanPhamTheoMaSanPham(masanpham);
	}

	@Override
	public boolean ThemSanPham(SanPham sanPham) {
		return sanPhamDAO.ThemSanPham(sanPham);
	}

	@Override
	public SanPham LayDanhSachChiTietSanPhamTheoMa(int masanpham) {
		SanPham sanPham = sanPhamDAO.LayDanhSachChiTietSanPhamTheoMa(masanpham);
		return sanPham;
	}

	@Override
	public boolean CapNhatSanPham(SanPham sanPham) {
		return sanPhamDAO.CapNhatSanPham(sanPham);
	}

}
