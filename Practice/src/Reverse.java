
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="123456789";
		String Reverse="";
		for(int i =rev.length()-1;i>=0;i--) {
			Reverse= Reverse+rev.charAt(i);
		}
		System.out.println(Reverse);

	}

}
