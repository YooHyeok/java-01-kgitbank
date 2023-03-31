
import java.util.*;

public class Kakao {

	public static void main(String[] args) {
		String[] data = {"Enter uid1234 Muzi",
				"Enter uid4567 Prodo",
				"Leave uid1234",
				"Enter uid1234 Prodo",
				"Change uid1234 Ryan"};
		System.out.println(Arrays.toString(solution(data)));
	}
	
	public static String[] solution(String[] data) {
		HashMap<String,String> idMap = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		HashMap<String,String> codeMap = new HashMap<>();
		codeMap.put("Enter","님이 들어왔습니다");
		codeMap.put("Leave","님이 나갔습니다");
		for(String s : data) {
			StringTokenizer st = new StringTokenizer(s);
			String command = st.nextToken();
			String id = st.nextToken();
			if(st.countTokens()==1) {
				String name = st.nextToken();
				idMap.put(id, name);		
			}
			if(!command.equals("Change")) {
				list.add(command+" "+id);
			}
		}
		String[] answer = new String[list.size()];
		for(int i=0; i<answer.length; i++) {
			StringTokenizer st = new StringTokenizer(list.get(i));
			String code = codeMap.get(st.nextToken());
			String name = idMap.get(st.nextToken());
			answer[i] = name+code;
		}
		return answer;

	}

}
