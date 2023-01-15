package Oevelse15;

// 2. Lav et interface Shape med metoden: getArea.


import java.util.ArrayList;
import java.util.List;

interface Shape {

    double getArea();


// 3. Lad både Square og Circle implementere Shape, og beregn arealet (square = w*w, circle = Math.PI*r*r)
// 4. Lav en liste af blandede cirkler og kvadrater, og lav en løkke der beregner og udskriver arealet af hver enkelt af dem.
public static void main(String[] args) {
    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add(new Square(2));
    shapes.add(new Circle(3));
    shapes.add(new Square(4));
    shapes.add(new Circle(5));

    for (Shape shape : shapes) {
        System.out.println("Area: " + shape.getArea());
}


    }



}












/*

    private double getArea(double width, double radius){
        double square = width * width;
        double circle = Math.PI * radius * radius;
        return getArea(square,circle);
    }

    ArrayList<Double> mixed = new ArrayList<>(); */

