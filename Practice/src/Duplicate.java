import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,6,7,4,3,2,4,5,3,3,3,3,3,3};
		Map<Integer,Integer> hm = new HashMap<>();
		for(int i:a){
			Integer count=hm.get(i);
			if(count==null) {
				hm.put(i,1);
			}
			else {
				count=count+1;
				hm.put(i, count);
			}
		}
  Set<Map.Entry<Integer,Integer>> es= hm.entrySet();
  for(Map.Entry<Integer,Integer> me:es) {
	  if(me.getValue()>1) {
		  System.out.println("Duplicate value is"+me.getKey()+" and count is "+me.getValue());
	  }
  }
  
	}

}
