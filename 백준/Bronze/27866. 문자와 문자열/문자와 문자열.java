import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner bc = new Scanner(System.in);

      String a = bc.next();
      int b = bc.nextInt();

      System.out.println(a.charAt(b-1));
    }
}