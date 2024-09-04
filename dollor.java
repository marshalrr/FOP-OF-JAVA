import java.util.Scanner;
class main{
public static void main(String args[]){
    Scanner mr=new Scanner(System.in);
    int doll1=mr.nextInt();
    int cent1=mr.nextInt();
    int doll2=mr.nextInt();
    int cent2=mr.nextInt();
    int dsum=(doll1+doll2)+(cent1+cent2)/100;
    int csum  = (cent1+cent2)%100;
    System.out.println(dsum+" dollors");
    System.out.print(csum+" cents");

}
}
