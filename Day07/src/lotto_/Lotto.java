package lotto_;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		//int a = (int)(Math.random()*45)+1; //로또의 난수를 뽑는 식.
		//a = new int[6] //인트 변수 만들어놓고 배열을 넣는건 안됨. 같은이름으로 같은걸 만들수없음
		int index = 0;
		int[] lotto = new int[6];
		while(true) {//무한반복 무한루프 while true반복문
			//난수뽑기
			
			int rand = (int)(Math.random()*45)+1;
			int i = 0; //바깥을 위한 변수 초기화

//for문을통해 난수를뽑고 중복을 체크하는 코딩문
			for(i=0; i<index; i++) { // i=0 앞에 int를 붙히면 변수를 지정하는것이기떄문에 중복으로 변수가되서 빨간줄이뜸. 
				//i의 범위가 6이 아닌 index인 이유 : 중복때문에 항상 6의범위가 아닌 매번 뽑았을때마다 확인되는 범위로 확인되야함
				if(rand==lotto[i]) {// lotto[i]는 미리 뽑은 난수 i가 중복이 나왔다는 소리
					break;
				}
			}
			if(i==index) {//중복이 없다는 뜻. //for문 바깥에 실행하면 
				lotto[index] = rand;
				index++; // 길이가 6인 배열의 마지막인덱스는5 이므로 1을 더해야 길이를 6으로 인식. 
				//lotto[index++] = rand; //위의 코드를 한문장으로 줄임.
			}
			if(index == 6) //로또 번호를 6개 추출했다는 뜻.
				break;
		}
		System.out.println(Arrays.toString(lotto));
	}
}
