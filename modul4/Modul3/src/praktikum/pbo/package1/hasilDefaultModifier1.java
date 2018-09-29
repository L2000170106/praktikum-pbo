package praktikum.pbo.package1;

import modul.praktikum.pbo.DefaultModifier;
import modul.praktikum.pbo.PublicModifier;
import modul.praktikum.pbo.ProtectedModifier;
import modul.praktikum.pbo.PrivateModifier;

public class hasilDefaultModifier1 {
	public static void main(String[] args){
		// Latihan 1
		DefaultModifier tambah = new DefaultModifier();
		tambah.jumlah(1,3); //terjadi kesalahan saat memanggil method jumlah di class DefaultModifiet
		tambah.jumlah1(2,3);
		
		// Latihan 2
		PublicModifier mod2 = new PublicModifier();
		mod2.kali();
		mod2.tambah();
		mod2.kurang();
		mod2.bagi();
		mod2.rata2();
		
		// Latihan 3
		ProtectedModifier mod3 = new ProtectedModifier();
		mod3.printInfo();
		mod3.sendMessage();
		
		// Latihan 4
		PrivateModifier mod4 = new PrivateModifier();
		mod4.printInfor();
	}
}
