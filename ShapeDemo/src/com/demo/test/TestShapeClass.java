package com.demo.test;
import java.util.Scanner;

import com.demo.model.Shape;
import com.demo.service.ShapeService;

public class TestShapeClass {

	public static void main(String[] args) {
		     Scanner sc=new Scanner(System.in);
		     int choise = 0;
		     Shape s = null;
		     do {
             System.out.println("1.Triangle"
             		           +"\n2.Circle"
             		           +"\n3.Rectangle"
             		           +"\n4.Exit");
             System.out.println("Enter choise : ");
             choise = sc.nextInt();
             switch(choise) {
             case 1 :
            	 ShapeService.addShape(choise);
//            	 s = new Triangle("Yellow",8,9,7,5);
//            	 System.out.println("Area : "+s.area());
//            	 System.out.println("Perimeter : "+s.perimeter());
            	 break;
             case 2 :
            	 ShapeService.addShape(choise);
//            	 s= new Circle("Yellow",8);
//            	 System.out.println("Area : "+s.area());
//            	 System.out.println("Perimeter : "+s.perimeter());
            	 break;
             case 3 :
            	 ShapeService.addShape(choise);
            	 break;
             case 4 :
            	 sc.close();
            	 System.exit(0);
            	 break;
            	 default :
            		 System.out.println("Wrong Choise!");
             }
//            		 System.out.println("Area : "+s.area());
//                	 System.out.println("Perimeter : "+s.perimeter());
//             
             }while(choise!=4);
		     
		     ShapeService.countShapes();
		    
	}

}
