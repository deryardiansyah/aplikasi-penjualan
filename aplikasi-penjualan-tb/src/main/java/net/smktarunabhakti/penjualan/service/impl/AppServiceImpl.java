package net.smktarunabhakti.penjualan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.smktarunabhakti.penjualan.dao.BarangDao;
import net.smktarunabhakti.penjualan.domain.barang;
import net.smktarunabhakti.penjualan.service.AppService;

@SuppressWarnings("unchecked")
@Service("appService")
@Transactional
public class AppServiceImpl implements AppService {

	@Autowired
	public BarangDao barangDao;
	
	public void hapusBarang(barang b) {
		if(b == null || b.getId()==null){
			return;
		}
		barangDao.delete(b);
	}
	
	public void simpanBarang(barang b) {
		barangDao.save(b);
		
	}

	public Long countSemuaBarang() {
		// TODO Auto-generated method stub
		return barangDao.count();
	}
	
	public Page<barang> cariSemuaBarang(Pageable p) {
		// TODO Auto-generated method stub
		return null;
	}


	public barang cariBarangById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
