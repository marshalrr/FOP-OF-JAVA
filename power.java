
import java.util.Scanner;

  class Main
{
  public static int power(int x,int n)
  {
    if(n==0)
       {
         return 1;
    }
           else if(n==1)
           {
             
           return x;
           }
      else if (n%2==0)
      {
        
        return power(x*x,n/2);
      }
      else {
        return x*power(x,n-1);
      }
    }
    public static void main(String args[])
    {
      Scanner mr=new Scanner(System.in);
      int x=mr.nextInt();
      int n=mr.nextInt();
      System.out.print("The value of "+x+" power "+n+" is "+power(x,n));
    }
  }