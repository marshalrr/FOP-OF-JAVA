import java.util.Scanner;
class main{
public static void main(String args[]){
    Scanner mr=new Scanner(System.in);
    int n=mr.nextInt();
    if (n==0)
    {
        System.out.print("0");
    }
    else if(n%9==0)
    {
        System.out.println("9");
    }
    else{
        System.out.println(n%9);

    }
}
}