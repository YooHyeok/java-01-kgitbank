
public class Number_Example {

	public static void main(String[] args) {
		//각 범위를 넘어서는 값은 할당할 수 없음
		//byte = 1byte(8bit), short = 2byte(16bit)
		//int = 4byte(32bit)
//		byte a = 128;
//		short b = 32768;
//		int c = 2147483648;
		
		//long 타입 변수는 어떤 값이든 L이 붙어야 long타입으로 변환
		//기본적으로 모든 정수는 int형으로 취급하기 때문.
		long a = 1L;
		//이진법으로 변수 선언 = 0b(이진법) b값은 4
		byte b = 0b0000_0100;
		//8진법으로 변수 선언 - 0(8진법) c값은 1
		byte c = 001;
		//16진법으로 변수 선언 - 0x(16진법) d값은 11
		int d = 0x00A1;
		
		System.out.println("a="+a+",b="+b+",c="+c+",d="+d);
		//printf메서드는 "출력할 문장의 형태", 문장에 들어갈 변수형태로 작성
		//println보다 값을 출력하기 편함 -0 위 아래 비교 해보세요
		//%d - 정수, %f -소수, %s - 문자열, %c - 문자형
		System.out.printf("a=%d,b=%d,c=%d,d=%d",a,b,c,d);
		
	}

}
