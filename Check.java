import java.util.Scanner;



public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			
			System.out.println(Math.min(a, b));
			
		}
			
		finally{
			scan.close();
		}
		
	}
}