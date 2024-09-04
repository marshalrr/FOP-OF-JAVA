import java.util.Scanner;
class main{
public static void main(String args[]){
System.out.println("enter the no to find the pattern ");
Scanner mr=new Scanner(System.in);
int n,i,j;
n=mr.nextInt();
for(i=1; i<=n;i++)
{
    for(j=1; j<=n; j++)
    {
        if(i==1 || i==n || j==1 || j==n){
            
        System.out.print("*");
        }
    
    System.out.print("");
    }
    System.out.println();
}
}
}

