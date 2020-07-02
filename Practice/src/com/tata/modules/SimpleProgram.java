package com.tata.modules;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleProgram {

	public static void main(String[] args) throws IOException   {
		 File file = new File("file.txt");
		 file.createNewFile();
		 PrintWriter pw=new PrintWriter(file);
		 pw.println("Hello");
		 pw.close();
		 System.out.println("File is created");

	}

}
