package Bai3_kethuadahinh;
import java.time.LocalDate;
public class GiaoDich {
	private String maGD;
	private LocalDate ngayGD;
	private double donGia;
	private int soLuong;
	protected double thanhTien;

	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, int soLuong) {
		setMaGD(maGD);
		setNgayGD(ngayGD);
		setDonGia(donGia);
		setSoLuong(soLuong);
	}

	public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public String getMaGD() {
		return maGD;
	}
	
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	
	public double getDonGia() {
		return donGia;
	}
	
	public int getSoLuong() {
		return soLuong;
	}
}
