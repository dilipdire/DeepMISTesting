package mis;

import java.util.HashMap;

public class PrintDuplicate {

	public static void main(String[] args) {
		String str = "dilipii";
		int count = 0;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), count);

			} else {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			}
		}
		System.out.print(hm);
		System.out.println("---Done--------");

	}
	
	
}
