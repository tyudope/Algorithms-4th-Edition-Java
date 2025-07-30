package chapter1_fundamentals.c1_1_basics;

public class NFactorial {
    public static void main(String[] args) {
        // Write a recursive static method that computes the values of (N!)
        System.out.printf("%d factorial is %d" , 5 , nFactorial(5));
    }
    public static int nFactorial(int n){
        if (n == 0||n == 1) return 1;
        else return n * nFactorial(n-1);

    }
}

