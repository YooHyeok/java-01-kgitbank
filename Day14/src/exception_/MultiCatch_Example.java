package exception_;

public class MultiCatch_Example {

	public static void main(String[] args) {
//		try {
//			a();
//			b();
//			c();
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("a인덱스 예외 발생.");
//			System.out.println("배열의 인덱스 잘못 선택");
//			System.out.println("인덱스: "+e.getMessage());
//
//		}
//		catch(StringIndexOutOfBoundsException e) {
//			System.out.println("b인덱스 예외 발생.");
//			System.out.println("배열의 인덱스 잘못 선택");
//			System.out.println("인덱스: "+e.getMessage());
//
//		}
//		catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		try {
			a();
			b();
			c();
		}
		catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			System.out.println("인덱스 관련 에러 발생");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누시면 안됩니다.");
		}
	}
	
	public static void a() throws ArrayIndexOutOfBoundsException {
		int a = (int)(Math.random()*4);
		String[] data = {"첫번째", "두번째"};
		System.out.println(data[a]);
	}
	
	public static void b () throws StringIndexOutOfBoundsException{
		int a = (int)(Math.random()*4);
		String data = "ab";
		System.out.println(data.charAt(a));
	}
	
	public static void c () throws ArithmeticException{
		int a = (int)(Math.random()*2);
		int c = 3/a;
		System.out.println(c);
	}

}
