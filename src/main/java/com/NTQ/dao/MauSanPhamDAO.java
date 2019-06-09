package com.NTQ.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.NTQ.daoimp.MauSanPhamImp;
import com.NTQ.entity.MauSanPham;

@Repository
@Scope(proxyMode=ScopedProxyMode.TARGET_CLASS)
public class MauSanPhamDAO implements MauSanPhamImp {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<MauSanPham> LayDanhSachMau() {
		Session session = sessionFactory.getCurrentSession();
		String query = "from MAUSANPHAM";
		List<MauSanPham> listMauSanPham = session.createQuery(query).getResultList();
		return listMauSanPham;
}
