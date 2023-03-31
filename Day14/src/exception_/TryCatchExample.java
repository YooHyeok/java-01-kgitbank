package exception_;

public class TryCatchExample {

	public static void main(String[] args) {
		arith(
				);
		a();
	}

	public static void a() {
		int a = (int)(Math.random()*4);
		String[] data = {"안녕","하세요"};
		try {
			System.out.print(data[a]);
		
		}
		catch(Exception e) {
			//에러의 발생 위치 추적 및 원인 메세지 전부 출력 = 빨간글자!
			e.printStackTrace();
			//에러의 원인 메세지
			System.out.println(e.getMessage());
		}
		System.out.println("정상 실행 완료");
	}
	
	public static void arith() {
		int a = 0;
		int b = 3;
		try {
		int c = b/a;
		System.out.println(c);

		}
		catch(ArithmeticException e){
			System.out.println("정상실행 완료");
			
		}
	
	}

}
