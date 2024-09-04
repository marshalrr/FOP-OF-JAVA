import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  mr=new Scanner(System.in);
        int siz=mr.nextInt();
        int arr[]=new int[siz];
        int sum =0;
        int count=0;
        for(int i=0;i<siz;i++){
            arr[i]=mr.nextInt();
        }
        int n=mr.nextInt();
        int soo[]=new int[siz];
        int m=0;
        for(int j=0;j<siz;j++)
        {
            if(arr[j]%n==0)
            {
                count++;
               soo[m]=arr[j];
                sum=sum+arr[j];
                m++;
            }
            
        }
        System.out.printf("The elements that are divisible by %d is ",n);
        for(int i=0;i<m;i++){
            System.out.printf("%d ",soo[i]);
        }
        System.out.printf("\nThe Count of the value that is divisible by %d is %d",n,count);
        System.out.printf("\nThe Sum of value that is divisible by %d is %d",n,sum);
        
    }
}