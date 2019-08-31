package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate aDate1 = SimpleDate.of(1995, 8, 8);
		SimpleDate aDate2 = SimpleDate.of(1995, 12, 8);
		
		System.out.println(aDate1.before(aDate2));
		System.out.println(aDate2.before(aDate1));

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		SimpleDate aDate12 = SimpleDate.of(1995, 8, 8);
		SimpleDate aDate22 = SimpleDate.of(1995, 12, 8);
		
		output.println(aDate1.before(aDate22));
		output.println(aDate2.before(aDate12));

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
