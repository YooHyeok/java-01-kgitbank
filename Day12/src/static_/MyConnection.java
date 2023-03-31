package static_;

public class MyConnection {
	
	//갯수를 제한하기 위해서 항상 똑같은 객체를 리턴해야 하기 때문에
	//객체를 static으로 생성. private 선언을 해야 밖에서 참조 불가능
	//이 객체를 메서드를 통해 리턴하면 이 클래스의 객체를 얻을 수 있는 방법은
	//메서드 실행 뿐, 메서드에서 리턴하는 객체는 항상 똑같은 객체 - 갯수 제한
	private static MyConnection con = new MyConnection();
	
	//생성자에 private를 붙인 이유 - 밖에서 객체 생성 금지
	private MyConnection() {//밖에서 생성 안됨 - private 생성자.
	
	}
	//메서드에 static을 붙인 이유 - static을 안 붙이면 객체 생성 없이 참조 불가
	//밖에서 객체를 생성하지 못하게 했기 때문에 객체를 얻을 수 있는 메서드는
	//static이 붙어 있어야 객체 생성을 하지 않고 참조 할 수 있게 됨
	//public을 통해 어디서든지 호출 가능
	public static MyConnection getMyConnection() {
		//return new MyConnection 이 안되는 이유는
		//항상 새로운 객체를 만들어서 리턴하고 있는 코드 - 객체 갯수 제한 불가
		return con;

	}
}


