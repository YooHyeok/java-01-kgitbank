package final_;

public class FinalMember {

	//final 멤버변수 : 1.선언, 2.초기화자, 3.기본생성자 안에서 무조건 초기화가 되어야 함 
	// 이후에는 기본값 할당되어 값 변경 불가능
	//Object의 생성자를 참조하기 전에 유저가 원하는 값을 할당할 수 있도록
	//만들어 놓은 로직
	
//	final int a = 10; //- 선언시
//	{
//		a = 10; // - 초기화자
//	}
//	public FinalMember() {
//		a = 10;
//	}
	
	public static void main(String[] args) {
		String a = "123";
		a(a);
		a = "234";
	}
	
	public static void a(final String data) {
		
	}
}
