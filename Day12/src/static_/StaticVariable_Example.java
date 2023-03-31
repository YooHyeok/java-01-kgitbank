package static_;

public class StaticVariable_Example {

	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		//a와 b는 자동초기화 = 0 이 되어있기 때문에 전부 1값 출력
		System.out.printf("c1의 a값 : %d, b값: %d\n", c1.a, c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		//a는 인스턴스 변수이기 때문에 각 인스턴스 별로 존재하지만
		//b는 static이 붙은 클래스 변수이기 때문에 모든 인스턴스에 공유
		//c1.b와 c2.b는 같은 값을 참조중 - 1++; 와 같기 때문에 2값 출력
		System.out.printf("c2의 a값 : %d, b값: %d\n", c2.a, c2.b);
		//b는 클래스변수이기 때문에 인스턴스 없이 참조 가능 - 클래스 명으로 참조
		Count.b++;
		Count c3 = new Count();
		//b는 c1, c2, c3 Count를 통해서 모두 같은 장소를 참조하고 있기
		//때문에 (공유) 최종 값은 3이 출력됨. 
		System.out.println("c3의 b값: "+c3.b);
	}

}
