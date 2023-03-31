package scan;

import java.util.Scanner;

public class Palindrome_Example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		System.out.println(palindrome(data));
		scan.close();
	}
	public static boolean palindrome(String data) {
		//가나다나가
		//가나다다나가
		//가나다가가
		for(int i=0; i<data.length()/2; i++) { //앞과 뒤가 같으니 2로 나눈 범위를 가져간다.
			if(data.charAt(i)!=data.charAt(data.length()-1-i)) {
				//첫글자와 맨끝글자 두번째글자와 마지막에서 두번째 글자를 서로 비교했을때 다른가를 판별하는 조건식
				//i는 길이를 절반으로 나눈 범위 내의인덱스번호. 
				//data.length()-1-i: 인덱스를 거꾸로 하기 위해 인덱스에서 절반으로 나눈 범위내의 인덱스번호 만큼 빼준것
				return false;// if문을 충족시켰을때 무조건 false값을 return
			}
		}
		return true; //(함수 자체는 무조건 return값이 있어야함. for문 바깥에 작성하면 무조건 리턴함)
	}
}
