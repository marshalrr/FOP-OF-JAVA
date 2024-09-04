import java.util.*;
import java.util.Scanner;
class main{
    public static void main(String args[]){
        Scanner mr=new Scanner(System.in);

        int m=mr.nextInt();
        int sum=0;
        int temp,r;
        temp=m;
        while(m>0){
            r=m%10;
            sum=(sum*10)+r;
            m=m/10;
        }
        if(temp==sum) {System.out.println("pallindrome");}
        else {System.out.println("not a Pallindrome");}
    }
}