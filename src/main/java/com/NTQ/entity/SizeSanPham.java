package com.NTQ.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="SIZESANPHAM")
public class SizeSanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int masize;
	String tensize;
	String size;
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getMasize() {
		return masize;
	}
	public void setMasize(int masize) {
		this.masize = masize;
	}
	public String getTensize() {
		return tensize;
	}
	public void setTensize(String tensize) {
		this.tensize = tensize;
	}
	
	
}
