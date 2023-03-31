package inheritance.good;

public class Person {

	public String name;
	public int age;

	public Person() {
		this.name = "이름없음";
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String speak() {
		return " 이름 = "+this.name+", 나이 = "+this.age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	//hashcode와 equals가 같이 만들어진 이유 : 둘다 동등비교에 쓰이기 떄문에
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



}