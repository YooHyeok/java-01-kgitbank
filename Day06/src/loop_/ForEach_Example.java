package loop_;

import java.util.Arrays;

public class ForEach_Example {

	public static void main(String[] args) {
		String a = "abcde";
		for(int i=a.length(); i>0; i--) {
			System.out.print(a.charAt(i-1)); //길이가 5인데 마지막 인덱스는 4 이므로 i(길이)의 값에서 1을 뺀다
		}
		System.out.println();
		
		int[] arr = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {//length뒤에는 괄호가 없으므로 메서드가 아닌 변수
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//forEach문 - for(배열 안의 값 타입 이름 : 배열)
		//배열의 값을 처음부터 하나씩 빼면서 실행 - 기존 for문의 연산 X
		//데이터를 하나씩 사용하는 경우 실행속도가 월등하게 빠름
		for(int b : arr) {
			System.out.print(b+" ");
		}
	}

}
