package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for int 1: ");
		int s0 = in.nextInt();
		System.out.print("Enter value for int 2: ");
		int s1 = in.nextInt();
		double avg = (s0 + s1) / 2.0;
		System.out.print("The average of int 1 and int 2 is: " + avg);
	}

}
