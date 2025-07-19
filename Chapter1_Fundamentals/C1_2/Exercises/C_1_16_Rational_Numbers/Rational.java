package Chapter1_Fundamentals.C1_2.Exercises.C_1_16_Rational_Numbers;

public class Rational {
    // Mark fields final to make Rational immutable.
    private final int nominator;
    private final int denominator;

    public Rational(int nominator , int denominator){
        if (denominator == 0){
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        if (denominator < 0){
            nominator = -nominator;
            denominator = -denominator;
        }
        int gcd = gcd(Math.abs(nominator), denominator);
        this.nominator = nominator / gcd;
        this.denominator = denominator / gcd;
        // 5 / 15
        // 1 / 5
    }

    public Rational times(Rational other_num) {
        int new_nominator = this.nominator * other_num.nominator;
        int new_denominator = this.denominator * other_num.denominator;
        return new Rational(new_nominator , new_denominator);

    }
    public Rational divides(Rational other_num){
        int new_nominator = this.nominator * other_num.denominator;
        int new_denominator = this.denominator * other_num.nominator;
        return new Rational(new_nominator , new_denominator);
    }

    public Rational plus(Rational other) {
        int lcm = lcm(this.denominator, other.denominator);
        int scaledThis = this.nominator * (lcm / this.denominator);
        int scaledOther = other.nominator * (lcm / other.denominator);
        return new Rational(scaledThis + scaledOther, lcm);
    }

    public Rational minus(Rational other) {
        int lcm = lcm(this.denominator, other.denominator);
        int scaledThis = this.nominator * (lcm / this.denominator);
        int scaledOther = other.nominator * (lcm / other.denominator);
        return new Rational(scaledThis - scaledOther, lcm);
    }


    // helper function Euclidean algorithm
    // gcd stands for -> the greatest common divisor.
    private static  int gcd(int p , int q){
        if (q == 0) return p;
        return gcd(q ,  p % q);
    }
    // helper function
    // lcm stands for -> least common multiple.
    public static int lcm(int p , int q){
        return (p / gcd(p , q)) * q;
    }

    @Override
    public String toString() {
        if (denominator == 1) return String.format("%d", nominator);
        if (nominator == 0) return "0";
        return String.format("%d / %d", nominator, denominator);
    }
}
