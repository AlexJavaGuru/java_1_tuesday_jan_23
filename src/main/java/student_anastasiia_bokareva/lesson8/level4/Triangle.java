package student_anastasiia_bokareva.lesson8.level4;

import student_anastasiia_bokareva.lesson3.level7.Product;

public class Triangle extends Shape {
    private int side;
    public Triangle(int side){
        this.side=side;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3)/2*Math.pow(side,2));
    }

    @Override
    public double calculatePerimetr() {
        return (3*side);
    }
}
