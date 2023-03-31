
public class Method_Example {
	
	public static void main(String[] args) {
		int a = add(100,200);
		System.out.println(a);
		//return // return은 돌려주는 역할도 하지만 메서드를 끝내주는 역할도 함.
	}
	static int add(int a, int b) {	//메서드의 결과값을 돌려주는 코드
		//JAVA의  메서드는 무조건 어떤 값을 return해야만 함
		//return - 뒤의 값을 돌려주거나 메서드를 종료하는 명령어.
		return a+b;
	}

}
