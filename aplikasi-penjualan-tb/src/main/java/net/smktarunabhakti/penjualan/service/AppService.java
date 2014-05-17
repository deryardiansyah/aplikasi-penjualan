package net.smktarunabhakti.penjualan.service;

import net.smktarunabhakti.penjualan.domain.barang;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AppService {

	 void simpanBarang(barang b);
	    void hapusBarang(barang b);
	    Page<barang>cariSemuaBarang(Pageable p);
	    
	    barang cariBarangById(String id);
	    Long countSemuaBarang();


}
