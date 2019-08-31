package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth birthInfo1	= new DateAndPlaceOfBirth(1958, 02, 23, "Binghamton", "NY", "USA");
		DateAndPlaceOfBirth birthInfo2	= new DateAndPlaceOfBirth(1958, 02, 23, "Syracuse", "NY", "USA");
		DateAndPlaceOfBirth birthInfo3	= new DateAndPlaceOfBirth(1992, 03, 12, "Scranton", "PA", "USA");
		DateAndPlaceOfBirth birthInfo4	= new DateAndPlaceOfBirth(1949, 03, 12, "Paris", "France");
		DateAndPlaceOfBirth birthInfo5	= new DateAndPlaceOfBirth(1989, 01, 8, "Tokyo", "Japan");
		
		System.out.println(birthInfo1);
		System.out.println(birthInfo2);
		System.out.println(birthInfo3);
		System.out.println(birthInfo4);
		System.out.println(birthInfo5);
	
		//Older than
		System.out.println(birthInfo1.olderThan(birthInfo2));
		System.out.println(birthInfo1.olderThan(birthInfo3));
		System.out.println(birthInfo1.olderThan(birthInfo4));
		System.out.println(birthInfo1.olderThan(birthInfo5));
		
		System.out.println(birthInfo2.olderThan(birthInfo1));
		System.out.println(birthInfo2.olderThan(birthInfo3));
		System.out.println(birthInfo2.olderThan(birthInfo4));
		System.out.println(birthInfo2.olderThan(birthInfo5));

		System.out.println(birthInfo3.olderThan(birthInfo1));
		System.out.println(birthInfo3.olderThan(birthInfo2));
		System.out.println(birthInfo3.olderThan(birthInfo4));
		System.out.println(birthInfo3.olderThan(birthInfo5));

		System.out.println(birthInfo4.olderThan(birthInfo1));
		System.out.println(birthInfo4.olderThan(birthInfo2));
		System.out.println(birthInfo4.olderThan(birthInfo3));
		System.out.println(birthInfo4.olderThan(birthInfo5));

		System.out.println(birthInfo5.olderThan(birthInfo1));
		System.out.println(birthInfo5.olderThan(birthInfo2));
		System.out.println(birthInfo5.olderThan(birthInfo3));
		System.out.println(birthInfo5.olderThan(birthInfo4));

		//Younger than
		System.out.println(birthInfo1.youngerThan(birthInfo2));
		System.out.println(birthInfo1.youngerThan(birthInfo3));
		System.out.println(birthInfo1.youngerThan(birthInfo4));
		System.out.println(birthInfo1.youngerThan(birthInfo5));
		
		System.out.println(birthInfo2.youngerThan(birthInfo1));
		System.out.println(birthInfo2.youngerThan(birthInfo3));
		System.out.println(birthInfo2.youngerThan(birthInfo4));
		System.out.println(birthInfo2.youngerThan(birthInfo5));

		System.out.println(birthInfo3.youngerThan(birthInfo1));
		System.out.println(birthInfo3.youngerThan(birthInfo2));
		System.out.println(birthInfo3.youngerThan(birthInfo4));
		System.out.println(birthInfo3.youngerThan(birthInfo5));

		System.out.println(birthInfo4.youngerThan(birthInfo1));
		System.out.println(birthInfo4.youngerThan(birthInfo2));
		System.out.println(birthInfo4.youngerThan(birthInfo3));
		System.out.println(birthInfo4.youngerThan(birthInfo5));

		System.out.println(birthInfo5.youngerThan(birthInfo1));
		System.out.println(birthInfo5.youngerThan(birthInfo2));
		System.out.println(birthInfo5.youngerThan(birthInfo3));
		System.out.println(birthInfo5.youngerThan(birthInfo4));

		//hasSameBirthDateAs
		System.out.println(birthInfo1.hasSameBirthDateAs(birthInfo2));
		System.out.println(birthInfo1.hasSameBirthDateAs(birthInfo3));
		System.out.println(birthInfo1.hasSameBirthDateAs(birthInfo4));
		System.out.println(birthInfo1.hasSameBirthDateAs(birthInfo5));
		
		System.out.println(birthInfo2.hasSameBirthDateAs(birthInfo1));
		System.out.println(birthInfo2.hasSameBirthDateAs(birthInfo3));
		System.out.println(birthInfo2.hasSameBirthDateAs(birthInfo4));
		System.out.println(birthInfo2.hasSameBirthDateAs(birthInfo5));

		System.out.println(birthInfo3.hasSameBirthDateAs(birthInfo1));
		System.out.println(birthInfo3.hasSameBirthDateAs(birthInfo2));
		System.out.println(birthInfo3.hasSameBirthDateAs(birthInfo4));
		System.out.println(birthInfo3.hasSameBirthDateAs(birthInfo5));

		System.out.println(birthInfo4.hasSameBirthDateAs(birthInfo1));
		System.out.println(birthInfo4.hasSameBirthDateAs(birthInfo2));
		System.out.println(birthInfo4.hasSameBirthDateAs(birthInfo3));
		System.out.println(birthInfo4.hasSameBirthDateAs(birthInfo5));

		System.out.println(birthInfo5.hasSameBirthDateAs(birthInfo1));
		System.out.println(birthInfo5.hasSameBirthDateAs(birthInfo2));
		System.out.println(birthInfo5.hasSameBirthDateAs(birthInfo3));
		System.out.println(birthInfo5.hasSameBirthDateAs(birthInfo4));

		//hasSameBirthDayAs
		System.out.println(birthInfo1.hasSameBirthDayAs(birthInfo2));
		System.out.println(birthInfo1.hasSameBirthDayAs(birthInfo3));
		System.out.println(birthInfo1.hasSameBirthDayAs(birthInfo4));
		System.out.println(birthInfo1.hasSameBirthDayAs(birthInfo5));
		
		System.out.println(birthInfo2.hasSameBirthDayAs(birthInfo1));
		System.out.println(birthInfo2.hasSameBirthDayAs(birthInfo3));
		System.out.println(birthInfo2.hasSameBirthDayAs(birthInfo4));
		System.out.println(birthInfo2.hasSameBirthDayAs(birthInfo5));

		System.out.println(birthInfo3.hasSameBirthDayAs(birthInfo1));
		System.out.println(birthInfo3.hasSameBirthDayAs(birthInfo2));
		System.out.println(birthInfo3.hasSameBirthDayAs(birthInfo4));
		System.out.println(birthInfo3.hasSameBirthDayAs(birthInfo5));

		System.out.println(birthInfo4.hasSameBirthDayAs(birthInfo1));
		System.out.println(birthInfo4.hasSameBirthDayAs(birthInfo2));
		System.out.println(birthInfo4.hasSameBirthDayAs(birthInfo3));
		System.out.println(birthInfo4.hasSameBirthDayAs(birthInfo5));

		System.out.println(birthInfo5.hasSameBirthDayAs(birthInfo1));
		System.out.println(birthInfo5.hasSameBirthDayAs(birthInfo2));
		System.out.println(birthInfo5.hasSameBirthDayAs(birthInfo3));
		System.out.println(birthInfo5.hasSameBirthDayAs(birthInfo4));

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		DateAndPlaceOfBirth birthInfo12 = new DateAndPlaceOfBirth(1958, 02, 23, "Binghamton", "NY", "USA");
		DateAndPlaceOfBirth birthInfo22 = new DateAndPlaceOfBirth(1958, 02, 23, "Syracuse", "NY", "USA");
		DateAndPlaceOfBirth birthInfo32 = new DateAndPlaceOfBirth(1992, 03, 12, "Scranton", "PA", "USA");
		DateAndPlaceOfBirth birthInfo42 = new DateAndPlaceOfBirth(1949, 03, 12, "Paris", "France");
		DateAndPlaceOfBirth birthInfo52 = new DateAndPlaceOfBirth(1989, 01, 8, "Tokyo", "Japan");

		output.println(birthInfo12);
		output.println(birthInfo22);
		output.println(birthInfo32);
		output.println(birthInfo42);
		output.println(birthInfo52);
		//Older than
		output.println(birthInfo12.olderThan(birthInfo22));
		output.println(birthInfo12.olderThan(birthInfo32));
		output.println(birthInfo12.olderThan(birthInfo42));
		output.println(birthInfo12.olderThan(birthInfo52));
		
		output.println(birthInfo22.olderThan(birthInfo12));
		output.println(birthInfo22.olderThan(birthInfo32));
		output.println(birthInfo22.olderThan(birthInfo42));
		output.println(birthInfo22.olderThan(birthInfo52));
		
		output.println(birthInfo32.olderThan(birthInfo12));
		output.println(birthInfo32.olderThan(birthInfo22));
		output.println(birthInfo32.olderThan(birthInfo42));
		output.println(birthInfo32.olderThan(birthInfo52));
		
		output.println(birthInfo42.olderThan(birthInfo12));
		output.println(birthInfo42.olderThan(birthInfo22));
		output.println(birthInfo42.olderThan(birthInfo32));
		output.println(birthInfo42.olderThan(birthInfo52));
		
		output.println(birthInfo52.olderThan(birthInfo12));
		output.println(birthInfo52.olderThan(birthInfo22));
		output.println(birthInfo52.olderThan(birthInfo32));
		output.println(birthInfo52.olderThan(birthInfo42));
		
		//Younger than
		output.println(birthInfo12.youngerThan(birthInfo22));
		output.println(birthInfo12.youngerThan(birthInfo32));
		output.println(birthInfo12.youngerThan(birthInfo42));
		output.println(birthInfo12.youngerThan(birthInfo52));
		
		output.println(birthInfo22.youngerThan(birthInfo12));
		output.println(birthInfo22.youngerThan(birthInfo32));
		output.println(birthInfo22.youngerThan(birthInfo42));
		output.println(birthInfo22.youngerThan(birthInfo52));
		
		output.println(birthInfo32.youngerThan(birthInfo12));
		output.println(birthInfo32.youngerThan(birthInfo22));
		output.println(birthInfo32.youngerThan(birthInfo42));
		output.println(birthInfo32.youngerThan(birthInfo52));
		
		output.println(birthInfo42.youngerThan(birthInfo12));
		output.println(birthInfo42.youngerThan(birthInfo22));
		output.println(birthInfo42.youngerThan(birthInfo32));
		output.println(birthInfo42.youngerThan(birthInfo52));
		
		output.println(birthInfo52.youngerThan(birthInfo12));
		output.println(birthInfo52.youngerThan(birthInfo22));
		output.println(birthInfo52.youngerThan(birthInfo32));
		output.println(birthInfo52.youngerThan(birthInfo42));
		
		//hasSameBirthDateAs
		output.println(birthInfo12.hasSameBirthDateAs(birthInfo22));
		output.println(birthInfo12.hasSameBirthDateAs(birthInfo32));
		output.println(birthInfo12.hasSameBirthDateAs(birthInfo42));
		output.println(birthInfo12.hasSameBirthDateAs(birthInfo52));
		
		output.println(birthInfo22.hasSameBirthDateAs(birthInfo12));
		output.println(birthInfo22.hasSameBirthDateAs(birthInfo32));
		output.println(birthInfo22.hasSameBirthDateAs(birthInfo42));
		output.println(birthInfo22.hasSameBirthDateAs(birthInfo52));
		
		output.println(birthInfo32.hasSameBirthDateAs(birthInfo12));
		output.println(birthInfo32.hasSameBirthDateAs(birthInfo22));
		output.println(birthInfo32.hasSameBirthDateAs(birthInfo42));
		output.println(birthInfo32.hasSameBirthDateAs(birthInfo52));
		
		output.println(birthInfo42.hasSameBirthDateAs(birthInfo12));
		output.println(birthInfo42.hasSameBirthDateAs(birthInfo22));
		output.println(birthInfo42.hasSameBirthDateAs(birthInfo32));
		output.println(birthInfo42.hasSameBirthDateAs(birthInfo52));
		
		output.println(birthInfo52.hasSameBirthDateAs(birthInfo12));
		output.println(birthInfo52.hasSameBirthDateAs(birthInfo22));
		output.println(birthInfo52.hasSameBirthDateAs(birthInfo32));
		output.println(birthInfo52.hasSameBirthDateAs(birthInfo42));
		
		//hasSameBirthDayAs
		output.println(birthInfo12.hasSameBirthDayAs(birthInfo22));
		output.println(birthInfo12.hasSameBirthDayAs(birthInfo32));
		output.println(birthInfo12.hasSameBirthDayAs(birthInfo42));
		output.println(birthInfo12.hasSameBirthDayAs(birthInfo52));
		
		output.println(birthInfo22.hasSameBirthDayAs(birthInfo12));
		output.println(birthInfo22.hasSameBirthDayAs(birthInfo32));
		output.println(birthInfo22.hasSameBirthDayAs(birthInfo42));
		output.println(birthInfo22.hasSameBirthDayAs(birthInfo52));
		
		output.println(birthInfo32.hasSameBirthDayAs(birthInfo12));
		output.println(birthInfo32.hasSameBirthDayAs(birthInfo22));
		output.println(birthInfo32.hasSameBirthDayAs(birthInfo42));
		output.println(birthInfo32.hasSameBirthDayAs(birthInfo52));
		
		output.println(birthInfo42.hasSameBirthDayAs(birthInfo12));
		output.println(birthInfo42.hasSameBirthDayAs(birthInfo22));
		output.println(birthInfo42.hasSameBirthDayAs(birthInfo32));
		output.println(birthInfo42.hasSameBirthDayAs(birthInfo52));
		
		output.println(birthInfo52.hasSameBirthDayAs(birthInfo12));
		output.println(birthInfo52.hasSameBirthDayAs(birthInfo22));
		output.println(birthInfo52.hasSameBirthDayAs(birthInfo32));
		output.println(birthInfo52.hasSameBirthDayAs(birthInfo42));
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
