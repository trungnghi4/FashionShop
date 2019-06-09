package com.NTQ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NTQ.dao.SizeSanPhamDAO;
import com.NTQ.daoimp.SizeSanPhamImp;
import com.NTQ.entity.SizeSanPham;

@Service
public class SizeSanPhamService implements SizeSanPhamImp{

	@Autowired
	SizeSanPhamDAO sizeSanPhamDAO;
	
	@Override
	public List<SizeSanPham> LayDanhSachSize() {
		return sizeSanPhamDAO.LayDanhSachSize();
	}

}
