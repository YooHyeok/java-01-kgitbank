package lotto_;


//중복제거 코딩


public class Overlap_Example {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int b = (int)(Math.random()*20)+1;
		int i = 0;
		for(i=0; i<a.length; i++) {
			if(a[i]==b) {//중복여부. 중복이 됬다.
				break;
			}
		}
		if(i==10) {
			System.out.printf("a는 %d\n",b);
			System.out.println("중복이 되지 않습니다.");
		}
		else {
			System.out.printf("a는 %d\n",b);
			System.out.println("a가 중복 되었습니다.");
		}
	}
}
