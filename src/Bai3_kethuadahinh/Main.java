package Bai3_kethuadahinh;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		GiaoDich a = new GDVang("123",LocalDate.of(2021,12,02),3000,3,"24K");
		GiaoDich b = new GDTienTe("123",LocalDate.of(2021,12,02),3000,3,"USD",1.3);
		DanhSachGiaoDich P = new DanhSachGiaoDich();
		P.addGD(a);
		P.addGD(b);
		System.out.println(P.toString());
	}

}
