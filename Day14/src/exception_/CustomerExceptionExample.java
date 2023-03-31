package exception_;

import java.util.Scanner;

public class CustomerExceptionExample {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		try {
			checkOverlap(arr);
		}
		catch(OverlapException e){
			e.printStackTrace();
		}	
	}
	
	public static void checkOverlap(int[] a) throws OverlapException {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int input = scan.nextInt();
		scan.close();
		for(int i=0; i<a.length; i++) {
			if(input==a[i]) {
				throw new OverlapException("값이 중복되었습니다.");
			}
		}
		System.out.println(input+"는(은) 중복되지 않는 값입니다.");
	}

}
