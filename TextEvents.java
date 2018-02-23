
import objectdraw.*;

/**
 * 
 * Implements and tests recursive methods to count digits in a number and
 * test for palindromes.
 * 
 * Erika Sklaver
 * Section 2
 */
public class TextEvents extends FrameWindowController {

    // Tests the recursive methods numDigits and isPalindrome.
    public void begin() { 
        
        int testNum = 5;
        System.out.println(testNum + " has " + numDigits(testNum) + " digits");
      
        testNum = 42;
        System.out.println(testNum + " has " + numDigits(testNum) + " digits");
      
        testNum = 8743255;
        System.out.println(testNum + " has " + numDigits(testNum) + " digits");
        
        System.out.println();
        
        String palTest = "racecar";
        if (isPalindrome(palTest)) {
            System.out.println("\"" + palTest + "\" IS a palindrome"); 
        } else {
            System.out.println("\"" + palTest + "\" is NOT a palindrome"); 
        }

        palTest = "computer";
        if (isPalindrome(palTest.trim())) {
            System.out.println("\"" + palTest + "\" IS a palindrome"); 
        } else {
            System.out.println("\"" + palTest+  "\" is NOT a palindrome"); 
        }

        palTest = "aibohphobia";
        if (isPalindrome(palTest.trim())) {
            System.out.println("\"" + palTest + "\" IS a palindrome"); 
        } else {
            System.out.println("\"" + palTest+  "\" is NOT a palindrome"); 
        }
        
    }
    
    public int numDigits(int n){
        if(n < 10){
            //base case: if the inputed number is less than 10 than it has 1 digit
            return 1;
        }else{
            //recursive case: if the number has more than one digit, divide that number by 10 and add one then
            //test the new number again until the number only has one digit. 
            return numDigits(n/10)+1;
            
        }
    }
    
    public boolean isPalindrome(String s){
        if (s.length() == 1 || s.length() == 0){
            //base case: if the length of the string is 1 or 0 then the word is a palindrome
            return true; 
        }else{
            //recursive case 
            if(s.charAt(0) == s.charAt(s.length()-1)){
            //if the first and the last letter are the same then create a new string without the first and last
            //letter and then test the new substring again until the string is of length 1 or 0 
            s = s.substring(1, s.length()-1);     
            return isPalindrome(s); 
          }else{
              //if the first and last letter are not the same then the word is not a palindrome 
              return false; 
          }
          
        }
    }
    
}
