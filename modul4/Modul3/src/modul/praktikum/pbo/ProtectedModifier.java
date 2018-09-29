package modul.praktikum.pbo;

public class ProtectedModifier {
	protected void printInfo(){
		System.out.println("Protected Modifier");
	}
	protected void sendMessage(){
		System.out.println("this is a message");
	}
	public static void main(String[] args){
		ProtectedModifier cek = new ProtectedModifier();
		cek.printInfo();
		cek.sendMessage();
	}
}
