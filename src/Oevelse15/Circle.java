package Oevelse15;

public class Circle implements Shape {

    private double radius;

   public Circle(double radius){
       this.radius = radius;
   }

   public void getRadius(){
   }

   public double setRadius(){
       return setRadius();
   }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
