package chapter1_fundamentals.c1_2_dataabstraction.exercises.Exercise_1_2_11_SmartDate;

public class SmartDateClient {
    public static void main(String[] args) {

        try {
            SmartDate valid = new SmartDate(2024, 2, 29);
        } catch (IllegalArgumentException e) {
            System.out.println(" Failed: 2024-02-29 → " + e.getMessage());
        }

        try {
            SmartDate invalidMonth = new SmartDate(2023, 13, 1);
        } catch (IllegalArgumentException e) {
            System.out.println(" Failed: 2023-13-01 → " + e.getMessage());
        }
    }
}

