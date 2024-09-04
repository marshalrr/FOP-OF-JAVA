import java.util.Scanner;
class main{
public static void main(String args[]){
System.out.println("enter the no to find whether it is strong no or not");
Scanner mr=new Scanner(System.in);
int n=mr.nextInt();
int rem,i,fact,sum=0;
int temp =n;
while(n!=0)
{
    i=1;
    fact =1;
    rem=n%10;
    while(i<=rem){
        fact=fact*i;
        i++;
    }
    sum=sum+fact;
    n=n/10;
}
if (sum==temp){
    System.out.println("YES");

}else{
    System.out.println("NO");
}
}
}