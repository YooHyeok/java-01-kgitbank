package operator.third;

public class ThreeOperator_Example {

	public static void main(String[] args) {
		//((조건식) ? (참일때 값) : (거짓일때 값))
		//Math.random() = double 타입의 0.000...~0.999...까지의 값을 리턴
		//난수 생성 사용 - (int)(Math.random()*n) = 0부터 n-1까지의 정수 생성
		int a = (int)(Math.random()*5); //대문자는 클래스 .뒤는 메서드(함수)
		a = a-2;
		System.out.println(a);
		int b = (a < 0) ? -a : a;

		System.out.println(a);
		
		System.out.println(b);
		System.out.println(oddEven(4));
		//(값,연산식,메서드) ? (값,연산식,메서드) : (값,연산식,메서드) 형태 가능
		System.out.println(twoMultiple(10) ? "참" : "거짓");
	}
	public static String oddEven(int a) {
		return (a % 2 == 1) ? "이 수는 홀수입니다." : "이 수는 짝수입니다.";
		
	}
	public static boolean twoMultiple(int a) {
		return (a % 2 ==0) ? true : false;
		
	}

}
