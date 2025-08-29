
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UniqueElements{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a = new int[n];
        boolean unique = false;
        for(int i = 0;i < n;i++){
            a[i]=sc.nextInt();
        }
          for(int i =0;i<n;i++){
                int count = 0;
              for(int j=0;j<n;j++){
                  if(a[i]==a[j]){
                      count++;
                  }
              }
              if(count==1){
                  System.out.print(a[i]+" ");
                    unique=true;
              }
          }
        if(!unique){
            System.out.println("No unique elements in the array");
        }
    }
}
