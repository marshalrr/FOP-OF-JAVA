import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {

Scanner sc =new  Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i<=n2;i++){
            if(n2 >= 100 && n2 <= 999){
                System.out.printf("%03d ",i);
            }
            else if(n2 <= 10 && n2 >= 99){
                 System.out.printf("%02d ",i);
            }
            else
            {
                 System.out.printf("%01d ",i);
            }
        }
    }
}