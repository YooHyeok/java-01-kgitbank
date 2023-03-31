package inheritance.good;

public class ToString_Example {

	public static void main(String[] args) {
		Person p = new Person("유재혁",28);
		print(p);
		print(10);
		print("문자열");
	}
	public static void print(Object a) {
		System.out.println(a.toString()); //오브젝트의 투스트링을 출력
	}

}
