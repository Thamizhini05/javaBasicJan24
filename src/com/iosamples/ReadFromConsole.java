package com.iosamples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
	private static void process(String str) {
		System.out.println(" processing...>"+str+"\n");
	}
	private static void doReaderFromStdin() throws ApplicationException{
		BufferedReader inStream=new BufferedReader(new InputStreamReader(System.in));
		String inLine="";
		while(!(inLine.equalsIgnoreCase("quit"))&& !(inLine.equalsIgnoreCase("exit"))) {
			System.out.println("prompt> ");
			try {
				inLine=inStream.readLine();
			}catch(IOException e) {
				throw new ApplicationException(e.toString(),e);
			}
			process(inLine);
		}
	}
	public static void main(String[] args) throws Exception{
		doReaderFromStdin();
	}

}
