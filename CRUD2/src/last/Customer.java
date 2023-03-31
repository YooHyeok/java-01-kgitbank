package last;

import java.io.Serializable;

public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public String name;
	public char gender;
	public String email;
	public int birthYear;
	
	public Customer(String name, char gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return "고객정보 [이름=" + name + ", 성별=" + gender + ", 이메일=" + email + ", 출생년도=" + birthYear + "]";
	}
	//set/get 메서드 - 변수의 직접접근을 방지하기 위해 사용
	//source - getter/setter - 원하는 변수 클릭 후 generate
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
