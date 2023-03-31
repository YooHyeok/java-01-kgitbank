package last;

import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerManager implements ICustomerManager{

	static ArrayList<Customer> cusList = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		new CustomerManager().start();
	}
	
	public void start(){
		loadCustomerData();
		while(true) {
			System.out.printf("\n[INFO] 고객 수 : %d\n",cusList.size());
			System.out.println("메뉴 선택 : (I)nsert, (R)ead, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.nextLine();
			switch(menu.charAt(0)) {
			case 'i' :
			case 'I' :
			case 'ㅑ' :
				System.out.println("데이터를 입력합니다.");
				insertCustomerData();
				writeCustomerData();
				break;
			case 'r' :
			case 'R' :
			case 'ㄱ' :
				if(cusList.size()>0) {
					readCustomerData(selectCustomerData());
					writeCustomerData();

				}else {
					System.out.println("데이터가 없습니다.");
				}
				break;
			case 'u' :
			case 'U' :
			case 'ㅕ' :
				if(cusList.size()>0) {
					updateCustomerData(selectCustomerData());
				}else {
					System.out.println("데이터가 없습니다.");
				}
				break;
			case 'd' :
			case 'D' :
			case 'ㅇ' :
				if(cusList.size()>0) {
					deleteCustomerData(selectCustomerData());
					writeCustomerData();

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
			for(Customer cus : cusList) {
				i++;
				if(cus.getName().equals(name)) {
					break;
				}
			}
			if(i==cusList.size()) {
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
			System.out.println("숫자만 입력하셔야 됩니다. 기본값인 1을 집어넣습니다.");
		}
		scan.nextLine();
		Customer c1 = new Customer(name, gender, email, birthYear);
		cusList.add(c1);
	}

	@Override
	public Customer selectCustomerData(){
		while(true) {
			System.out.println("이름을 입력하세요.");
			System.out.println("메뉴로 돌아가시려면 q를 눌러주세요");
			System.out.println("이름입력: ");
			String name = scan.nextLine();
			if(name.charAt(0)=='q'||name.charAt(0)=='Q'||name.charAt(0)=='ㅂ')
				return null;
			for(Customer cus : cusList) {
				if(cus.getName().equals(name)) {
					return cus;
				}
			}
			System.out.println("이름이 없거나 잘못되었습니다.");
		}
	}

	@Override
	public void readCustomerData(Customer cus) {
		if(cus == null) {
			System.out.println("메뉴로 돌아갑니다.");
		}
		else {
		System.out.println(cus);
		}
	}

	@Override
	public void updateCustomerData(Customer cus) {
		if(cus==null) {
			System.out.println("메뉴로 돌아갑니다");
		}
		else {
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
	}

	@Override
	public void deleteCustomerData(Customer cus) {
		if(cus == null) {
			System.out.println("메뉴로 돌아갑니다.");
		}
		else {
			cusList.remove(cus);
			
		}
	}

	@Override
	public void writeCustomerData() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("data.data");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(cusList);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(oos!=null) {try {oos.close();}
			catch(IOException e) {}}
			}
		}
	
	@Override
	public void loadCustomerData() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("data.data");
			ois = new ObjectInputStream(fis);
			cusList = (ArrayList<Customer>)ois.readObject();
			
		}catch(IOException e) {
			System.out.println("파일이 없습니다.");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(ois!=null) {try {ois.close();}catch(Exception e) {} }
			
		}
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	