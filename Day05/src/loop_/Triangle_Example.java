package loop_;

/*
*      *****       *   	*****
**      ****      **    ****
***      ***     ***    ***
****   	  **    ****    **
*****      *   *****    *
*/

public class Triangle_Example {
//1차 for문의 i의 범위는  줄의 범위 (5줄) j의 범위는
   public static void main(String[] args) {
//좌정렬 증가 삼각형
      for(int i=0; i<5; i++) {   //1차 for문의 조건식에 맞춰 2차 for문 반복.
         //1차 for문의 i의 범위는  줄의 증감 반복문 (5줄) 
         //0부터 시작하면 0,1,2,3,4 5번 반복하기 위해서는 
         //순차적으로 1씩 증감시켜 값이 i값이 5가 될때까지 반복후
         //i의 범위 값이 5보다 작으므로  i가 5가 되었을때는 출력하지 않고 종료(4까지).
         //***양키들의 범위에 대한 갯수 초기값 계산법을 기억할것***
         for(int j=0; j<i+1; j++) { //2차 for문의 조건식에 맞춰  * 한줄 출력.
            //2차 for문의 j의 범위는 *의 갯수 증감 반복문 이므로
            //j의 범위값을 5가 아닌 i+1로 준 이유는
            //j의 범위가 5 라면 한줄에 5개씩 반복되서 5개의별을 출력하게된다
            //그러므로 i값이 순차적으로 증가함에 맞춰 j의 범위도 함께 증가시켜줘야
            //순차적인 *의 갯수가 출력된다
            System.out.print("*");   
         }
         System.out.println(); // 2차 for문의 * 출력 후 줄개행
      }
      System.out.println("\n");

//좌정렬 감소 삼각형      
      for(int i=0; i<5; i++) {
         //1차 for문의 i의 범위는 줄의 증감 반복문 (5줄)
         //0부터 시작해서 0,1,2,3,4 / 총 5회 반복
         //초기값을 0, 조건식을 i<5 (i는 0을 시작으로 5회 반복이므로 4까지)
         for(int j=4; j>i-1; j--) { //j < 10  j > 10
            //2차 for문의 j의 범위는 *의 갯수를 줄의 수에 맞게 감소시켜 출력하는 반복문
            //j>i-1이 참이 됬을때 반복문 실행.
            //1번째 줄 : i = 0 /조건식: 4>0-1 참 이므로 j-- 적용후 거짓이 될때까지 조건식 j > i-1 을 반복하여 출력
            //1차for문으로 나가서 i값을 증가시킨다
            //2번째 줄 : i = 2 /조건식: 4>2-1 참 이므로 j-- 적용후 거짓이 될때까지 조건식 j > i-1을 반복하여 출력
            //1차for문으로 나가서 i값을 증가시킨다
            //3번째줄 ~
            //1차for문으로 나가서 i값을 증가시킨다
            //4번째줄~
            //1차for문으로 나가서 i값을 증가시킨다
            //5번째줄~
            //반복문 종료.
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println("\n");

//우정렬 증가 삼각형 (감소하는 공백형태의 삼각형 형태로 출력하고 마지막은 *출력)
      for(int i=0; i<5; i++) {

         for(int t=3; t>i-1; t--) {//1번 for문 (공백출력/감소)
            System.out.print(" ");
         }
         for(int j=0; j<i+1; j++) {//2번 for문 (*출력/증가)
            System.out.print("*");
         }
         System.out.println();

      }
      System.out.println("\n");

//우정렬 감소 삼각형 (증가하는 공백형태의 삼각형과 감소하는 *삼각형 출력)
      for(int i=0; i<5; i++) { //행
         for(int t=1; t<i+1; t++) {
            System.out.print(" ");
         }
         for(int j=4; j>i-1 ; j--) {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println("\n");
      
//증가하는 정삼각형 피라미드
      for(int i=0; i<5; i++) {
         for(int t=3; t>i-1; t--) {//t는 공백을 한줄에 반복한 횟수만큼 출력하는 반복문
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
            System.out.print("*");
            
         }
         System.out.println();
      }
      System.out.println("\n");

      
//감소하는 정삼각형 피라미드
      for(int i=0; i<5; i++) {
         for(int t=1; t<i+1; t++){ //공백이 0부터 시작한다.
            //t가 1인 이유는 1일때 조건식이 거짓으로 판명되어 출력하지 않음 = 첫번째줄은 출력하지 않게된다.
            System.out.print(" ");
         }
         for(int j=8; j>i*2-1; j--) { //j=10; j>i*2
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println("\n");
   }
}
/*
//답안
  
      for(int i=0; i<dan; i++) { 
         for(int j=0; j<i; j++) {
            System.out.print(" "); 
         }
         for(int j=0; j<2*dan-(2*i)-1; j++) { 
            System.out.print("*"); 
         }
         System.out.println(); 
      }
      System.out.println("\n");
   }
}
*/
//숙제- 중복for문 이해하고 피라미드 출력하기.

