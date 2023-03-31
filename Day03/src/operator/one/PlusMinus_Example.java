package operator.one;

public class PlusMinus_Example {

	public static void main(String[] args) {
		//++, -- - 증감 연산자. 항의 값을 하나씩 올리거나 하나씩 감소시킴
		//항의 앞에 붙느냐 뒤에 붙느냐에 따라서 전위, 후위 연산자로 갈림 - 주위값이 변경됨
		//전위 연산자는 연산부터 실행, 후위 연산자는 연산을 문장으로 가장 마지막에 실행.
		int a = 1;
		//전위연산자 - 연산부터 실행. b = 2;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		int i = 1;
		//후위 연산자 - 연산을 가장 마지막에 실행. j = 1; 코드 이후 i값이 올라감
		int j = i++;// 후위연산자이므로 j가 1인 상태에서 1증가
		System.out.println(i);
		System.out.println(j);

	}

}
