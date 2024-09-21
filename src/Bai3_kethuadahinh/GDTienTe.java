package Bai3_kethuadahinh;

import java.time.LocalDate;

public class GDTienTe extends GiaoDich{
	private double tyGia;
	private String loaiTien;
	public GDTienTe(String maGD, LocalDate ngayGD, double donGia, int soLuong,String loaiTien,double tyGia) {
		super(maGD, ngayGD, donGia, soLuong);
		if(loaiTien.equals("USD") || loaiTien.equals("Euro")) setThanhTienUE(tyGia);
		else setThanhTienVN();
	}
	public void setThanhTienUE(double tyGia) {
		this.thanhTien= this.getSoLuong()*this.getDonGia()*tyGia;
	}
	
	public void setThanhTienVN() {
		this.thanhTien= this.getSoLuong()*this.getDonGia();
	}
	
	
}
