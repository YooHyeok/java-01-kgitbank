package operator.two;

public class BitLogic_Example {

	public static void main(String[] args) {
		// &, |, ^ = and , or , xor(둘이 다른 경우 true, 같으면 false / and의 반대.)
		byte a = 1; //0000_0001;
		byte b = 10; //0000_1010;
		System.out.println(a&b);//0000_0000;
		System.out.println(a|b);//0000_1011;
		System.out.println(a^b);//0000_1011;
		
		byte c = 1; //0000_0001;
		byte d = -1;//1111_1111;
	}

}
