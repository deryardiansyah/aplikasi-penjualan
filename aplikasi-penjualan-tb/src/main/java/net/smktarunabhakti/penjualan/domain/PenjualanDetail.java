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
	
}
