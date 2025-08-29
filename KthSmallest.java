
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class KthSmallest{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a = new int[n];
        int key = sc.nextInt();
        for(int i = 0;i < n;i++){
            a[i]=sc.nextInt();
        }
        if(key> n){
            System.out.println("Out of Range");
        }
        else{
            Arrays.sort(a);
            System.out.print(a[key-1]);
        }
    }
}
