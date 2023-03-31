package second;

import java.util.Scanner;

public class CustomerManager {

	static final int MAX = 100;

	static int count = 0;
	static int index = -1;

	static Customer[] cusList = new Customer[MAX];

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			System.out.printf("\n[INFO] 고객 수 : %d, 커서 위치 : %d\n",count,index);
			System.out.println("메뉴 선택 : (I)nsert, (P)revious, (N)ext, (R)ead, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.nextLine();
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
			case 'p' :
			case 'P' :
			case 'ㅔ' :
				if(index<=0) {
					System.out.println("커서를 더 이상 옮길 수 없습니다.");
				}else {
					index--;
					System.out.printf("현재 커서 위치 : %d",index);
				}
				break;
			case 'n' :
			case 'N' :
			case 'ㅜ' :
				if(count-1<=index) {
					System.out.println("데이터가 더 이상 없습니다.");
				}else {
					index++;
					System.out.printf("현재 커서 위치 : %d",index);
				}
				break;
			case 'r' :
			case 'R' :
			case 'ㄱ' :
				if(-1<index && index<count) {
					System.out.println("데이터를 조회합니다.");
					readCustomerData(index);
				}else {
					System.out.println("커서가 정상범위가 아닙니다.");
				}
				break;
			case 'u' :
			case 'U' :
			case 'ㅕ' :
				if(-1<index && index<count) {
					System.out.println("데이터를 수정합니다.");
					updateCustomerData(index);
				}else {
					System.out.println("커서가 정상범위가 아닙니다.");
				}
				break;
			case 'd' :
			case 'D' :
			case 'ㅇ' :
				if(-1<index && index<count) {
					System.out.println("데이터를 삭제합니다.");
					deleteCustomerData(index);
				}else {
					System.out.println("커서가 정상범위가 아닙니다.");
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

	public static void insertCustomerData() {
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("성별 : ");
		char gender = scan.nextLine().charAt(0);
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		System.out.print("출생년도(ex:1900) : ");
		int birthYear = scan.nextInt();
		scan.nextLine();
		Customer c1 = new Customer(name, gender, email, birthYear);
		cusList[count++] = c1;
	}

	public static void readCustomerData(int index) {
		System.out.printf("%d번째 데이터\n",index+1);
		System.out.println(cusList[index]);
	}

	public static void updateCustomerData(int index) {
		System.out.printf("이름(%s) : ",cusList[index].getName());
		cusList[index].setName(scan.nextLine());
		System.out.printf("성별(%c) : ",cusList[index].getGender());
		cusList[index].setGender(scan.nextLine().charAt(0));;
		System.out.printf("이메일(%s) : ",cusList[index].getEmail());
		cusList[index].setEmail(scan.nextLine());
		System.out.printf("출생년도(%d) : ",cusList[index].getBirthYear());
		cusList[index].setBirthYear(scan.nextInt());
		scan.nextLine();
	}

	public static void deleteCustomerData(int index) {
		if(index==count-1) {

		}else {
			for(int i=index; i<count-1; i++) {
				cusList[i] = cusList[i+1];
			}
		}
		count--;
	}
}