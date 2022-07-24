package com.demo.test;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) {
             String fn ="myfile.txt";  
		try(DataInputStream din =new DataInputStream(new FileInputStream("myfile.txt"));
              DataOutputStream dout= new DataOutputStream(new FileOutputStream(fn));) {
			dout.writeInt(222018144);
			dout.writeUTF("Uday Kolhe");
			dout.writeFloat(25415.25f);
			
			//For reading from file
			int i=din.readInt();
			String nm=din.readUTF();
			float f=din.readFloat();
			System.out.println(i+","+nm+","+f);
		}catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	}

}
