package com.example.demo;

public class Rectangle {
    
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Side lengths must be positive");
        }
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        this.width = sideLength;
        this.height = sideLength;
    }
    
    public int getArea() {
        return width * height;
    }
    
}
