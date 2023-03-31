import java.io.*;

public class CSVWriter_Example {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("customer.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("C:\\Users\\user\\Desktop\\customer.csv");
			bw = new BufferedWriter(fw);
			String data = null;
			int i = 0;
			while((data = br.readLine())!=null) {
				System.out.println(++i+"踰덉㎏ 以� �씫�쓬.");
				String[] dummy = data.split(",");
				for(String field : dummy) {
					bw.write(field); bw.write(",");
					//踰꾪띁 �븞�쓽 �뜲�씠�꽣 媛뺤젣 異쒕젰
					bw.flush();
				}
				bw.newLine();
				bw.flush();
				System.out.println(i+"踰덉㎏ 以� �옉�꽦 �셿猷�.");
				
			}
			System.out.println("�뙆�씪 �옉�꽦 �셿猷�");
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
