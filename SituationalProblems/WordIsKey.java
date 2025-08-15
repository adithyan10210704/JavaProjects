package SituationalProblems;
/*
One programming language has the following keywords that cannot be used as identifiers: Break,case,
continue,default,defer,else,for,func,goto,if,map,range,return,struct,type,var. Write a program to find
the given word is a keyword or not
Case 1:
Input : defer
Expected output - defer is a keyword
 */
import java.util.*;
public class WordIsKey {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] keywords = {
                "Break", "case", "continue", "default", "defer", "else", "for",
                "func", "goto", "if", "map", "range", "return", "struct", "type", "var"
        };

        boolean isKeyword = false; // Flag to track if the word is found

        // Iterate through the array to check if the input matches any keyword
        for (String keyword : keywords) {
            if (input.equals(keyword)) { // Use .equals() for string comparison
                isKeyword = true; // Set flag to true if a match is found
                break; // Exit the loop as soon as a match is found
            }
        }

        String result;
        if (isKeyword) {
            result = input + " is a keyword";
        } else {
            result = input + " is not a keyword";
        }

        // Print the result
        System.out.println("Output - " + result);
    }
}
