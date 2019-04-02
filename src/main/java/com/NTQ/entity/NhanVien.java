package com.NTQ.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="NHANVIEN")
public class NhanVien {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int manhanvien;
	String hoten;
	String diachi;
	String cmnd;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="machucvu")
	ChucVu chucvu;
	
	String email;
	String matkhau;
	
	public int getManhanvien() {
		return manhanvien;
	}
	public void setManhanvien(int manhanvien) {
		this.manhanvien = manhanvien;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public ChucVu getChucVu() {
		return chucvu;
	}
	public void setChucVu(ChucVu chucVu) {
		this.chucvu = chucVu;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	
}
