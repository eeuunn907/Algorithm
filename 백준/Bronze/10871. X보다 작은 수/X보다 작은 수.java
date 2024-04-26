import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner N = new Scanner(System.in);

    int a = N.nextInt();
    int b = N.nextInt();
    int arr[] = new int[a];
    
    for(int i = 0; i < a; i++){
      arr[i] = N.nextInt();
    }
    for(int i = 0; i < a; i++){
      if(arr[i] < b){
        System.out.println(arr[i]);
      }
    }
  }
}