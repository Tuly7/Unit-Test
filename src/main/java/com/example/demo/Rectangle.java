package com.example.demo;

public class Rectangle {
    
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int sideLength) {
        this.width = sideLength;
        this.height = sideLength;
    }
    
    public int getArea() {
        return width * height;
    }
    
}