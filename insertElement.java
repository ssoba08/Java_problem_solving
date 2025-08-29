import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  insertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int element = scanner.nextInt();
        int position = scanner.nextInt(); 
        int index = position - 1;

        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = element;

        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

