import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner mr=new Scanner(System.in);
   String num=mr.next();
    char[] arr=num.toCharArray();
    for(int i=0; i<arr.length;i+=2){
      if(i + 1 <arr.length){
        char temp =arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
}
    }
    System.out.println(new String(arr));
  }
}