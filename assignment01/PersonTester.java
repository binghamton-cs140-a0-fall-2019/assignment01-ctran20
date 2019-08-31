package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth birthInfo = new DateAndPlaceOfBirth(1924, 8, 12, "Binghamton", "NY", "USA"); 
		StreetUSAddress address = new StreetUSAddress("128 Java street", "48 Linux street", "Binghamton", "NY", "13905");
		Person person = new Person("David", "Blance", "1234569873", birthInfo, address);
		
		System.out.println(person);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		DateAndPlaceOfBirth birthInfo2 = new DateAndPlaceOfBirth(1924, 8, 12, "Binghamton", "NY", "USA"); 
		StreetUSAddress address2 = new StreetUSAddress("128 Java street", "48 Linux street", "Binghamton", "NY", "13905");
		Person person2 = new Person("David", "Blance", "1234569873", birthInfo2, address2);
		
		output.println(person2);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
