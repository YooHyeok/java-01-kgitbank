package accessmodifier_;

public class MyDate {
	private int day;
	private int month;
	private int year;
	//get - 조건을 얻어옴
	//set - 
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day>31 || day <1) {
			System.out.println("올바른 날짜가 아닙니다.");
			this.day = 1;
		}
		else {
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>12 || month <1) {
			System.out.println("잘못된 월 입니다.");
			this.month = 1;
		}
		else {
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
