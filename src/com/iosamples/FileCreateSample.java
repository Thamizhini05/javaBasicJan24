package com.iosamples;
import java.io.File;
import java.io.IOException;
public class FileCreateSample {

	public static void main(String[] args) {
		//create a file object for the current location
		File dir=new File("F:\\sdet technical training");
		File files[]=dir.listFiles();
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i].getName());
		}
		boolean value=false;
		//trying to create a file based on the object
		boolean isDir=dir.isDirectory();
		dir.getAbsolutePath();
		if(isDir) {
			File file=new File("newFile1");
			try {
				value=dir.createNewFile();
				File.createTempFile("mytext","txt", dir);
			}catch (IOException e){
				e.printStackTrace();	
			}
		}
		if(value) {
			System.out.println("the new file is created");
		}
		else {
			System.out.println("The file already exits");
		}
		}

}
