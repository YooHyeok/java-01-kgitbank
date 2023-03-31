package second;

import java.util.Scanner;

//메인바깥에 기능을 만들어 놓은 메서드를 만들어놓고 메인메서드 안에서 호출하기
//고객 관리 프로그램
public class CustomerManager {
	//멤버변수
	//메인함수 안에서 사용되므로 static을 붙힘.
	
	//범위 값 변수 MAX 선언.
	static final int MAX = 100; //범위100을 변경할수 없는 코드 final
	
	static int count = 0; //입력된 데이터의 갯수
	static int index = -1; //배열에 데이터가 아무값도 없는 값 -1

	static Customer[] cusList = new Customer[MAX];
//	static String[] nameList 		= new String[MAX];
//	static char[]	genderList	 	= new char	[MAX];
//	static String[] emailList	 	= new String[MAX];
//	static int[] 	birthYearList	= new int	[MAX];

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
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
			case'p':
			case'P':
			case'ㅔ':
				if(index<=0) {
					System.out.println("커서를 더 이상 옮길 수 없습니다.");
				}
				else {
					index--;
					System.out.printf("현재 커서 위치: %d",index);
				
				}
				break;
				
		//커서 다음 next 커서입력받은 고객들 커서 이동. (고객선택)
			case'n':
			case'N':
			case'ㅜ':
				if(count-1<=index) {
					System.out.print("데이터가 더 이상 없습니다.");
				}
				else {
					index++;
					System.out.printf("현재 커서 위치: %d",index);
				}
				break;
				
		//
			case'r':
			case'R':
			case'ㄱ':
				if(-1<index && index<count) {
					System.out.println("데이터를 조회합니다.");
					readCustomerData(index);//매개변수가 없어서 빨간줄이뜸. index
				}
				else {
					System.out.println("커서가 정상 범위가 아닙니다.");
				}
				break;
				
		//
			case'u':
			case'U':
			case'ㅕ':	
				if(-1<index && index<count) {
					System.out.println("데이터를 수정합니다.");
					updateCustomerData(index);//매개변수가 없어서 빨간줄이뜸. index
				}
				else {
					System.out.println("커서가 정상 범위가 아닙니다.");
				}
				break;
				
		//삭제 Delete
			case'd':
			case'D':
			case'ㅇ':
				if(-1<index && index<count) {
					System.out.println("데이터를 삭제합니다.");
					deleteCustomerData(index);//매개변수가 없어서 빨간줄이뜸. index
				}
				else {
					System.out.println("커서가 정상 범위가 아닙니다.");
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
		Customer c1 = new Customer(name, gender, email, birthYear);
		cusList[count++] = c1;
//		nameList[count] = name;
//		genderList[count] = gender;
//		emailList[count] = email;
//		birthYearList[count] = birthYear;
//		count++; //원래는 0인데 count로 지정해주면 1명이들어왔을때 0 2명이들어왔을때 1 3명이들어왔을때 2 
	}
	public static void readCustomerData(int index) {//고객 정보를 조회하는 함수 //몇번째를 조회하는지 알아야 하므로 index
		System.out.printf("%d번째 데이터\n", index);
		
		
//		System.out.println("---------------Customer Info----------------");
//		System.out.printf("이름: %s\n",nameList[index]);
//		System.out.printf("성별: %c\n",genderList[index]);
//		System.out.printf("이메일: %s\n",emailList[index]);
//		System.out.printf("출생년도: %d",birthYearList[index]);
//		System.out.println("--------------------------------------------");

	}
	public static void updateCustomerData(int index) {//몇번째를 수정 하는지 알아야 하므로 index
		System.out.printf("이름(%s) : ",cusList[index].getName());
		cusList[index].setName(scan.nextLine());
		//nameList[index] = scan.nextLine(); //입력받은걸 집어넣겟다
		System.out.printf("성별(%c) : ",cusList[index].getGender());
		cusList[index].setGender(scan.nextLine().charAt(0));
		System.out.printf("이메일(%s) : ",cusList[index].getEmail());
		cusList[index].setEmail(scan.nextLine());
		System.out.printf("출생년도(%d) : ",cusList[index].getBirthYear());
		cusList[index].setBirthYear(scan.nextInt()); 
		scan.nextLine();
	}
	public static void deleteCustomerData(int index) {//몇번째를 삭제 하는지 알아야 하므로 index
		if(index==count-1) {

		}
		else {
			//뒤에껄하나씩줄인다.
			for(int i = index; i < count-1; i++) {
				cusList[i] = cusList[i+1];
//				nameList[i] = nameList[i+1];
//				genderList[i]= genderList[i+1];
//				emailList[i] = emailList[i+1]; 
//				birthYearList[i] = birthYearList[i+1]; 
			}
			
		}
		count--; //맨뒤의 배열을 보이지않기때문에.
	}

}
