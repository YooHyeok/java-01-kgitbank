package exception_;

public class Runtime_Example {

	public static void main(String[] args) {
		castExample();
		
	}
	
	public static void indexExample() {
		String[] a = new String[3];
		for(int i = 0; i < 5; i++) {
			System.out.print(a[i]);
		}
	}
	
	public static void nullExample() {
		String a = null;
		if(a==null) {
			System.out.println("널 사용");
		}
		System.out.println(a.charAt(0));
	}
	
	public static void castExample() {
		Integer a = 10;
		Object b = a;
		String c = (String)b;
		System.out.println(c);
		int d = Integer.parseInt("123");
		String e = String.valueOf(10);
	}

}
