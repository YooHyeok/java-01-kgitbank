package if_;

public class ElseIf_Example {
	public static void main(String[] args) {
		int a = (int)(Math.random()*100)*1;
		
		if (a%2 == 0) {
			System.out.printf("%d는 2의 배수입니다.",a);
		}
		else if(a%3 == 0) {
			System.out.printf("%d는 3의 배수입니다.",a);
		}
		else if(a%5 == 0) {
			System.out.printf("%d는 5의 배수입니다.",a);
		}
		else {
			System.out.printf("%d는 2,3,5의 배수가 아닙니다.",a);

		}
	}
}
