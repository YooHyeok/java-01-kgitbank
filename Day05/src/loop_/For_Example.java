package loop_;

public class For_Example {
	public static void main(String[] args) {
		
		int sum = 0; //반복문 안에 넣는다면 초기값이 계속 0으로 반복하여 초기화되므로 전역변수로 지정
		//변수 i = iterrator 반복한다는 뜻.(이지만 변수 명일뿐)
		for(int i = 0; i < 11; i++) { //i=i+2 or (i++)++ 가능
						
			sum = sum + i;
			//조건식을 먼저 확인하
		//초기값 지정 - 조건식 확인 - 실행 - 증감표현식 실행 - 실행 - 증감표현식 실행 - 실행 - 증감ㅍ... 실행 의 순서
		}
		System.out.println(sum);
	}
}
