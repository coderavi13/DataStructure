import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Driver {

	public static void main(String[] args) {

		String str = "a green apple";
		
		Map<Character, Integer> map =new HashMap<>();
		
		
		for (char ch : str.toCharArray()) {
			
			int count =map.containsKey(ch) ? map.get(ch): 0;
		    map.put(ch, count+1);	
		}
		
		System.out.println(map);
		
		for (char ch : str.toCharArray()) {
		{
			if(map.get(ch)==1) {
				System.out.println(ch);
				break;
			}
		}

	}
	}
}


