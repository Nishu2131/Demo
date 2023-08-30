
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String A="Nishant";
        String rev = null;
        for(int i=A.length();i>0;i--) {
        	rev=rev+A.charAt(i);
        	
        }
        System.out.println("Reverse of the String is->"+rev);
	}

}
