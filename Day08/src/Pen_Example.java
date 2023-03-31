
public class Pen_Example {

	public static void main(String[] args) {
		//인스턴스 생성 - 클래스 식별자(이름) = new 생성자;
		Pen pen = new Pen(); //객체를 만드는법. //instance
		//만들어진 인스턴스는 클래스 안의 메서드, 변수 보유 - 참조가능 (참조연산자 = __.__ )
		
		//Pen타입의 pen이라는 이름을 = 새롭게만든다 Pen() 으로 기능을 추가하는. 문법이다!
		pen.color = "검정"; //pen타이핑후 .찍으면 호출.
		pen.width = 1; //인트
		pen.price = 1000; //인트
		System.out.printf("펜의 색깔은 %s 입니다. \n",pen.color);
		//클래스는 설계도 이기 때문에 틀의 역활 - 인스턴스는 무한대로 생성 가능
		Pen redPen = new Pen(); //() = 생성자 : 객체를 만들어주는 역할.
		redPen.color = "뻘건";
		System.out.printf("빨간펜의 색깔은 %s 입니다.\n",redPen.color);
		
	}

}
