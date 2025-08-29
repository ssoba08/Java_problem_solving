import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class countspecialcharacters  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isLetterOrDigit(ch) ||Character.isWhitespace(ch)){
                count++;
            }
        }
        System.out.println(word.length()-count);
    }
} 
