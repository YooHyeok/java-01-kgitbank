package collection_quest;

import java.util.*;

public class Marathon_Eaxmple {

	public static void main(String[] args) {
		String[] part = {"mislav","stanko","mislav","ana"}; 
		String[] com = {"mislav","stanko","ana"};
		System.out.println(solution(part,com));
	}
	public static String solution(String[] part, String[] com) {
		HashMap<String, Integer> map = new HashMap<>();
		for(String man : part) {
			map.put(man, map.getOrDefault(man, 0)+1); //가저오거나 혹은 기본값을넣거나
		}
		for(String man : com) {
			map.put(man, map.get(man)-1);
		}
		Set<String> KeySet = map.keySet();
		for(String key : KeySet) {
			if(map.get(key)==1) {
				return key;
			}
		}
		return null;
	}

}
