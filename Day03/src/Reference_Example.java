import java.util.Arrays;

public class Reference_Example {

	public static void main(String[] args) {
		int[] ar1 = {1,2,3,4,5};
		//ar2에 넘어간건 ar1의 값들이 아닌 주소값 - 같은 곳을 참조하는 형태
		int[] ar2 = ar1;
		
		System.out.println(Arrays.toString(ar1));
		//같은 곳의 값들을 수정 중 - ar1을 통해서 참조해도 같은결과가 나옴
		ar2[0] = 6;
		ar2[2] = 7;
		System.out.println(Arrays.toString(ar1));
		int a = 4;
		int b = a;
		System.out.println(a);;
		b = 7;
		System.out.println(a);
	}

}
