package com.demo.test;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferStream {

	public static void main(String[] args) {
		// use autoclosable resources in 1.7
		//true = open file in append mode
		File f=new File("textcopy.txt");
		BufferedOutputStream fout=null;
		try {
		if(f.exists()){
		fout=  new BufferedOutputStream(new FileOutputStream("textcopy.txt", true));
		}
		else {
	    fout= new BufferedOutputStream(new FileOutputStream("textcopy.txt", true));
		}
		}catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
		
		try(BufferedInputStream fis =new BufferedInputStream(new FileInputStream("text.txt"));
		    BufferedOutputStream fout1=fout;)
		{
		int data =fis.read();
        while(data!=-1) {
        	fout1.write(data);
        	data=fis.read();
        }
		}catch(FileNotFoundException e) {
			System.out.println("FileNotFound");
		} catch (IOException e) {
			System.out.println("you don't have access of file");
		}
		
		}

}
