
import java.io.*;

public class NodeStream_Example {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\user\\Desktop\\Node.txt");
			char[] buffer = new char[256];
			int readCount = fr.read(buffer);
			while (readCount != -1) {
				String data = new String(buffer, 0 , readCount);
				System.out.println(data);
				readCount = fr.read(buffer);
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(fr != null) {
				try{fr.close();}catch(IOException e){}
			}
		}
	}
}
