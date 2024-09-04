import java.util.Scanner;
class main{
public static void main(String args[]){
    Scanner mr=new Scanner(System.in);
    int no=mr.nextInt();
    int d1,d2,d3;
    d1=no%10;
    no=no/10;
    d2=no%10;
    no=no/10;
    d3=no%10;
    int c=d1*100+d2*10+d3;
    System.out.print(c);

}
}