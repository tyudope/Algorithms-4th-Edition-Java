package Chapter1_Fundamentals.C2_2_Exercises.BasicStringTasks;
// Is the string a palindrome?
// Palindrome; A word phrase, or sequence that reads the same backwards as forwards, e.g. madam
public class isPalindrome {
    public static void main(String[] args) {

        System.out.println("Is 'nurses' palindrome ? " + isStringPalindrome("nurses"));
        System.out.println("Is 'madam' palindrome ? " + isStringPalindrome("madam"));


    }
    public static boolean isStringPalindrome(String givenString){
        int n = givenString.length(); // take the string's length
        for (int i = 0; i < n/2; i++){ // traverse through the string until you reach the middle.
            if(givenString.charAt(i) != givenString.charAt(n-1-i)) return false;
            // If the char at the ith index don't equal with the char at the (string's length - i)th index
            // returns false because that means given string is not palindrome.
        }
        return true;
    }
}

