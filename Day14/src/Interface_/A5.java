package Interface_;

public class A5 implements A3, A4{ //A3 - A1,A2,A3 , A4



	@Override
	public void a1() {
		System.out.println("a1 실행");
	}

	@Override
	public void a2() {
		System.out.println("a2 실행");
	}

	@Override
	public void a3() {
		System.out.println("a3 실행");
	}

	@Override
	public void a4() {
		System.out.println("a4 실행");
	}

	public static void main(String[] args) {
		A5 a5 = new A5();
		//a5는 모든 메서드 구현 - 모든 메서드 사용 가능
		a5.a1(); a5.a2(); a5.a3(); a5.a4();
		//a4타입으로 바뀌면 a4 메서드만 사용 가능
		//a4인터페이스에 있는것만 사용 가능 하기 때문
		A4 a4 = a5;
		a4.a4();
		//a3타입으로 바뀌면 a3 인터페이스에 있는
		//a1, a2, a3만 사용 가능
		A3 a3 = a5;
		//a4를 사용하고 싶은 경우 형변환을 통해 사용 가능
		A4 a = (A4)a3;
	}
	
}