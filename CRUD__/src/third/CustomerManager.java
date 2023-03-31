package third;

import java.util.Scanner;

//메인바깥에 기능을 만들어 놓은 메서드를 만들어놓고 메인메서드 안에서 호출하기
//고객 관리 프로그램
public class CustomerManager {
	//멤버변수
	//메인함수 안에서 사용되므로 static을 붙힘.
	
	//범위 값 변수 MAX 선언.
	static final int MAX = 100; //범위100을 변경할수 없는 코드 final
	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		public void start() {
			while(true) {
			System.out.printf("\n[INFO] 고객수 : %d, 커서위치 : %d\n",count,index);
			System.out.println("메뉴선택 : (I)NSERT,(P)reviuous,(N)ext,(R)ead,(U)pdate,(D)elete,(Q)uit");//커서옴기는 키  : P,N
			System.out.print("메뉴입력 : ");

			String menu = scan.nextLine();
			switch(menu.charAt(0)) {//첫글자. 실수로 i-p 로 오타가낫을때 i,p,n,r,u,d첫글자를 확인하면되므로
			//i에 관련된 모든 경우의수. i의 대문자'I', i의 한영반전'ㅑ'
			
		//입력(insert)
			case 'i' : 
			case 'I' :
			case 'ㅑ' :
				if(count >= MAX) {
					System.out.println("데이터를 더 이상 입력할 수 없습니다.");
				}
				else {
					System.out.println("데이터를 입력합니다.");
					insertCustomerData(); //아래 선언된 메서드 호출.
				}
				break;
				
		//커서 이전 previous 커서입력받은 고객들 커서 이동. (고객선택)
			
				
		//
			case'r':
			case'R':
			case'ㄱ':
				if(count > 0) {
					readCustomerData(selectCustomerData());//매개변수가 없어서 빨간줄이뜸. index
				}
				else {
					System.out.println("데이터가 없습니다.");
				}
				break;
				
		//
			case'u':
			case'U':
			case'ㅕ':	
				if(count > 0) {
					updateCustomerData(selectCustomerData());//매개변수가 없어서 빨간줄이뜸. index
				}
				else {
					System.out.println("데이터가 없습니다.");
				}
				break;
				
		//삭제 Delete
			case'd':
			case'D':
			case'ㅇ':
				if(count > 0) {
					deleteCustomerData(selectCustomerData());//매개변수가 없어서 빨간줄이뜸. index
				}
				else {
					System.out.println("데이터가 없습니다.");
				}
				break;
				
		//종료 Quit
			case'q':
			case'Q':
			case'ㅂ':
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);//status = 상태. 종료 = 0
			default :
				System.out.println("메뉴를 잘 못 입력하셨습니다.");
			}
		}
	}
	}
//호출 될 함수들! 
	//메인 안에서 쓸거니까 static은 무조건 붙힌다
	
	public static void insertCustomerData() {//고객 정보를 입력하는 함수 매개변수 아무것도 안받음.
		System.out.print("이름: "); //string.
		String name = scan.nextLine();
		//nextline : 무조건 다 받음
		System.out.print("성별: "); //charactor.
		char gender = scan.nextLine().charAt(0); //scan.nextline은 스트링이고 charAt으로 받아서 gender안에 들어간다. 
		// 
		System.out.print("이메일: ");
		String email = scan.nextLine();
		System.out.print("출생년도(ex:1900): ");
		int birthYear = scan.nextInt();
		scan.nextLine();
		
		
	}
	
	public Customer selectCustomerData() {
		while(true) {
			System.out.println("이름을 입력하세요: ");
			String name = scan.nextLine();
			for(int i = 0; i<count; i++) {
				if(cusList[i].getName().equals(name)) {
					return cusList[i];
				}
			}
		}
	}
	public static void readCustomerData(Customer cus) {//고객 정보를 조회하는 함수 //몇번째를 조회하는지 알아야 하므로 index
		System.out.println("---------------Customer Info----------------");
		System.out.printf("이름: %s\n",nameList[index]);
		System.out.printf("성별: %c\n",genderList[index]);
		System.out.printf("이메일: %s\n",emailList[index]);
		System.out.printf("출생년도: %d",birthYearList[index]);
		System.out.println("--------------------------------------------");

	}
	
	

	public static void updateCustomerData(Customer cus) {//몇번째를 수정 하는지 알아야 하므로 index
		System.out.printf("이름(%s) : ",nameList[index]);
		nameList[index] = scan.nextLine(); //입력받은걸 집어넣겟다
		System.out.printf("성별(%c) : ",genderList[index]);
		genderList[index] = scan.nextLine().charAt(0);
		System.out.printf("이메일(%s) : ",emailList[index]);
		emailList[index] = scan.nextLine();
		System.out.printf("출생년도(%d) : ",birthYearList[index]);
		birthYearList[index] = scan.nextInt();
		scan.nextLine();
	}
	public static void deleteCustomerData(Customer cus) {//몇번째를 삭제 하는지 알아야 하므로 index
		if(index==count-1) {

		}
		else {
			//뒤에껄하나씩줄인다.
			for(int i = index; i < count-1; i++) {
				nameList[i] = nameList[i+1];
				genderList[i]= genderList[i+1];
				emailList[i] = emailList[i+1]; 
				birthYearList[i] = birthYearList[i+1]; 
			}
			
		}
		count--; //맨뒤의 배열을 보이지않기때문에.
	}

}
