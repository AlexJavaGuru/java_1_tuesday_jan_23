package student_anastasiia_bokareva.lesson8.level4;

public class Square extends Shape {
    private int side;
    public Square(int side){
        this.side=side;
    }
    public double calculateArea(){
        return (Math.pow(side,2));
    }
    public double calculatePerimetr(){
        return (4*side);
    }
}
