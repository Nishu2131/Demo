import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicat {

	public static void main(String[] args) {
		Integer count;
		// TODO Auto-generated method stub
		Integer arr[]= {2,3,3,4,3,5,6,7,8,9,101,101};
		Map <Integer,Integer> hm = new HashMap<>();
		for(int i:arr) {
			count=hm.get(i);
			if(count==null) {
				hm.put(i, 1);
			}
			else {
				count=count+1;
				hm.put(i,count);
			}
			
		}
		Set<Map.Entry<Integer,Integer>> e = hm.entrySet();
		for(Map.Entry<Integer,Integer> m:e){
		if(m.getValue()>1) {
			System.out.println("Duplicate values are "+m.getKey()+"count is "+m.getValue());
		}
		}
		

	}

}
