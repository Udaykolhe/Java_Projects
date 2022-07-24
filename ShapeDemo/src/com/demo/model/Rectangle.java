package com.demo.model;

public class Rectangle extends Shape{
    private float l;
    private float w;
    
    public Rectangle() {
         	l=0;
         	w=0;
    }
	
	public Rectangle(String color,float l, float w) {
		super(color);
		this.l = l;
		this.w = w;
	}

	@Override
	public float area() {
		return l*w;
	}

	@Override
	public float perimeter() {
		
		return 2*(l+w);
	}
	
	public String toString() {
		return super.toString()+"\nLength : "+l+"\nWidth : "+w;
	}

}
