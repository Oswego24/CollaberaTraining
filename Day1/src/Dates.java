import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		Date date = new Date();
		
		//display date in mm/dd/yyyy format 
		//NOTE: lowercase m = minutes. Capital m is month. Lowercase d is day of the week.
		//Capital d is day in the year 
		
		SimpleDateFormat sd = new SimpleDateFormat("E MM-dd-yyyy h:mm:ss");
		System.out.println(sd.format(date));

	}

}
