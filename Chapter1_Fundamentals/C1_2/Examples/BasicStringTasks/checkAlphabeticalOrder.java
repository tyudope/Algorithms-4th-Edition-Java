package Chapter1_Fundamentals.C1_2.Examples.BasicStringTasks;

public class checkAlphabeticalOrder {
    public static void main(String[] args) {

        String[] myArr = new String[]{"People" , "Glory" , "Programming" , "Artificial"};
        System.out.println("Is myArr ordered ? " + IsArrayOrdered(myArr));
        String[] secondArr = new String[]{"Able" , "Camp", "Earn" , "Game"};
        System.out.println("Is secondArr ordered ? : " + IsArrayOrdered(secondArr));
    }
    public static boolean IsArrayOrdered (String[] n){
        for(int i = 1; i < n.length; i++){
            if(n[i-1] .compareTo(n[i]) > 0 ){
                // we use .compareTo method
                // Return < 0 -> First comes before second (correct order)
                // Return = 0 -> equal (still in order)
                // Return > 0 -> First comes after second (not ordered !)
                return false;
            }
        }
        return true;
    }
}
