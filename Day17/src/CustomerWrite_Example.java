
import java.io.*;
import java.util.ArrayList;

public class CustomerWrite_Example {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("customer.data");
			oos = new ObjectOutputStream(fos);
			Customer c1 = new Customer("유재혁",'m',"gct",10);
			Customer c2 = new Customer("유재혁2",'m',"gct2",11);
			Customer c3 = new Customer("유재혁3",'m',"gct3",12);
			ArrayList<Customer> cusList = new ArrayList<>();
			cusList.add(c1); cusList.add(c2); cusList.add(c3);
			oos.writeObject(cusList);
			System.out.println("객체 직렬화 완료.");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			if(oos!=null) {try {oos.close();}catch(IOException e) {} }
		}
	}

}
