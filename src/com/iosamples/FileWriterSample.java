package com.iosamples;

import java.io.FileWriter;

public class FileWriterSample {
	public static void main(String[] args) {
		String data="Write Double value in the output";
		try {
			//create a FileWriter
			FileWriter output=new FileWriter("output.txt",true);
			//Writes a string to the file
			output.write(data);
			output.flush();
			//closes the writer
			output.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}

}

