import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner mr=new Scanner(System.in);
     String s=mr.nextLine();
    int i=0;
    int l=s.length()-1;
    while(i<l){
      
    
    if(s.charAt(i)!=s.charAt(l)){
     System.out.print("Not a Palindrome"); 
    mr.close();
      return;
    }
      i++;
      l--;
    }
     System.out.println("Palindrome"); 
    
    }
}
