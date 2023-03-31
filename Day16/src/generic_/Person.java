package generic_;

public class Person<E> {

	public E name;
	public int age;
	
	public Person() {//기본생성자
		
	}
	
	public Person(E name, int age) {
		this.name = name;
		this.age = age;
	}

	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static<T extends Object> T a(T t) {
		return t;
	}
	
	
}


