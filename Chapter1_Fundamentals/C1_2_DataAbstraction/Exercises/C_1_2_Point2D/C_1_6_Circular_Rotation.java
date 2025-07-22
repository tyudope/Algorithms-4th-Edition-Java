package Chapter1_Fundamentals.C1_2_DataAbstraction.Exercises.C_1_2_Point2D;

// A string s is a circular rotation of a string t if it matches when the characters
//are circularly shifted by any number of positions; e.g., ACTGACG is a circular shift of
//TGACGAC, and vice versa. Detecting this condition is important in the study of genomic
//sequences. Write a program that checks whether two given strings s and t are circular
//shifts of one another. Hint : The solution is a one-liner with indexOf(), length(), and
// string concatenation.
public class C_1_6_Circular_Rotation {
    public static void main(String[] args) {

        // What is a circular rotation?
        // A string s is a circular rotation of string t if you can rotate t by some number of
        // characters and get s.

        // KEY INSIGHT.
        // If s is a circular rotation of t then
        // 's' is always a substring of t+t
        // why?
        // If you concatenate t with itself (t + t), all possible circular rotations of t will appear
        // inside that string.

        String s = "waterbottle";
        String t = "erbottlewat";
        // waterbottle is a rotation of waterbottle
        // you can rotate waterbottle right by 3 to get erbottlewat

        // cases that do not working.
        // 1.
        // String s = "hello"
        // String t = "ellohh";
        // Lengths are not equal, so they can't be circular rotations.
        // 2.
        // String s = "abcde";
        // String t = "abced";
        // Characters are same, but order is wrong
        // Even though both contain the same letters, s is not a rotation of t.
        if ((s.length() == t.length()) && ((t+t).contains(s))){
            System.out.println("S is a circular rotation of t");
        }else{
            System.out.println("S is not a circular rotation of t.");
        }
    }
}
