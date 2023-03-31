package operator.two;

public class Arithmetic_Example {

	public static void main(String[] args) {
		//-,+,*,/,% - 뺄셈, 덧셈, 곱하기, 나누기, 나머지
		//위 연산들의 항이 int 이하인 경우 연산의 결과는 무조건 int형(중요)
		byte a = 1;
		byte b = 1;
		//byte는 int형 이하 - byte끼리 연산하는 경우 결과 int형
		byte c = (byte)(a+b);
		
		int d = 3;
		//int형 이하끼리 결과가 int형이기 때문에 소수형태의 결과를 받고 싶다면
		//연산하는 항들 중 하나는 int보다 커야함(float or double)
		int e = 2;
	    double f = d/e;
		System.out.println(f);
		
	}

}
