
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DeleteElement{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();  
      int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();         
        }           
        int pos = sc.nextInt();            
        if(pos > n || pos < 1){
            System.out.println("Deletion not possible.");
        }
        else{
         for (int i = pos - 1; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
        for (int i = 0; i < n-1; i++) {
            System.out.print(a[i] + " ");
        }
        }
    }
}
        
