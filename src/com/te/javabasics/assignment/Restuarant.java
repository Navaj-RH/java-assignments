package com.te.javabasics.assignment;

import java.util.Scanner;

public class Restuarant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st[] = { "", "1--->Paneer-----Rs.250", "2--->Chicken Biryani-----Rs.150",
				"3--->Mutton Biryani-----Rs.250", "4--->idli-----Rs.40", "5--->Dosa-----Rs.50",
				"6--->ColdDrinks-----Rs.90" };
		int[] ar = { 0, 250, 150, 250, 40, 50, 90 };
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		int sum = 0;
		System.out.println("your order please");
		while (true) {
			System.out.println("mention how many items you need: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			String[] str = new String[n];
			System.out.println("Enter the item numbers : ");
			for (int i = 0; i < n; i++) {
				int item = sc.nextInt();
				sum = sum + ar[item];
				str[i] = st[item];
				arr[i] = ar[item];

			}
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			System.out.println("you want more press : yes");
			String yes = sc.next();
			if (yes.equalsIgnoreCase("yes")) {
				continue;
			} else
				break;

		}
		System.out.println("Total amount payable: " + sum);
		System.out.println("Thank you. Your order is placed");

	}
}
