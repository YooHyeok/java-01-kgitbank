
public class Pen_Example2 {

	public static void main(String[] args) {
		Pen p1 = new Pen("검정",1,1000);
		Pen p2 = new Pen("빨강");
		Pen p3 = new Pen();
		//Pen p4 = null; //참조형이므로 가능.
		Pen[] penArray = new Pen[3];
		//클래스는 곧 하나의 데이터 타입으로 간주 가능 - 데이터 타입이 적히는
		//모든 장소에 클래스 명이 적힐 수 있음
		//Pen - String 하나와 int 두 개를 보유한 데이터 타입
		//배열 또는 매개변수 등의 어떤 장소에서도 활용 가능
		penArray[0] = p1;
		penArray[1] = p2;
		penArray[2] = p3;
		
		
		for(int i = 0; i<penArray.length; i++) {
			System.out.println(penArray[i]);			
		}
		//for each문 (Day06 - loop패키지)
		for(Pen p : penArray) { //p는 출력하기 위한 임의이 이름
			System.out.print(p+"\n");
			System.out.println(p);
		}
	}

}
