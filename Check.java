import java.util.Scanner;



public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			
			
			System.out.println(min(a, b, c, d));
			
		}
			
		finally{
			scan.close();
		}
		
	}
	
	static int min (int a, int b, int c, int d) {
		if ((a!=b) && (a!=c) && (a!=d) && (b!=c) && (b!=d) && (d!=c)){
			if((a<b) && (a<c) && (a<d)) {
				return a;
			}
			else if((b<a) && (b<c) && (b<d)) {
				return b;
			}
			else if((c<b) && (c<a) && (c<d)) {
				return c;
			}
			else {
				return d;
			}
		}
		else {
			if((a<c) && (a == b) && (a<d)) {
				return a;
			}
			else if((c<a) && (c == d) && (c<b)) {
				return c;
			}
			else if((a<c) && (a == d) && (a<b)) {
				return a;
			}
			else if((c<a) && (c == b) && (c<d)) {
				return c;
			}
			else {
				return b;
			}
		}
		
	}
}