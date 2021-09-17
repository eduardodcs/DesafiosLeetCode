package br.com.leetcode;

import java.util.Scanner;

public class September02_MudaVariavelScanner {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int i = Integer.parseInt(scan.next());
		double d = Double.parseDouble(scan.next());
		String s = scan.next();

		System.out.println("String " + s);
		System.out.println("Double " + d);
		System.out.println("Integer " + i);
	}
	
}
