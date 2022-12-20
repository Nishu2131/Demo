import java.util.Properties;

public class p {

	public static void main(String... arrrrrgs) {
		// TODO Auto-generated method stub
Properties p= System.getProperties();
p.setProperty("private","scurvy");
String s= p.getProperty("argprop")+"";
s +=p.getProperty("pirate");
System.out.println(s);
	}

}
