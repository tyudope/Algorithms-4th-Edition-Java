package Chapter1_Fundamentals.C1_2.Exercises.C_1_2_Point2D;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Exercise 1.2.1
Write a Point2D client that takes an integer value N from the command line,
generates N random points in the unit square, and computes the distance separating
the closest pair of points.
*/
public class main {
    public static void main(String[] args) {
        // Takes an integer value N
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter how many points do you want to create by randomly.");
        try {
            n = s.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter a integer value.");
            return;
        }
        if (n < 2){ // cover the edge case.
            System.out.println("You need at least 2 points to compute a distance");
            return;
        }
        // Takes an integer value N
        Point2D[] points = new Point2D[n]; // create a Point2D array which contains n points.
        // Generate N random points in the unit square, and computes the distance separating
        for(int i = 0; i < points.length; i++){
            // Since we're asked to generate N random points in the unit square,
            // our coordinates must be in [0,1]
            double x = Math.random(); // creates positive double value between 0.0 and 1.0
            double y = Math.random();
            Point2D new_point = new Point2D(x , y);
            points[i] = new_point;
        }


        //Find the closest pair of points
        double minDistance = Double.MAX_VALUE; // storing the minimum distance.
        Point2D p1 = null, p2 = null; // create two null points

        for(int i = 0; i<points.length; i++){
            for(int j = i+1; j < points.length; j++){

                double distance = points[i].distanceTo(points[j]);
                if (distance < minDistance){
                    minDistance = distance;
                    p1 = points[i];
                    p2 = points[j];
                }
            }
        }
        System.out.printf("\nThe closest pair is \n%s and %s\n" , p1 ,p2);
        System.out.printf("Their distance is %.5f\n",minDistance);


        // Explanation;
        // j = i + 1 -> To avoid duplicates and self-comparisons like
        // points[0] with points[1] , points[1] with points[0] these are the yield same distance,
        // therefore, we avoid the duplicates
        // and points[0] with points[0] -> self-comparisons we also avoid that case.

        // How many comparisons?
        // This approach compares exactly:
        // n(n-1) / 2
        // pairs - the number of combinations of 2 points from N total
        // This is the minimal number needed to find the closest pair.

        // Goal -> Compare each unique pair of points only once.
        // Result -> Efficient brute-force comparison of all distinct pairs.
    }
}
