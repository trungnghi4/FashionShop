package com.NTQ.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity(name="CHITIETHOADON")
public class ChiTietHoaDon {
	@Embedded
	ChiTietHoaDonId chiTietHoaDonId;
	int soluong;
	String giatien;
	public ChiTietHoaDonId getChiTietHoaDonId() {
		return chiTietHoaDonId;
	}
	public void setChiTietHoaDonId(ChiTietHoaDonId chiTietHoaDonId) {
		this.chiTietHoaDonId = chiTietHoaDonId;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getGiatien() {
		return giatien;
	}
	public void setGiatien(String giatien) {
		this.giatien = giatien;
	}
	
	
	
}
