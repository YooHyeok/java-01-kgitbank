package static_;

import java.util.Arrays;

public class StaticMethod_Example {
	public static void main(String[] args) {
		//static메서드를 선언하는 경우
		//1. 호출 횟수가 굉장히 많을 때 - 인스턴스 메서드로 선언된다면
		//호출 할 때마다 계속 인스턴스를 생성 후 호출해야 하기 때문에
		// static선언으로 빠른 호출 가능 (인스턴스  생성 X)
		System.out.println();
		//2. 인스턴스 변수가 필요 없는 경우 - Person의 setName()을
		//생각해보면 this.name, 즉 인스턴스 변수를 다루는 코드가 존재.
		//인스턴스 변수를 다룬다 - 인스턴스에 결과가 종속된다
		//this.name의 값을 변경 - 해당 인스턴스의 이름값을 변경
		//따라서 인스턴스가 필요한 경우에는 static이 붙으면 안되지만
		//반대의 경우는 굳이 인스턴스를 통해서 호출할 필요가 없기 때문에 static 사용
		//매개변수, 지역변수 사용 (메서드 안에서)
		System.out.println("출력값");
		int[] a = {1,2,3};
		System.out.println(Arrays.toString(a));
		//int b = (int)"123"; (X)
		// 문자를 숫자로 변경하는 메서드
		int b = Integer.parseInt("123");
		int c = (int)(Math.random()*10);
		
		
	}
}
