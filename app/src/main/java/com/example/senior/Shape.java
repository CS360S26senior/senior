package com.example.senior;

public abstract class Shape {

    String color = "$PUT_YOUR_CHOICE_OF_COLOR";
    protected int x;
    protected int y;

    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
}
