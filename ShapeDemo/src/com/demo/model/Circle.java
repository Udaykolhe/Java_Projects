package com.demo.model;

public class Circle extends Shape {
       private float radius;
       final float PI = 3.142f;
       
       public Circle() {
    	   radius = 0;
       }
       public Circle(String color,float radius) {
    	   super(color);
    	   this.radius=radius;
    	   
       }
       
       public float area() {
    	   return PI*radius*radius;
       }
       
       public float perimeter() {
    	   return 2*PI*radius;
       }
       
       public String toString() {
    	   return super.toString()+"\nradius : "+radius;
       }
}
