import java.util.Scanner;
class main{
public static void main(String args[]){
System.out.println("enter the no to find the before series of the no ");
Scanner mr=new Scanner(System.in);
int n=mr.nextInt();
int a=0,b=1,c=0;
int i=2;
while(i<n)
{
    c=a+b;
    a=b;
    b=c;
    i++;
}
System.out.println(c);
}
}