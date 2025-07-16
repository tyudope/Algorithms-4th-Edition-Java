package Chapter1_Fundamentals.C2_2_Exercises.WhiteList;
// CLIENT OF StaticSETofInts class.
public class WhiteList {
    public static void main(String[] args) {
        int[] my_array =  {1,5,6,1,3,4,9,8,10};

        StaticSETofInts my_ints = new StaticSETofInts(my_array);

        int key = 8;

        System.out.println("Is this array contains key " +  my_ints.contains(key));


    }
}
