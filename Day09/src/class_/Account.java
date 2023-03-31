package class_;

public class Account {
	
	public int accountNumber;
	public String password;
	public String name;
	public String bankName;
	public long balance; //int는 21억까지표현 long은 경 까지 표현
	//기능
	public void deposit(long money) {//매개변수로 입금액
		this.balance += money; // 잔액에 입금액을 더해서 저장~
		System.out.printf("%s님의 계좌에 입금합니다.\n",this.name);
		System.out.printf("입금액: %d, 잔액 : %d\n", money, this.balance);
	}
	public void withdraw(String password, long money) {
		if (checkPassword(password)) {
			if(money > this.balance) {
				System.out.printf("잔액이 부족합니다. 잔액:%d\n",this.balance);
				return; //메서드를 끝내는 명령어. (void일때~)
			}
			this.balance -= money; // 잔액에 입금액을 더해서 저장~
			System.out.printf("%s님의 계좌에서 출금합니다.\n",this.name);
			System.out.printf("출금액: %d, 잔액 : %d\n", money, this.balance);
		}
		else {
			System.out.println("비밀번호가 다릅니다.");
		}
	}
	
	public boolean checkPassword(String password) {//비밀번호를 받아와야함.
		//같다 비교 : [기본형 : ==] [참조형 : .equals]
		return (password.equals(this.password)); //입력받은 패스워드가 this.pa

	}
		

	public void transfer(String password, long money, Account account) {
		if(checkPassword(password)) {
			if(money > this.balance) {
				System.out.printf("잔액이 부족합니다. 잔액:%d\n",this.balance);
				return;
			}
			this.balance -= money; //먼저 차감
			account.balance += money; //계좌에 송금.
			System.out.printf("%s님의 계좌로 %d 원이 송금되었습니다.\n", account.name, money);
			System.out.printf("현재 잔액 : %d\n", this.balance);
		}
		else {
			System.out.println("비밀번호가 다릅니다.");

		}
		
	}
	public Account(String name, String bankname, String password) {
		this.accountNumber = (int)(Math.random()*100000)+1;
		this.name = name;
		this.bankName = bankname;
		this.password = password;
	}
	public void checkBalance(String password) {

		if(checkPassword(password)) {
			System.out.printf("잔액:%d",this.balance);
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}



	}
}

//잔액조회 , 송금만들어오기. (생각하기.)
