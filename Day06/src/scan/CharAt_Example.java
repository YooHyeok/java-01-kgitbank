package scan;

import java.util.Scanner;

public class CharAt_Example {

	public static void main(String[] args) {
		String a = "Hello World!";
		//charAt(index) - String 속의 index번째 글자 리턴
		//char 값으로 리턴 - String 으로 리턴하지 않음.
		a.charAt(6);
		
		System.out.println(a.charAt(6));
		for (int i=12; i>0; i--) {
			System.out.print(a.charAt(i-1));
		}
	}
}
