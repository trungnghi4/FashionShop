package com.NTQ.dao;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.NTQ.daoimp.NhanVienImp;
import com.NTQ.entity.NhanVien;

@Repository
@Scope(proxyMode=ScopedProxyMode.TARGET_CLASS)
public class NhanVienDAO implements NhanVienImp{
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean KiemTraDangNhap(String email,String matkhau) {
		Session session = sessionFactory.getCurrentSession();
		try {
			NhanVien nhanVien= (NhanVien) session.createQuery("from NHANVIEN where tendangnhap='"+ email+"' AND matkhau='"+matkhau+"'").getSingleResult();
			if(nhanVien !=null) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {

			return false;
		}

	}
}
