import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class lengthstringwithoutusinginbuiltfunction {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
