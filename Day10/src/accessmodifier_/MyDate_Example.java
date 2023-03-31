package accessmodifier_;

public class MyDate_Example {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		//private선언으로 참조를 막아두었기 때문에 보이지 않음 - 참조불가
//		d1.day = 31;
		d1.setDay(31);
		//메서드에 잘못된 값이 들어오는 걸 막아두었기 때문에 정상 값 부여.
		//변수는 private, 메서드는 public = 은닉패턴
		d1.setDay(100);
	}

}
