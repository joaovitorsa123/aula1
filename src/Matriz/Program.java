package Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal: ");
		for(int i=0; i<n; i++) {
			
				System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		System.out.println();
		System.out.println("Negative Numbers: ");
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n;j++) {
				
				if(mat[i][j]<0)
				{
					System.out.print(mat[i][j] + " ");
					count ++;
				}
				
			}
	}
		System.out.println("Negative Numbers: " + count);
		sc.close();
	}

}
