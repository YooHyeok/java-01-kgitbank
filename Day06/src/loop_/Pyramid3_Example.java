package loop_;

public class Pyramid3_Example {

	public static void main(String[] args) {
		//증가하는 정삼각형 피라미드
		for(int i=0; i<4; i++) {
			for(int t=3; t>i-1; t--) {//t는 공백을 한줄에 반복한 횟수만큼 출력하는 반복문
				//int t=4; t>i; t--
				//정석 : int t=0; t<4-i; t++

				//2차 for문의 t의 범위는 " "의 갯수를 줄의 수에 맞게 감소시켜 출력하는 반복문
				//t>i-1이 참이 됬을때 반복문 실행.
				//1번째 줄 : i = 0 /조건식: 4 > 0 - 1 참 이므로 t-- 적용후 거짓이 될때까지 조건식 t > i-1 을 반복하여 출력
				//1차for문으로 나가서 i값을 증가시킨다
				//2번째 줄 : i = 2 /조건식: 4 > 2 - 1 참 이므로 t-- 적용후 거짓이 될때까지 조건식 t > i-1을 반복하여 출력
				//1차for문으로 나가서 i값을 증가시킨다
				//3번째줄 ~
				//1차for문으로 나가서 i값을 증가시킨다
				//4번째줄~
				//1차for문으로 나가서 i값을 증가시킨다
				//5번째줄~
				//반복문 종료.
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				if(j==0 || j==2*i) {
					System.out.print("*");
				}
				else {
					if(j%2==1) {
						System.out.print(" ");
					}
					else {
						System.out.print("$");
					}

				}

			}
			System.out.println();
		}
		//감소하는 정삼각형 피라미드
		for(int i=1; i<5; i++) {//큰 틀의 실행 횟수를 말함
			for(int t=1; t<i+1; t++){ //공백이 0부터 시작한다.
				//int t=0; t<i; t++ //조건식과 t의초기값이 성립이안되기떄문에 출력안됨
				//int t
				//t가 1인 이유는 1일때 조건식이 거짓으로 판명되어 출력하지 않음 = 첫번째줄은 출력하지 않게된다.
				System.out.print(" ");
			}
			for(int j=0; j<9-i*2; j++) { //j=10; j>i*2
				if(j==0 || j==8-2*i) {
					System.out.print("*");
				}
				else {
					if(j%2==1) {
						System.out.print(" ");
					}
					else {
						System.out.print("$");
					}

				}
			}
			System.out.println();
		}
	}
}

	/*

	 */

