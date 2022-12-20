
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j;
		try {
		j=1/i;
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero is not Possible");
			
		}
		catch(Exception e) {
			
		}
		finally{
			System.out.println("finally block will execute every time");
			
		}
	}
}
