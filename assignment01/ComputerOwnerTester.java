package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args){ 
		DateAndPlaceOfBirth birthInfo = new DateAndPlaceOfBirth(1924, 8, 12, "Binghamton", "NY", "USA"); 
		StreetUSAddress address = new StreetUSAddress("128 Java street", "48 Linux street", "Binghamton", "NY", "13905");
		Person person = new Person("David", "Blance", "1234569873", birthInfo, address);

		ComputerOwner computerOwner = new ComputerOwner(person);

		Computer comp1 = new Computer("Dell", "i5", 32, 1250,true,999);
		Computer comp2 = new Computer("Window", "i7", 64, 1500,false,1499);
		Computer comp3 = new Computer("HP", "i7", 32, 800,true,799);
		Computer comp4 = new Computer("Acer", "i5", 16, 400,false,499);

		computerOwner.addComputer(comp1);
		computerOwner.addComputer(comp2);
		computerOwner.addComputer(comp3);
		computerOwner.addComputer(comp4);

		System.out.println(computerOwner);

		computerOwner.removeComputer(0);
		computerOwner.removeComputer(2);

		System.out.println(computerOwner);
			
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		ComputerOwner computerOwner2 = new ComputerOwner(person);

		Computer comp12 = new Computer("Dell", "i5", 32, 1250,true,999);
		Computer comp22 = new Computer("Window", "i7", 64, 1500,false,1499);
		Computer comp32 = new Computer("HP", "i7", 32, 800,true,799);
		Computer comp42 = new Computer("Acer", "i5", 16, 400,false,499);

		computerOwner2.addComputer(comp12);
		computerOwner2.addComputer(comp22);
		computerOwner2.addComputer(comp32);
		computerOwner2.addComputer(comp42);

		output.println(computerOwner2);

		computerOwner2.removeComputer(0);
		computerOwner2.removeComputer(2);

		output.println(computerOwner2);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
