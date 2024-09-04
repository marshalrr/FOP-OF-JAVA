import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner mr=new Scanner(System.in);
    String a,b="",c="####";
    do{
     a=mr.nextLine();
      if(b.isEmpty() || a.charAt(0)==b.charAt(b.length()-1)){
        System.out.println(a);
    }
      b=a;
      
  }
    while(!a.equals(c));
    mr.close();
}
}