package static_;

public class StaticInitial {

	static{
		//초기화 자 - 생성자보다 먼저실행됨.
		System.out.println("스태틱 초기화자 실행");
	}
	
	public StaticInitial() {
		System.out.println("생성자 실행");
	}
	
}
