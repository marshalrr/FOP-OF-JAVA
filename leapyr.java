import java.util.Scanner;
class main{
public static void main(String args[]){
Scanner mr=new Scanner(System.in);
int yr=mr.nextInt();
if((yr%4==0)&&(yr%100!=0)||(yr%400==0))
System.out.println(yr+ "is a leap year");
else
System.out.println(yr+ "is not a leap year");
}
}