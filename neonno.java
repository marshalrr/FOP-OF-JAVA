import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  mr=new Scanner(System.in);
        int  n=mr.nextInt();
        int i=0;
            if(n>=0&&n<=9){
            i=n*n;
            int n1=i%10;
                int n2=i/10;
                if(n1+n2==n){
                    System.out.printf("%03d is a Neon Number.",n);
                }
                else{
                    System.out.printf("%04d is not a Neon Number.",n);
                }
                }
        else
        {
            System.out.printf("Invalid Input");
        }
        }
    }
