package operator.one;

public class TypeCast_Example {

	public static void main(String[] args) {
		byte a = 1;
		//암묵적 형변환 - 작은 값을 큰 값에 넣을 때는 자동실행
		int b = a;
		
		int c = 1;
		//형변환 필요 - 32bit를 8bit에 집어 넣을 수 없기 때문에 형변환 연산자 사용
		//형변환 연산자 - (type)변수;
		//기본형 끼리 가능 - boolean만 불가
		byte d = (byte)c;
		
		System.out.println(d);
		
		//형변환은 남는 bit를 자름 - 안의 값이 범위를 넘어서는 값이었다면 변경됨
		c = 128; //24bit (0) + 1000_0000;
		d = (byte)c; // 앞의 24bit다 자름 = 1000_0000 값 할당;
		//byte상에서 1000_0000은 -128 
		System.out.println(d);
	}

}
