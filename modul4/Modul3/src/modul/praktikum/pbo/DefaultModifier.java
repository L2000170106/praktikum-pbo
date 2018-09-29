package modul.praktikum.pbo;

public class DefaultModifier {
	int a = 1;
	int b = 2;
	int c;
	void jumlah(int a, int b){ // tidak bisa dieksekusi di class hasilDefaultModifier
		c = a + b ;
		System.out.println(c);
	}
	public void jumlah1(int a, int b){ // bisa dieksekusi di class hasilDefaultModifier
		c = a + b ;
		System.out.println(c);
	}
}
