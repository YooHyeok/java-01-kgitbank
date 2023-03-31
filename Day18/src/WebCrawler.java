
import java.io.*;
import java.net.*;
import java.util.Date;

public class WebCrawler {

	public static void main(String[] args) throws Exception {
		//http 웹 주소에 접속하기 위한 용도
		HttpURLConnection con = null;
		BufferedReader br = null;
		FileWriter fw = null;
		String url = "https://www.naver.com";
		while(true) {
			try {
				con = (HttpURLConnection)(new URL(url)).openConnection();
				con.connect(); //커넥션 생성 후 네이버 페이지에 접속
				br = new BufferedReader(new InputStreamReader
						(con.getInputStream(),"UTF-8")); //
				//소스코드를 인풋 스트림으로 변환 및 인코딩 설정 - 캐릭터 스트림 변환
				//- 최종 버퍼 스트림으로 변환해 소스코드를 한 줄씩 읽어들임.
				Date time = new Date();
				String fileName = (time.getYear()+1900)+"년 "+(time.getMonth()+1)+"월 "+(time.getDate())+"일 "+time.getHours()+"시 "+time.getMinutes()+"분 의 검색어";
				fw = new FileWriter(fileName);
				int rank = 0;
				String data = null;
				while(true) {
					data = br.readLine();
					if(data.contains("<span class=\"ah_k\"")) {
						String word = data.split(">")[1].split("<")[0];
						word = (++rank)+"위: "+word;
						fw.write(word);
						fw.write("\n");
					}
					if(rank==20) {
						break;
					}
				}
				System.out.println("검색어 추출 완료.");
			}
			catch(IOException e) {
				System.out.println("예외발생: "+e.getMessage());
			}finally {
				if(br!=null) {try {br.close();}catch(IOException e) {}}
				if(fw!=null) {try {fw.close();}catch(IOException e) {}}
				if(con!=null) {try {con.disconnect();}catch(Exception e) {}}
			}
			Thread.sleep(60000);
		}
	}

}
