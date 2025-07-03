package Chapter1_Fundamentals.C2_2_Exercises.RollingDiceSimulator;

public class Counter {
    String name;
    int count;
    public Counter(String name){
        this.name = name;
        this.count = 0; // initialize the count.
    }


    // methods.
    public void increase(){
        count++;
    }
    @Override
    public String toString() {
        return String.format("%s count : %d" , name , count);
    }


}
