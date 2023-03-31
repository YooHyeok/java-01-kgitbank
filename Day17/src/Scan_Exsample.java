
import java.io.*;

public class Scan_Exsample {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			System.out.println("내용을 입력해 주세요 : ");
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String data = null;
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally {
			if(br!=null) {try {br.close();}catch(IOException e) {}}
		}
	}
}


