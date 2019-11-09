import java.util.HashMap;
import java.util.Map;

public class HashMapVsHashTable {

	public static void main(String[] args) {
		
		Map<Integer,String> hm=new HashMap<Integer,String>(16);
		
		System.out.println(hm.size());
		hm.put(1,"Ravi");
		hm.put(2,"Abc");
		hm.put(3,"xyz");
		
		for(Map.Entry<Integer, String> i: hm.entrySet())
		{
			System.out.println("Key: "+i.getValue() + "  Value: "+i.getKey());
			//System.out.println("Hashcode: "+i.hashCode());
			//System.out.println("Hashcode: "+i.getClass());
				
		}
		
		
Map<Integer,String> hm1=new HashMap<Integer,String>(hm);
		
		
		for(Map.Entry<Integer, String> i: hm1.entrySet())
		{
			System.out.println("Key: "+i.getValue() + "  Value: "+i.getKey());
			//System.out.println("Hashcode: "+i.hashCode());
			//System.out.println("Hashcode: "+i.getClass());
				
		}
		
	}

}
