package lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class main {

public static void main(String[] args) throws IOException {
		FileWriter myfile = new FileWriter("Test.txt");
		PrintWriter f = new PrintWriter(myfile);

		Scanner console = new Scanner(System.in);
		System.out.println("Cititi din consola");
		String choice = console.next();
		f.println("Am citit : ");
		while (!"end".equalsIgnoreCase(choice)) {// System.out.println(choice);
			f.println(choice);
			choice = console.next();

		}
		System.out.println("\nNu mai puteti citi din consola");
		f.close();
	}
}
