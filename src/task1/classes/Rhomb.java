package task1.classes;

public class Rhomb {
    private double diagonalOne;
    private double diagonalTow;

    public Rhomb(double diagonalOne, double diagonalTow) {
        this.diagonalOne = diagonalOne;
        this.diagonalTow = diagonalTow;
    }

    public double getDiagonalOne() {
        return diagonalOne;
    }

    public double getDiagonalTow() {
        return diagonalTow;
    }
    public double area(){
        return this.diagonalOne*this.diagonalTow;
    }
}
