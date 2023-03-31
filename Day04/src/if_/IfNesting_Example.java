package if_;

public class IfNesting_Example {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100)*1;
		
		if (a%2 == 0) {
			if(a%3 == 0) {
				if(a%5 ==0) {
					System.out.printf("%d는(은) 2와 3과 5의 공배수입니다.",a);
				}
				else {
					System.out.printf("%d는(은) 2와 3의 공배수입니다.",a);
				}
			}
			else if(a%5 == 0) {
				System.out.printf("%d는(은) 2와 5의 공배수입니다.",a);
			}
			else {
				System.out.printf("%d는(은) 2의 배수입니다.",a);

			}

		}
		else if(a%3 == 0) {
			if(a%5 == 0) {
				System.out.printf("%d는(은) 3과 5의 배수입니다.",a);
			}
			else {
				System.out.printf("%d는(은) 3의 배수입니다.",a);
			}
		}
		else if(a%5 == 0) {
			System.out.printf("%d는(은) 5의 배수입니다.",a);
		}
		else {
			System.out.printf("%d는(은) 2,3,5의 배수가 아닙니다.",a);

		}
	}
}
