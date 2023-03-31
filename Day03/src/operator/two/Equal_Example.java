package operator.two;

public class Equal_Example {

	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		//기본형 데이터는 == 로 비교 가능
		System.out.println(a==b);
		
		int[] ar1 = {1};
		int[] ar2 = {1};
		//참조형 데이터는 주소값을 가지고 있음 - ==연산자는 주소값 비교
		//같은 값이어도 주소가 다른 경우 다르다고 나옴 - 대부분의 참조형
		System.out.println(ar1==ar2);
		
		//String은 하도 많이 쓰이기 때문에 기본형 처럼 쓸 수 있게 구현
		//c,d = 기본형 변수처럼 구현 - 같은 주소 참조 중
		
		String c = "Hello";
		String d = "Hello";
		//e = 참조형 변수처럼 구현 - 같은 값이지만 다른 주소 참조 중
		String e = new String("Hello"); //String을 참조형처럼 표현
		System.out.println(e);
		//같은 주소 참조 중 - true
		System.out.println(c==d);
		//다른 주소 참조 중 - false
		System.out.println(c==e);
		//equals() = 참조형 데이터들의 값을 비교. 주소값x
		//참조형은 이 메서드로 값을 비교해야함.
		System.out.println(c.equals(e));
	}

}
