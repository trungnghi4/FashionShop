package com.NTQ.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.NTQ.daoimp.SanPhamImp;
import com.NTQ.entity.ChiTietHoaDon;
import com.NTQ.entity.ChiTietHoaDonId;
import com.NTQ.entity.ChiTietSanPham;
import com.NTQ.entity.SanPham;

@Repository
@Scope(proxyMode=ScopedProxyMode.TARGET_CLASS)
public class SanPhamDAO implements SanPhamImp{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public SanPham LayDanhSachChiTietSanPhamTheoMa(int masanpham) {
		Session session = sessionFactory.getCurrentSession();
		String query = "from SANPHAM where masanpham=" + masanpham;
		SanPham sanPham = (SanPham) session.createQuery(query).getSingleResult();
		return sanPham;
	}
	
	@Override
	@Transactional
	public List<SanPham> LayDanhSachSanPhamLimit(int spbatdau) {
		Session session = sessionFactory.getCurrentSession();
		List<SanPham> listSanPhams = new ArrayList<>();
		if (spbatdau < 0) {
			String query = "from SANPHAM";
			listSanPhams = (List<SanPham>) session.createQuery("from SANPHAM").getResultList();
		}
		else {
			listSanPhams = (List<SanPham>) session.createQuery("from SANPHAM").setFirstResult(spbatdau).setMaxResults(5).getResultList();
		}
		return listSanPhams;
	}

	@Override
	@Transactional
	public boolean XoaSanPhamTheoMaSanPham(int masanpham) {
		Session session = sessionFactory.getCurrentSession();
		SanPham sanPham = session.get(SanPham.class, masanpham);
		
		Set<ChiTietSanPham> chiTietSanPhams = sanPham.getChitietsanpham(); 
		
		for (ChiTietSanPham chiTietSanPham : chiTietSanPhams) {
			session.createQuery("delete CHITIETHOADON WHERE machitietsanpham=" + chiTietSanPham.getMachitietsanpham()).executeUpdate();
		}
		session.createQuery("delete CHITIETSANPHAM WHERE masanpham=" + masanpham).executeUpdate();
		session.createQuery("delete SANPHAM WHERE masanpham=" + masanpham).executeUpdate();
		return true;
	}

	@Override
	@Transactional
	public boolean ThemSanPham(SanPham sanPham) {
		Session session = sessionFactory.getCurrentSession();
		Serializable id = session.save(sanPham);
		return false;
	}

	@Override
	@Transactional
	public boolean CapNhatSanPham(SanPham sanPham) {
		Session session = sessionFactory.getCurrentSession();
		session.update(sanPham);
		
		return false;
	}
	
	
}
