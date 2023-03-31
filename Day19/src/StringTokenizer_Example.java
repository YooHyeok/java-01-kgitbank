//문자를 쪼개 개행하는 정규표현식
import java.util.StringTokenizer;

public class StringTokenizer_Example {

	public static void main(String[] args) {
		String data = "this is a sample";
		StringTokenizer st = new StringTokenizer(data);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			System.out.println(st.countTokens());
		}
		data = "this.is a;sample,test";
		st = new StringTokenizer(data," .,;");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		//쪼개진 데이터 복구.
		data = "유재혁,M,yjk7454@naver.com,28";
		st = new StringTokenizer(data,",",true);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
