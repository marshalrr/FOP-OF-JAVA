import java.util.Scanner;
class Main
{
  static int sum(int arr[],int i,int n){
    if (i == n){
      return  0;
    }else{
      if (arr[i] % 2 == 1 ){
        return arr[i]+sum(arr,i+1,n);
      }else{
        return sum(arr,i+1,n);
      }
    }
  }
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
      arr[i] = s.nextInt();
    }
      System.out.println("Sum = " + sum(arr,0,n));
    }
  }