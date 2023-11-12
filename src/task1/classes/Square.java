package task1.classes;

public class Square {

    private double side;

    public Square(double side) throws Exception {
        if (side>0) {
            this.side = side;
        }else{
            throw new Exception("It is not possible to create an instance of the square class");
        }

    }

    public double getSide() {
        return side;
    }
    public double area(){
        return side*side;
    }
}
