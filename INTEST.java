import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i;
        int count = 0;

        for(i=0;i<n;i++) {
            int t = sc.nextInt();
            if (t%3==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
