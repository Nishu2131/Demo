public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String A="Nishant";
        String rev = "";
        for(int i=A.length()-1;i>=0;i--) {
        	rev=rev+A.charAt(i);
        	
        }
        System.out.println("Reverse of the String is->"+rev);
	}

}
