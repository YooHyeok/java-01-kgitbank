
import java.io.*;
public class Buffered_Example {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("customer.txt");
			br = new BufferedReader(fr);
			String data = null;
			int i = 0;
			while((data = br.readLine())!=null) {
				System.out.println(++i+"번째 줄");
				System.out.println(data);
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(br != null) {
				try {br.close();}catch(IOException e) {}{
				}
			}
		}
	}

}
