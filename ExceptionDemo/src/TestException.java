
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int b=100;
		for(int i=0;i<3;i++) {
		try {
			System.out.println("Enter the number : ");
			int num=sc.nextInt();
			System.out.println("Number : "+(b+num));
			break;
		}catch(InputMismatchException e){
			//e.printStackTrace();
			 
			System.out.println("Wrong Input!");
		}

	}
		System.out.println("Continue ....");
		}
		

}
