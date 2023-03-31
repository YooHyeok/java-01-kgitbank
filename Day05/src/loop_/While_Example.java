package loop_;

public class While_Example {
	public static void main(String[] args) {
		//while(조건식) - 조건식이 참인 경우에 실행
		int i = 0;
		int sum = 0;
		while(i < 10) { //i++이므로 11까지 진행됨 그래서 10까지
			i++; //++i;
			sum += i;
			//sum += ++i; => i의 값을 먼저 증가시키고 그 값이 10이 되기 전까지 변수 sum에 대입 하여 누적으로 합한다.
		}
		System.out.printf("i의 0부터 10까지의 합.%d",sum);
		
		int a = 0;
		int b = 0;
		while(true) { //while문은 참일때 실행이므로 무한루프는 true를 만족하는 조건식 입력.
			a++;
			b += a;	
			if (a == 10) {//a가 10이 되었을때 탈출
				break;
			}
		}
		System.out.printf("i의 0부터 10까지의 합.%d",b);

	}
}
