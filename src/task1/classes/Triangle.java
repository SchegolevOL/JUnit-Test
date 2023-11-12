package task1.classes;

public class Triangle {
    private double angleA;
    private double angleB;
    private double angleC;
    private double sideAB;
    private double sideAC;
    private double sideBC;

    public Triangle(double sideAB, double sideAC, double sideBC) throws Exception {
        double sideMax = Math.max(sideAB, Math.max(sideAC, sideBC));
        if (sideAB + sideAC + sideBC - sideMax <= sideMax) {
            throw new Exception("There is no such triangle");
        } else {
            this.sideAB = sideAB;
            this.sideAC = sideAC;
            this.sideBC = sideBC;
            this.angleA = Math.round(Math.acos((Math.pow(sideAB, 2) + Math.pow(sideAC, 2) - Math.pow(sideBC, 2)) / (2 * sideAB * sideAC)) * 180 / Math.PI * Math.pow(10, 5)) / Math.pow(10, 5);
            this.angleB = Math.round(Math.acos((Math.pow(sideAB, 2) + Math.pow(sideBC, 2) - Math.pow(sideAC, 2)) / (2 * sideAB * sideBC)) * 180 / Math.PI * Math.pow(10, 5)) / Math.pow(10, 5);
            this.angleC = Math.round((180 - this.angleA - this.angleB) * Math.pow(10, 5)) / Math.pow(10, 5);
        }

    }

    public double getAngleA() {
        return angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public double getAngleC() {
        return angleC;
    }

    public double getSideAB() {
        return sideAB;
    }

    public double getSideAC() {
        return sideAC;
    }

    public double getSideBC() {
        return sideBC;
    }

    public double area() {
        return Math.sqrt(this.halfOfPerimeter() * (this.halfOfPerimeter() - sideAB) * (this.halfOfPerimeter() - sideAC) * (this.halfOfPerimeter() - sideBC));
    }

    private double halfOfPerimeter() {
        return (sideAB + sideAC + sideBC) / 2;
    }
}
