//메서드 내용.

package Dog;

public class Dog {
	//변수
	public double weight;
	public String breed;
	public String name;
	public int age;
	public int hungry;
	
	
	//***기능***
	
	//먹다
	public void eat() {
		System.out.printf("%s가 먹이를 먹었습니다.\n",this.name);
		this.hungry += 5;
		if(checkHungry()) { //만약 공복도가 30 이하라면 <= 아래 함수 호출
			bark(); //짖는다 <= 함수호출
		}
	}
	//걷다
	public void walk() {
		System.out.printf("%s가 걸었습니다.\n",this.name);
		this.hungry -= 10;
	}
	public void sit() {
		System.out.printf("%s가 앉았습니다.\n",this.name);
		this.hungry -= 10;

	}
	public void bark() {
		System.out.printf("%s : 왈왈!\n",this.name);
		this.hungry -= 1;
	}
	
	//공복감이 30 이하일때 짖는 기능의 메서드
	public boolean checkHungry() {
		if(this.hungry <= 30) {
			return true;
		}
		return false;
	}
	//빈 이름
	public Dog() { //생성자 이름 조건 : 클래스명과 같아야함.
		this.name = "이름없음";
		this.age = 1;
		this.hungry = 50; 
		this.breed = "견종없음";
		this.weight = 10;
	}
	public Dog(String name, int age, String breed, double weight) {
		this.name = name;
		this.age = age;
		this.hungry = 50; 
		this.breed = breed;
		this.weight = weight;
	}
}
