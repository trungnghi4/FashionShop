package com.NTQ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NTQ.dao.DanhMucDAO;
import com.NTQ.daoimp.DanhMucImp;
import com.NTQ.entity.DanhMucSanPham;

@Service
public class DanhMucService implements DanhMucImp {

	@Autowired
	DanhMucDAO danhMucDAO;
	
	@Override
	public List<DanhMucSanPham> LayDanhMuc() {
		List<DanhMucSanPham> listDanhMucSanPhams = danhMucDAO.LayDanhMuc();
		return listDanhMucSanPhams;
	}

}
