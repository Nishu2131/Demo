import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="nishantsharma";
		char[] a=name.toCharArray();
		Map<Character,Integer>hm=new HashMap<Character,Integer>();
		for(Character i:a) {
			Integer count=hm.get(i);
			if(count==null) {
				hm.put(i, 1);
			}
			else {count=count+1;
				hm.put(i, count);
			}
			
		}
		Set<Map.Entry<Character,Integer>>h=hm.entrySet();
		for(Map.Entry<Character,Integer>m:h) {
			if(m.getValue()>1) {
				System.out.println(m.getKey()+"+++++++++++++++"+m.getValue());
			}
		}
		

	}

}
