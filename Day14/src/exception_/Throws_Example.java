package exception_;

public class Throws_Example {

	public static void main(String[] args) {
		try {
		a();
		}catch(Exception e) {//Exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void a() throws Exception {
		String a = null;
		System.out.println(a.charAt(0));
	}

}
