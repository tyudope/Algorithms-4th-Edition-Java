package Chapter1_Fundamentals.C2_2_Exercises.RollingDiceSimulator;

import java.util.ArrayList;
import java.util.Random;


// WE USE COUNTER.JAVA (OUR SPECIAL TYPE OF DATA)
// BY USING THESE SPECIFIC DATA TYPE WE ARE ABLE TO CREATE A PROGRAM THAT SIMULATES ROLL DICE T TIMES AND
// SAVE THE RECORDS


public class RollDiceCount {
    public static void main(String[] args) {
        // Counter client that simulates T rolls of dice.

        // CREATE COUNTERS.
        Counter count1 = new Counter("Side 1 ");
        Counter count2 = new Counter("Side 2");
        Counter count3 = new Counter("Side 3");
        Counter count4 = new Counter("Side 4");
        Counter count5 = new Counter("Side 5");
        Counter count6 = new Counter("Side 6");

        // CREATE A COUNTERS LIST.
        ArrayList<Counter> sides_count_arr = new ArrayList<>();
        sides_count_arr.add(count1);
        sides_count_arr.add(count2);
        sides_count_arr.add(count3);
        sides_count_arr.add(count4);
        sides_count_arr.add(count5);
        sides_count_arr.add(count6);

        // Roll a T times Dice and save the records.
        Random r = new Random();
        int t = 100;
        System.out.println(" AFTER ROLLING A DICE 'T'(100) Times, Our Records is ;\n-----------------------------------------------");
        for(int i = 0; i < t; i++){
            int result =  r.nextInt(1,7);
            switch (result){
                case 1 -> count1.increase();
                case 2-> count2.increase();
                case 3-> count3.increase();
                case 4-> count4.increase();
                case 5-> count5.increase();
                case 6-> count6.increase();
                default -> throw new RuntimeException();
            }
        }


        for (Counter sides : sides_count_arr) {
            System.out.println(sides);
        }
    }
}
