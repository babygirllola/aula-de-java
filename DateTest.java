import java.util.Date;
public class DateTest {
	
	public static void main(String[] args) {
		Date d;
		d = new Date();
		//System.out.println("hoje e: " +d.getDay());
		//System.out.println("\n mudança d dia ");
	    Date d2 = new Date(1973,11,25);
	    System.out.println("D2 eh:"+d2.toString());
	    d2.setYear(d.getYear());
	    //System.out.println("hoje e: " +d.toString());
		//System.out.println("hoje e: " +d.getYear());
		//System.out.println("hoje e: " +d.getMonth());
		System.out.println("D2 eh:"+d2.toString());
	}

}
