package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
	StreetUSAddress street1 = new StreetUSAddress("230 Coder street", "128 Java street", "Binghamton","NY","13905");
	StreetUSAddress street2 = new StreetUSAddress("64 Java street","", "Binghamton","NY","13905");

	System.out.println(street1);
	System.out.println(street2);

	try(var output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

	StreetUSAddress street12 = new StreetUSAddress("230 Coder street", "128 Java street", "Binghamton","NY","13905");
	StreetUSAddress street22 = new StreetUSAddress("64 Java street", "",  "Binghamton","NY","13905");

	output.println(street12);
	output.println(street22);


		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
