package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two morejava than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		Computer comp1 = new Computer("Dell", "i5", 32, 1250,true,999);
		Computer comp2 = new Computer("Window", "i7", 64, 1500,false,1499);
		Computer comp3 = new Computer("HP", "i7", 32, 800,true,799);
		Computer comp4 = new Computer("Acer", "i5", 16, 400,false,499);

		System.out.println(comp1);
		System.out.println(comp2);
		System.out.println(comp3);
		System.out.println(comp4);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		Computer comp12 = new Computer("Dell", "i5", 32, 1250,true,999);
		Computer comp22 = new Computer("Window", "i7", 64, 1500,false,1499);
		Computer comp32 = new Computer("HP", "i7", 32, 800,true,799);
		Computer comp42 = new Computer("Acer", "i5", 16, 400,false,499);

		output.println(comp12);
		output.println(comp22);
		output.println(comp32);
		output.println(comp42);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
