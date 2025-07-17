package Chapter1_Fundamentals.C1_2.Exercises.C_1_2_Point2D;

public class Point2D {

    private double x;
    private double y;
    public Point2D(double x , double y){
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point2D otherPoint){
        return Math.sqrt( Math.pow((this.x - otherPoint.x),2) + Math.pow((this.y - otherPoint.y),2) );
    }

    @Override
    public String toString() {
        return String.format("( x : %.2f , y : %.2f )" , x , y);
    }
}
