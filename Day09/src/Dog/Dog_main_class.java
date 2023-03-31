//"메인"메서드.
// 짠 코딩들을 불러옴

package Dog;

public class Dog_main_class {
	public static void main(String[] args) {
		Dog dog = new Dog(); //Dog 클래스에서 불러옴.
		Dog dog2 = new Dog("뽀삐", 10, "코커스파니엘", 25.7);
		dog.walk();
		dog2.sit();
		dog2.bark();
		dog.walk();
	

	}
}