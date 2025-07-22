package Chapter1_Fundamentals.C1_2_DataAbstraction.Exercises.C_1_11_SmartDate;

public class main {
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

