package scan;

import java.util.Scanner;

public class Scanner_Example {

	public static void main(String[] args) {
		//값을 입력받기 위해서 Scanner 객체 생성
		//System.out - 콘솔에 출력/ System.in - 콘솔에입력
		Scanner scan = new Scanner(System.in); //() = 생성자
		System.out.print("아무거나 입력해 주세요:");
		//Scanner 객체 안의 scan.nextLine() - 입력하는 값을
		//String 값으로 돌려줌. 기준 문자는 개행문자.
		String data = scan.next();
		System.out.println(data);
		System.out.println("아무거나 입력해 주세요:");
		//scan.next() - 기준문자가 공백이기 때문에
		//공백이 들어가면 전체 값이 전송 안 됨
		data = scan.nextLine();
		System.out.println(data);
		System.out.println("숫자만 입력해 주세요:");
		int a = scan.nextInt();
		System.out.println(a);
		//자원을 할당 받았으면 항상 닫아줘야 함
		scan.close();//입력통로 닫음 (자원을 획득했으므로 반납하는 메서드.)
	}
}
