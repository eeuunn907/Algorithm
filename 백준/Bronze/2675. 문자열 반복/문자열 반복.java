import java.util.Scanner;
public class Main { 
    public static void main(String[] args) { 
       
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		for(int i=0; i<test; i++) {
			int repeat = scan.nextInt();
			String str = scan.next();
			
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<repeat; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		scan.close();
	}
}