import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner mr=new Scanner(System.in);
    String t=mr.next();
    String s=mr.next();
    if(s.length()>t.length()){
      System.out.println("0");
 return;
    }
    int i=0,j=0;
    while(j<t.length()){
      if(i<s.length() && s.charAt(i) == t.charAt(j)){
        i++;
        j++;
  }
      else{
        j++;
      }
    }
    if(i==s.length()){
      System.out.println("1");
    }
    else{
      System.out.println("0");
        
    }
  }
}
