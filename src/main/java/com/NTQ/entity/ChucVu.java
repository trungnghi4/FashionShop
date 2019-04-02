package com.NTQ.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CHUCVU")
public class ChucVu {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int machucvu;
	String tenchucvuString;
	public int getMachucvu() {
		return machucvu;
	}
	public void setMachucvu(int machucvu) {
		this.machucvu = machucvu;
	}
	public String getTenchucvuString() {
		return tenchucvuString;
	}
	public void setTenchucvuString(String tenchucvuString) {
		this.tenchucvuString = tenchucvuString;
	}
	
	
}
