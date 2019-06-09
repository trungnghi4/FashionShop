package com.NTQ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NTQ.dao.MauSanPhamDAO;
import com.NTQ.daoimp.MauSanPhamImp;
import com.NTQ.entity.MauSanPham;

@Service
public class MauSanPhamService implements MauSanPhamImp {
	@Autowired
	MauSanPhamDAO mauSanPhamDAO;

	@Override
	public List<MauSanPham> LayDanhSachMau() {
		return mauSanPhamDAO.LayDanhSachMau();
	}
	
}
