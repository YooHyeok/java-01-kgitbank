
public class Variable_Example {
	
	int b; //멤버(전역)변수
	
	public static void main(String[] args) {
		//변수 선언. 값이 없는 상태여서 사용은 불가
		//int형 데이터, 이름은 a인 변수 선언
		//-21억 얼마 ~ 21억 얼마 의 숫자를 할당 가능
		
		int a;	//변수 지정
		a = 1;	//변수의 초기화 - 변수명 = 값;
				//JAVA의 초기화는 처음으로 값을 할당하는 행위
		System.out.println(a);
		a = a+1; //a에 a+1의 값을 대입. a는 1이므로 a는 2가 됨.
		//JAVA에서의 = 기호는 같다가 아닌 오른쪽을 왼쪽에 할당
		// = 기준 오른쪽 코드가 먼저 실행 후 왼쪽에 할당됨.
		System.out.println(a);
	}

}
