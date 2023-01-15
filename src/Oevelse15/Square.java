package Oevelse15;

// 1. Lav to klasser: Square med attributten width, og Circle med attributten radius.

import java.util.ArrayList;

public class Square implements Shape {

    private double width;

    public Square(double width){
        this.width = width;
    }

    public void getSquare(){
    }

    public double setSquare(){
        return setSquare();
    }

    @Override
    public double getArea() {
        return width * width;
    }


}
