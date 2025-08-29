import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  reversestringwithoutinbuiltfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i =word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
           
        }
    }
}
