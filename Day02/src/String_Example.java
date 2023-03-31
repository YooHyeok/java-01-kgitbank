
public class String_Example {

	public static void main(String[] args) {
		String a = "Hello World!";
		String b = new String("Hello World!");
		
		//String은 여러 char형 데이터가 연속으로 나열되어 있는 형태
		//선언을 char형의 unicode 값으로 선언할 수 있음
		String c = "\uAC02\uAD01";
		//숫자 또는 다른 기본형 데이터와 문자를 더하는 경우
		//결과값이 문자로 나옴
		int i = 10;
		a = a+i;
		System.out.println(a); 	//Hello World!10
		a = a+i;
		System.out.println(a);	//Hello World!1010
		//문자 + 숫자 + 숫자 = 문자(숫자)(숫자)
		//숫자 + 숫자 + 문자 = (숫자끼리 더한 값)문자 - 연산을 왼쪽부터 순서대로
		b = i+i+b;
		System.out.println(b); 	//20 Hello World!
		
		//nullString = 아무것도 없는 문자열. 문자열은 존재
		String d = "";
		//null = 참조형 데이터들의 기본값. 아무것도 없음
		String e = null;
		//blankString = 공백 하나 존재. 길이도 1
		String f = " ";
	}

}
