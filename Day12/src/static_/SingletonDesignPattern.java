package static_;

public class SingletonDesignPattern {

	public static void main(String[] args) {
//		MyConnection con = new MyConnection();
		MyConnection con1 = MyConnection.getMyConnection(); //.getMyConnetcion();
		MyConnection con2 = MyConnection.getMyConnection(); //.getMyConnetcion();
		
		System.out.println(con1); //실제 주소값.
		System.out.println(con2);
		System.out.println(con1==con2);
	}
}
