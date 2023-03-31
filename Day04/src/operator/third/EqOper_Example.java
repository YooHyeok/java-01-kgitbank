package operator.third;

public class EqOper_Example {

	public static void main(String[] args) {
		// op= - 대입 연산자. 값을 대입하면서 연산 실행
		// ex) (a += 2) = (a = a+2)
		
		int a = 3;
		//a *= 3;
		System.out.println(a);
		// 대입 연산자는 =이 뒤에. =이 앞으로 가면 대입 연산자가 아닌
		// 할당 연산자로 바뀌어서 실행디므로 실행이 안되거나 결과값이 달라짐
//		a = *3;
	}

}
