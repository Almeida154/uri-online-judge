package Beginner;

// Vector Replacement I

import java.util.Scanner;
public class Uri1172 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int x[] = new int[10];
		for(int i=0; i<10; i++) {
			x[i] = ler.nextInt();
		}
		for(int i=0; i<10; i++) {
			if(x[i]<=0) {
				x[i]=1;
			}
			System.out.println("X["+i+"] = "+x[i]);
		}
	}
}