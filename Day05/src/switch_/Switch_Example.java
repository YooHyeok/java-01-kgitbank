package switch_;

public class Switch_Example {

	public static void main(String[] args) {

		int a = (int)(Math.random()*100)+1;
		//switch (수식)의 형태로 작성 - 수식의 결과값은 int형 이하의 숫자,
		//string, Enum 형 가능
		switch(a%5) {
		//case (수식의 결과 값) : 해당 경우일 때 코드 내용
		//한 줄 한 줄 읽으며 실행하기 때문에 break가 필요
		//break 없을 시 해당 케이스부터 모든 케이스 전부 실행.
			case 0 : //(a%5 == 0)
				System.out.printf("%d는 5의 배수입니다.",a);
				break;
			case 1 : //(a%5 == 1)
				
			case 2 : //(a%5 == 0)	
				
			case 3 : //(a%5 == 3)
											// case 1,2,3 모두 case3으로 인정
				System.out.printf("%d는 5의 배수가 아닙니다.",a);
				break;	//break를 걸면 해당 조건문에서 종료
			default :	//if문의 else기능과 같음 (case4) - 위의 case들 이외의 나머지 경우
				System.out.printf("%d는 5의 배수에서 1이 모자랍니다.",a);
		}
		
	}

}
