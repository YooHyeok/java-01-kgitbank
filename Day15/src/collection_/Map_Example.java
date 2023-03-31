package collection_;

import java.util.*;

public class Map_Example {

	public static void main(String[] args) {
//		HashMap<HashMap, HashMap> //맵 안의 키와 벨류 둘다 맵으로 가능
		HashMap<String, Integer> hmap = new HashMap<>();
		TreeMap<String, Integer> tmap = new TreeMap<>();
		
		String[] keyarr = {"첫번째","두번째","세번째","네번째","다섯번째"};
		
		for(int i = 0; i < keyarr.length; i++) {
			hmap.put(keyarr[i], i+1);
			tmap.put(keyarr[i], i+1);
		}
		System.out.println(hmap);
		System.out.println(tmap);
		
		System.out.println(hmap.get("두번째"));
		System.out.println(tmap.put("두번째", 6)); //해당번째에 값을 집어넣으면 해당값에 씌워짐.
		System.out.println(tmap);
		
		Set<Map.Entry<String, Integer>> mset = hmap.entrySet();
		for(Map.Entry<String, Integer> data :mset) {
			if(data.getValue()%2==1) {
				System.out.println(data.getValue());
			}
		}
		
		Set<String> keySet = tmap.keySet();
		for(String key : keySet) {
			System.out.println(tmap.get(key));
		}
	}

}
