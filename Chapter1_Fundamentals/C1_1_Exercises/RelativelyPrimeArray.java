package Chapter1_Fundamentals.C1_1_Exercises;

public class RelativelyPrimeArray {

    // Euclid's algorithm to compute gcd
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }

    public static void main(String[] args) {
        int N = 10; // You can change this value
        boolean[][] a = new boolean[N][N];

        // Fill the array
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = (gcd(i, j) == 1);
            }
        }

        // Print the array (optional)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] ? "T " : "F ");
            }
            System.out.println();
        }
    }
}
