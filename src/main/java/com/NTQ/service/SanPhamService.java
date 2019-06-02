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

	public List<SanPham> LayDanhSachSanPhamLimit(int spbatdau) {
		List<SanPham> listSanPhams = sanPhamDAO.LayDanhSachSanPhamLimit(spbatdau);
		return listSanPhams;
	}

}
