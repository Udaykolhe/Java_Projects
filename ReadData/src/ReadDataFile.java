import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ReadDataFile {

	public static void main(String[] args) {
		try(ObjectInputStream oin= new ObjectInputStream(new FileInputStream("D:\\Java Prg\\Mini_Projects\\FileHandlingDemo\\productdata.txt"));) {
			
			
		}catch(FileNotFoundException e ) {
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
                
	}

}
