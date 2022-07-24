package com.demo.model;
public class Triangle extends Shape {
        float base,ht,s1,s2;
        
        public Triangle() {
           base=0;
           ht = 0;
           s1 = 0;
           s2 = 0;
        }
        
        public Triangle(String color,float base, float ht, float s1, float s2) {
            super(color);
        	this.base=base;
        	this.ht=ht;
        	this.s1=s1;
        	this.s2=s2;
        }
        
        public float area() {
        	return 0.5f*base*ht; 
        }
        
        public float perimeter() {
        	return base+s1+s2;
        }
        public String toString() {
        	return super.toString()+"\nBase : "+base+"\nHeight : "+ht+"\nSide1 : "+s1+"Side2 : "+s2;
        }
}
