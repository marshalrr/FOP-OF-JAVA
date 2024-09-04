import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner mr=new Scanner(System.in);
    String str=mr.nextLine();
    int len=str.length();
    int i,j,startIndex,endIndex;
    endIndex=len-1;
    for(i=len-1;i>=0;i--){
     if((str.charAt(i)==' ') || (i==0)){
       if(i==0){
         startIndex=0;
       }
       else{
         startIndex=i + 1;
    }
       for (j=startIndex;j<=endIndex;j++)
       {
         System.out.print(str.charAt(j));
  }
       endIndex=i-1;
       System.out.print(" ");
}
    }
  }
}