package class_;

public class Account_Example {

	public static void main(String[] args) {
		Account a1 = new Account("유재혁", "하나", "0000");
		Account a2 = new Account("남궁찬", "신한", "7203");
		Account a3 = new Account("노평례", "국민", "0000");
		a2.deposit(1000000);
		a2.withdraw("1235", 50000);
		a2.withdraw("7203", 110000);
		a2.transfer("7203", 50000, a1);
		a1.checkBalance("0000");
		a2.checkBalance("7203");
	}

}
