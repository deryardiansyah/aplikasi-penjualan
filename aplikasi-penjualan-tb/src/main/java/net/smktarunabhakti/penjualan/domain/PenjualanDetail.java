package net.smktarunabhakti.penjualan.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="trx_jual_detail")
public class PenjualanDetail {

	@Id
	@GeneratedValue(generator= "system_uuid")
	@GenericGenerator(name = "system_uuid", strategy = "uuid")
	private String id;
	
	private String header;

	private barang Barang;
	
	@Column(name="total_jumlah")
	private int jumlah;
	
	@Column(name="total_harga")
	private BigDecimal totalHarga;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public barang getBarang() {
		return Barang;
	}

	public void setBarang(barang barang) {
		Barang = barang;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public BigDecimal getTotalHarga() {
		return totalHarga;
	}

	public void setTotalHarga(BigDecimal totalHarga) {
		this.totalHarga = totalHarga;
	}
}
