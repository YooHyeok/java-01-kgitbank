package collection_;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

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


	@Override
	public int compareTo(Person o) {
		//이름 정순 정렬
		return this.name.compareTo(o.name); //compare to - 비교하는메서드
		//이름 역순 정렬
		//o.name.compareTo(this.name); 반대.
		
		//나이 정순 정렬
//		return this.age - o.age;
	}

	
	
	@Override
	public String toString() { //주소값의 데이터를 출력해줌.
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
