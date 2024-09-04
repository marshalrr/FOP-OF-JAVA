import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
    int n,a=0,b=1,c=0;
    int i=2;
    n=sc.nextInt();
    while(i<n){
      c=a+b;
      a=b;
      b=c;
      i++;
    }
    System.out.println(c);
  }
}