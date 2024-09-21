package Bai3_kethuadahinh;

public class DanhSachGiaoDich {
	private int count;
	private GiaoDich[] ds;
	public DanhSachGiaoDich() {
		ds = new GiaoDich[20];
		count=0;
	}
	
	public void addGD(GiaoDich a) {
		ds[count]=a;
		count++;
	}
	
	public String toString() {
		String s="";
		for(int i=0;i<count;i++) {
			s+=String.format("%s%20s%20.3f%10d\n",ds[i].getMaGD(),ds[i].getNgayGD(),ds[i].getDonGia(),ds[i].getSoLuong());
		}
		return s;
	}

}
