package com.gmail.medvediev.homeworks.homework13_1;

public class ShapeRunner {
        public static void main(String[] args) {
            Shape[] shapes = {
                    new Circle(5),
                    new Triangle(3, 4),
                    new Square(6)
            };

            double totalArea = calculateTotalArea(shapes);
            System.out.println("Sum of all areas: " + totalArea);
        }

        public static double calculateTotalArea(Shape[] shapes) {
            double total = 0;
            for (Shape shape : shapes) {
                total += shape.getArea();
            }
            return total;
        }

}
