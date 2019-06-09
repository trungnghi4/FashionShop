package com.NTQ.daoimp;

import com.NTQ.entity.SanPham;

import java.util.List;

public interface SanPhamImp {
	List<SanPham> LayDanhSachSanPhamLimit(int spbatdau);
	SanPham LayDanhSachChiTietSanPhamTheoMa(int masanpham);
	boolean XoaSanPhamTheoMaSanPham(int masanpham);
	boolean ThemSanPham(SanPham sanPham);
	boolean CapNhatSanPham(SanPham sanPham);
}
