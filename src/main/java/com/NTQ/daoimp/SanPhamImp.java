package com.NTQ.daoimp;

import com.NTQ.entity.SanPham;

import java.util.List;

public interface SanPhamImp {
	List<SanPham> LayDanhSachSanPhamLimit(int spbatdau);
	boolean XoaSanPhamTheoMaSanPham(int masanpham);
}
