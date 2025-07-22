package Chapter1_Fundamentals.C1_2_DataAbstraction.Exercises.C_1_16_Rational_Numbers;

public class main {
    public static void main(String[] args) {

        Rational num1 = new Rational(7 , 4);
        Rational num2 = new Rational(  9, 11);

        System.out.println("Number 1 is " + num1);
        System.out.println("Number 2 is " + num2);
        System.out.println(num1.plus(num2));
        System.out.println(num1.minus(num2));
        System.out.println(num1.times(num2));
        System.out.println(num1.divides(num2));

    }
}
