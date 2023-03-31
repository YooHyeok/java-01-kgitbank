
public class RegularExpression_Example {
//regex = 정규표현식을 넣어줘라
	public static void main(String[] args) {
		String number = "010-000-0000";
		String number2 = "02-0000-0000";
		if(number.matches("^\\d{2,3}( |-)\\d{3,4}( |-)\\d{4}$")) {
			System.out.println(number);
			
		}
		if(number2.matches("^\\d{2,3}( |-)\\d{3,4}( |-)\\d{4}$")) {
			System.out.println(number2);
		}
		
		String email = "yjou7454@naver.com";
		String email2 = "yjk7454@naver.com";
		if(email.matches("^[a-z]{1}\\w+@[a-z]{1,10}\\.[a-z]+.+$")) { // .+$ ->  
			// \\. -> .으로 출력
			// .+ -> .부터 0번이상 일치. 
			System.out.println(email);

		}
		if(email2.matches("^[a-z]{1}\\w+@[a-z]{1,10}\\.[a-z]+.+$"))	{
			System.out.println(email2);	
		}
		String id = "001231-3080102";
		String id2 = "900731-1082012";
		if(id.matches("^[1-9]{6}-[1-2]{1}[0-9]{6}$|^[0]{1}[0-9]{5}-[3-4]{1}[0-9]{6}$")) {
			System.out.println(id);
		}
		if(id.matches("^[0-9]{6}-[1-2]{1}[0-9]{6}$|^[0]{1}[0-9]{5}-[3-4]{1}[0-9]{6}$")) {
			System.out.println(id2);
		}
		String pid = id.replaceAll("-[1-4]{1}[0-9]{6}", "-*******");
		System.out.println(pid);
	}

}
