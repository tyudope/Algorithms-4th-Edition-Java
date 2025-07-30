package chapter1_fundamentals.c1_1_basics;

import java.util.Scanner;

public class TracedEuclid {
    public static int gcd(int p , int q){
        System.out.println("p : " + p + ", q : " + q);
        if(q==0) return p; // because of this recursive case, always keep reducing the larger number.
        return gcd(q , p%q);
       // Modulo gives you the remainder.
        // When the remainder becomes 0, the last non-zero q is the GCD.
    }
    public static void main(String[] args) {
        System.out.print("Please provide p : ");
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        System.out.println("Please provide q : ");
        int q = s.nextInt();

        int result = gcd(p,q);
        System.out.print("Greatest Common Divisor : " + result);




    }
}
