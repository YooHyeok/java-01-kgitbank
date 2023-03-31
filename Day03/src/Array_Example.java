import java.util.Arrays;

public class Array_Example {

	public static void main(String[] args) {
		//배열의 선언 방법 - type[] name;
		//배열의 초기화 - name = new type[n];
		//ex - int[] intArray = new int [3]; 칸 수만 정하는 경우 각 type의 기본값 할당
		//int[] intArray = {1,2,3}; 배열의 값까지 한꺼번에 지정
		int[] intArray = new int[5];
		System.out.println(intArray);
		//배열은 참조형이기 때문에 주소값 출력
		//값들을 출력하고 싶으면 Arrays안에 있는 메서드 이용 - toString()
		//Arrays - 배열에 관한 메서드들을 만들어 놓은 클래스
		System.out.println(Arrays.toString(intArray));
		//배열의 몇 번째 값 호출 - name[n];
		//자바의 index는 0부터 출발 - 2번째는 1
		System.out.println(intArray[1]);
		int a = intArray[1];
		//배열의 몇번째 값 수정
		intArray[1] = 1;
	}

}
