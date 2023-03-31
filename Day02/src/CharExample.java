
public class CharExample {

	public static void main(String[] args) {
		//char형의 literal(될 수 있는 값)은 ''
		//" "는 문장(String)으로 받아들임
		// \\u0000~\\uFFFF 안의 값을 가짐
		char a = '맘';
		char b = '\u1230';
		char c = '\t';
		
		System.out.printf("c=%c b=%c a=%c\n",c,b,a);
		
		// \t = 8칸 공백 (탭) 의미, \r = 커서를 행의 첫 번째로 돌림
		// \n = 개행문자(enter), \' = 문장 안에 '표시
		// \" = 문장안에 " 표시, \\ = 문장 안에 \ 표시
		System.out.println("\"dream\"");
		
		//char형과 숫자를 더하면 결과값이 숫자로 나옴 - 문자열은 문자로

		int d = a+10;
		System.out.println(d);
	}

}
