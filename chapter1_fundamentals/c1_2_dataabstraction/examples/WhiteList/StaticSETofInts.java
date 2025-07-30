package chapter1_fundamentals.c1_2_dataabstraction.examples.WhiteList;
import java.util.Arrays;
//Binary search recast as an object-oriented program (an ADT for search in a set of integers)
// Abstract Data Type.
public class StaticSETofInts {
    private int[] a;
    public StaticSETofInts(int[] keys){
        a = new int[keys.length];
        for(int i = 0; i < keys.length; i++){
            a[i] = keys[i]; // Defensive copy
        }
        Arrays.sort(a);
    }
    public boolean contains(int key){
        return rank(key) != -1;
    }
    private int rank(int key){
        // binary search
        int lo = 0;
        int hi = a.length -1;
        while (lo <= hi){
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo)  / 2;
            if(key < a[mid]){
                hi = mid - 1;
            }
            else if(key > a[mid]){
                lo = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
