import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  acceptthestringandrotatethestringntimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine();
        int l = word.length();
        int n = k % l ;
        String ch = word.substring(n) + word.substring(0,n);
        System.out.println(ch);
    }
}
