package com.NTQ.daoimp;

import com.NTQ.entity.NhanVien;

public interface NhanVienImp {
	boolean KiemTraDangNhap(String email,String matkhau);
	boolean ThemNhanVien(NhanVien nhanVien);
}
