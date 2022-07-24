package com.demo.service;
import java.util.Scanner;

import com.demo.model.Circle;
import com.demo.model.Shape;
import com.demo.model.Triangle;

public class ShapeService {
      static Shape[] sarr;
      static int cnt;
      static {
    	  sarr=new Shape[2];
    	  cnt=0;
    }
      
      public static void addShape(int choise) {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter color : ");
    	  String color=sc.next();
    	  switch(choise) {
    	  case 1 : 
    		  System.out.println("Enter Base : ");
    		  float base=sc.nextFloat();
    		  System.out.println("Enter Height : ");
    		  float ht=sc.nextFloat();
    		  System.out.println("Enter Side-1");
    		  float s1=sc.nextFloat();
    		  System.out.println("Enter Side-2");
    		  float s2=sc.nextFloat();
    		  sarr[cnt]=new Triangle(color,base,ht,s1,s2);
    		  
    		   break;
    	  case 2 :
    		  System.out.println("Enter radius : ");
    		  float r = sc.nextFloat();
    		  sarr[cnt]=new Circle(color,r);
    		  break;
    	  case 3 :
    		  System.out.println("Enter length : ");
    		  float l = sc.nextFloat();
    		  System.out.println("Enter the width : ");
    		  float w = sc.nextFloat();
    		  break;
    	  case 4 :
    		  System.exit(0);
    		  break;
    		 default :
    			 System.out.println("Wrong Choise!");
    	  }
    	  
      }
       public static void countShapes() {
    	  int tcnt=0;
    	  int ccnt=0;
    	  int rcnt=0;
    	  for(int i=0;i<cnt;i++) {
    		  if(sarr[i] instanceof Triangle) {
    			  tcnt++;
    		  }
    		  else if(sarr[i] instanceof Circle){
    			  ccnt++;
    		  }
    		  else {
    			  rcnt++;
    		  }
    	  }
    	  System.out.println("Tringle count : "+tcnt);
    	  System.out.println("Circle count : "+ccnt);
    	  System.out.println("Rectangle count : "+rcnt);
      }
}
