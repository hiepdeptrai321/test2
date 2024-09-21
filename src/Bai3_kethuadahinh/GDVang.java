package Bai3_kethuadahinh;

import java.time.LocalDate;

public class GDVang extends GiaoDich {
	private String loaiVang;

	public GDVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		setThanhTien();
		setLoaiVang(loaiVang);
	}	
	
	public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

	public void setThanhTien() {
		this.thanhTien = getSoLuong() * getDonGia();
	}
}
