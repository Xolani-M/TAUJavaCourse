package chapter6;
public class HomeAreaCalculator {

    public static void main(String[] args){
        /*****************
         * Rectangle 1
         * **************/

        //Create an instance of a rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);

        double areaOfRoom1 = room1.calculateArea();

        /*****************
         * Rectangle 2
         * **************/

        Rectangle room2 = new Rectangle(60,30);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom1;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
