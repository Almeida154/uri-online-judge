package Beginner;

// Rest of Division

import java.util.Scanner;
public class Uri1133 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int x, y;
		x=ler.nextInt();
		y=ler.nextInt();
		if (x>y) {
			for (int i=y; i<x; i++) {
				if (i%5==2 || i%5==3) {
					System.out.println(i);
				}
			}
		}
		else if (x<y) {
			for (int i=x+1; i<y; i++) {
				if (i%5==2 || i%5==3) {
					System.out.println(i);
				}
			}
		}
	}
}