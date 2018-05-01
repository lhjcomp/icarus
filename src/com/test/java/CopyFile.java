package com.test.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	static String inputFile = "C:/README.txt";
	static String outputFile = "C:/TEST/OUTFILE.txt";

	public static void main(String[] args) {
		final int BUFFER_SIZE = 4096;
		int readLen;
		
		try{
			InputStream inputStream = new FileInputStream(inputFile);
			
			OutputStream  outputStream = new FileOutputStream(outputFile);
			
			byte[] buffer = new byte[BUFFER_SIZE];
			
			while((readLen = inputStream.read(buffer)) != -1){
				outputStream.write(buffer, 0, readLen);
			}
			inputStream.close();
			outputStream.close();
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
