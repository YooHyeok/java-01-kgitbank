package third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerManager implements ICustomerManager{

	static final int MAX = 100;

	static int count = 0;

	static Customer[] cusList = new Customer[MAX];

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException{
		new CustomerManager().start();
	}
	
	public void start() throws InterruptedException{
		while(true) {
			System.out.printf("\n[INFO] 고객 수 : %d\n",count);
			System.out.println("메뉴 선택 : (I)nsert, (R)ead, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.nextLine();
//			menu = menu.toLowerCase(); //대소문자 (low의 반대)
			switch(menu.charAt(0)) {
			case 'i' :
			case 'I' :
			case 'ㅑ' :
				if(count>=MAX) {
					System.out.println("데이터를 더 이상 입력할 수 없습니다.");
				}else {
					System.out.println("데이터를 입력합니다.");
					insertCustomerData();
				}
				break;
			case 'r' :
			case 'R' :
			case 'ㄱ' :
				if(count>0) {
					readCustomerData(selectCustomerData());
				}else {
					System.out.println("데이터가 없습니다.");
				}
				break;
			case 'u' :
			case 'U' :
			case 'ㅕ' :
				if(count>0) {
					updateCustomerData(selectCustomerData());
				}else {
					System.out.println("데이터가 없습니다.");
				}
				break;
			case 'd' :
			case 'D' :
			case 'ㅇ' :
				if(count>0) {
					deleteCustomerData(selectCustomerData());
				}else {
					System.out.println("데이터가 없습니다.");
				}
				break;
			case 'q' :
			case 'Q' :
			case 'ㅂ' :
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);
			default :
				System.out.println("메뉴를 잘 못 입력하셨습니다.");
			}
		}
	}

	@Override
	public void insertCustomerData() {
		String name = null;
		while(true) {
			System.out.print("이름 : ");
			name = scan.nextLine();
			int i=0;
			for(i=0; i<count; i++) {
				if(cusList[i].getName().equals(name)) {
					break;
				}
			}
			if(i==count) {
				break;
			}
			System.out.println("이름이 중복됩니다. 다시 입력해 주세요.");
		}
		System.out.print("성별 : ");
		char gender = scan.nextLine().charAt(0);
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		System.out.print("출생년도(ex:1900) : ");
		int birthYear = 0;
		try {
		birthYear = scan.nextInt();
		}catch(InputMismatchException e) {
			birthYear = 1;
			System.out.println("숫자만 입력하셔야 됩니다. 기본값인 1900을 집어넣습니다.");
		}
		scan.nextLine();
		Customer c1 = new Customer(name, gender, email, birthYear);
		cusList[count++] = c1;
	}

	@Override
	public Customer selectCustomerData() throws InterruptedException{
		while(true) {
			System.out.print("이름을 입력하세요 :");
			String name = scan.nextLine();
			System.out.print("검색중");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			for(int i=0; i<count; i++) {
				if(cusList[i].getName().equals(name)) {
					return cusList[i];
				}
			}
			System.out.println("이름이 없거나 잘못되었습니다.");
		}
	}

	@Override
	public void readCustomerData(Customer cus) {
		System.out.println(cus);
	}

	@Override
	public void updateCustomerData(Customer cus) {
		System.out.printf("이름(%s) : ",cus.getName());
		cus.setName(scan.nextLine());
		System.out.printf("성별(%c) : ",cus.getGender());
		cus.setGender(scan.nextLine().charAt(0));;
		System.out.printf("이메일(%s) : ",cus.getEmail());
		cus.setEmail(scan.nextLine());
		System.out.printf("출생년도(%d) : ",cus.getBirthYear());
		cus.setBirthYear(scan.nextInt());
		scan.nextLine();
	}

	@Override
	public void deleteCustomerData(Customer cus) {
		for(int i=0; i<count; i++) {
			if(cus.getName().equals(cusList[i].getName())) {
				for(int j=i; j<count-1; j++) {
					cusList[i] = cusList[i+1];
				}
				count--;
				break;
			}
		}
	}
	
	
	
	
	
}