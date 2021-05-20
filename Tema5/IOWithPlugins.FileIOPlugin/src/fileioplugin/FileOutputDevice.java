package fileioplugin;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import iowithplugins.abstractions.IOutputDevice;

public class FileOutputDevice implements IOutputDevice{

	@Override
	public void WriteString(String s) {
		// TODO Auto-generated method stub
		 try {
	            File file = new File("output");
	            FileWriter fw = new FileWriter(file);
	            PrintWriter pw=new PrintWriter(fw);
	                pw.println(s);
	            pw.close();
	        }
	        catch (Exception e){
	            System.out.println("eroare ");
	        }
	}

}