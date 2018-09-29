package modul.praktikum.pbo;

public class PublicModifier {
	public int a = 2 ;
	public int b = 5 ;
	public int c = 9 ;
	public void kali(){
		int d = a * b * c ;
		System.out.println(d);
	}
	
	public void tambah(){
		int e = a + b ;
		System.out.println(e);
	}
	
	public void kurang(){
		int f = c - b ;
		System.out.println(f);
	}
	
	public void bagi(){
		int g = b / a ;
		System.out.println(g);
	}
	
	public void rata2(){
		int t = (a + b + c)/3 ;
		System.out.println(t);
	}
	
	public static void main(String[] args){
		PublicModifier cek = new PublicModifier();
		cek.kali();
		cek.tambah();
		cek.bagi();
		cek.kurang();
	}
}
