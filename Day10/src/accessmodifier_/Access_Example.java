package accessmodifier_;

public class Access_Example {

	//public, protected, package friendly, private
	//접근제한자 - 멤버들의 참조 범위를 제한. 넓은것부터 좁은것 순
	//public = 모든 곳에서 참조 가능 (프로젝트가 다르면 불가)
	//protected = 다른 패키치면 참조 불가. 단! 상속관계가 있다면 가능
	//package friendly = 다른 패키지면 절대 불가.
	//private = 내 클래스 이외에서는 참조 불가.
	public int a;
	protected int b;
	int c;
	private int d;
	
	
	
}
