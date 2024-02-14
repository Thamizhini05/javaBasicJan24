package com.iosamples;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertyFileSample {

	public static void main(String[] args) throws Exception {
		Properties connProp=new Properties();
		connProp.setProperty("username","trg08");
		connProp.setProperty("password","trg08");
		FileOutputStream propsFile=new FileOutputStream("Information.properties");
		connProp.store(propsFile, "Propertise File");
		propsFile.close();
		String uname=null;
		String password=null;
		Properties tempProp=new Properties();
//		FileInputStream obtained=new FileInputStream("Information.properties");
		FileInputStream obtained=new FileInputStream("Information.properties");
		tempProp.load(obtained);
		propsFile.close();
		uname=tempProp.getProperty("username");
		password=tempProp.getProperty("password");
		System.out.println(uname+password);
	}

}
