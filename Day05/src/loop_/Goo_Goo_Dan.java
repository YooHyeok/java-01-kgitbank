package loop_;


//구구단을 단별로 열로 출력하는 코딩.

public class Goo_Goo_Dan {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d*%d=%2d\t",j,i,i*j); //%2d 의 뜻은 자릿수를 지정한것임 a*b=c/a*b= c 의 차이
			}
			System.out.println();//println 의 뜻은 개행
		}
	}

}
