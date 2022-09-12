package circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x=0;
		int y=0;
		
		System.out.println("Enter X and Y co-ordinate :-");
		
		x=in.nextInt();
		y=in.nextInt();
		
		if(Math.pow(x, 2)+Math.pow(y, 2)<Math.pow(10, 2)) {
			System.out.println("This pointn is within the circle");
		}else {
			System.out.println("This pointn is outside the circle");
		}
	}

}
