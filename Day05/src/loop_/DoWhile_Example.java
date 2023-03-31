package loop_;


//Do~While문


public class DoWhile_Example {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		do {//한다
		//do 안에 실행 할 내용 작성 후, while문 조건식
			sum += ++i;
			//sum = sum + ++i;
		}
		while(i < 10);//i가 10이 될[동안]
		//while(i < 0); while문은 한번은 실행하기때문에 출력하면 1까지는 나옴.
		System.out.println(sum);
	}

}

