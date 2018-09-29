package modul.praktikum.pbo;

public class PrivateModifier {
	private String nama;
	private int umur;
	private void printInfor(){
		System.out.println("private modifier");
	}
	public static void main(String[] args){
		PrivateModifier cek = new PrivateModifier();
		cek.printInfor();
		
	}
}

