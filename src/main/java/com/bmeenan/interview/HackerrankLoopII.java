package com.bmeenan.interview;

import java.util.Scanner;

public class HackerrankLoopII {

	public void doIt() {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		for (int i = 0; i < t; i++) {
			String s = in.nextLine();
			String[] numbers = s.split("\\s+");
			int a = Integer.valueOf(numbers[0]);
			int b = Integer.valueOf(numbers[1]);
			int n = Integer.valueOf(numbers[2]);
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			String line = "";
			for (int j = 1; j < n; j++) {
				if (line != "") {
					line += " ";
				}
				line += a * b;
			}
			System.out.println(line);
		}
		in.close();
	}
}
