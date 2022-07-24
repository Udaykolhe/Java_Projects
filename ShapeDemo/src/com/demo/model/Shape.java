package com.demo.model;

abstract public class Shape {
           private String color;
           
           
           public Shape() {
        	   color = "white";
           }
           public Shape(String c) {
        	   color = c;
           }
           abstract public float area();
           abstract public float perimeter();
           public String toString() {
        	   return "color = "+color;
           }
           
}