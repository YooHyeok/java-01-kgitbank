
import java.io.*;
import java.util.ArrayList;

public class CustomerRead_Example {

	public static void main(String[] args) {
		FileInputStream fis = null; //노드스트림
		ObjectInputStream ois = null; //필터스트림
		try {
			fis = new FileInputStream("customer.data");
			ois = new ObjectInputStream(fis);
			ArrayList<Customer> cusList = (ArrayList<Customer>)ois.readObject();
			System.out.println(cusList);
		}
		catch(IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(ois!=null) {try {ois.close();}catch(IOException e) {} }
		}
	}

}
