package fileioplugin;

import java.io.File;
import java.util.Scanner;

import iowithplugins.abstractions.IInputDevice;

public class FileInputDevice implements IInputDevice{

	public String ReadString()
	{
		try {
            File file = new File("input");
            Scanner scanner = new Scanner(file);
            String sir=" ";
            while (scanner.hasNextLine()) {
                sir+=scanner.next();
                sir+="\n";
            }
            return sir;
        }
        catch(Exception e){
            System.out.println("eroare ");
            return null;
        }

}
	}