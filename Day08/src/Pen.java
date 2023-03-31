// 클래스 - 설계도, 틀
// 클래스를 본따서 인스턴스(객체) 생성
public class Pen {
	
	// 클래스의 3요소 - 속성(변수), 기능(메서드), 생성자
	// 속성 - 주로 변수들로 선언. 
	// 해당 타입 데이터들을 해당 클래스가 보유 가능
	// ex - pen.color = "검정", pen.price = 1000;
	// 변수 뿐만아니라 클래스도 들어갈수있음 (String)
	//멤버 변수 또는 인스턴스 변수
	
	public String color; //멤버면수(instance)를 기본값으로
	public int width; //= " ";로 지정하면 모든 속성이 " " 으로 가져가게됨.
	public int price;

	//메서드 - 인스턴스 별로 실행됨(pen1, pen2)
	//매개변수
	public void write(String data)	{ //지역변수.
		System.out.println(data);
	}
	//생성자 - 인스턴스를 생성하는 용도 , 인스턴스를 초기화하는 용도
	//생성자 이름 규칙 - 클래스와 동일, 리턴타입이 없음.
	//생성자는 무조건 한 개 이상 있어야함 - 명시적으로 구현하지 않으면
	//컴파일러가 자동으로 한 개(기본생성자) 생성
	//한 개라도 명시적으로 만들면 만들어 주지 않음.
	//멤버변수, 인스턴스 변수의 초기화 실행 - 기본값 할당
	public Pen() {

	}

	public Pen(String color, int width, int price) { 
		//this = 나 자신을 의미. 적어놓은 클래스의 인스턴스와 동일
		//this.color = new Pen().color
		this.color = color;//인스턴스를 초기화
		this.width = width;
		this.price = price;
		
		//메서드
		//인스턴스 별로 실행
	}
	public Pen(String color) {
		this.color = color;
		price = (int)(Math.random()*1000)+1; //0~999
	}
	//생성자, 메서드는 기준이 매개변수 - 타입, 개수, 순서가 동일하면 중복
	//셋 중에 하나만 달라도 중복 안됨 - 여러 이름이 같은 메서드 생성 가능
	//public Pen(String color, int price, int width) {}
	//위의 color, width, price 생성자와 중복
	//System.out.println(Arrays.to); //Arrays .to [String] - 이름 매개변수 리턴타입

	//클래스의 정보를 문자열로 변경 - 주로 출력에사용
	//마우스오른쪽 - source - generate tostring() 클릭
	//기본으로 변수값들을 가 선택하기 때문에 그냥 만들면 됨
	@Override
	public String toString() {
		return "Pen [color=" + color + ", width=" + width + ", price=" + price + "]";
	}


}


