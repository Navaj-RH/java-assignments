package com.te.javabasics.assignment;

import java.util.Scanner;

public class RestuarantItems {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st[] = { "", "Paneer-->1", "Chicken Biryani-->2", "Mutton Biryani-->3", "idli-->4", "Dosa-->5",
				"ColdDrinks-->6" };
		int[] ar = { 0, 250, 150, 250, 40, 50, 90 };
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		int sum = 0;
		System.out.println("your order please");
		while(true) {
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
			System.out.println(str[i] + "-->" + arr[i]);
		}
		System.out.println("Total amount payable: " + sum);
		System.out.println("you want more press : yes");
		String again=sc.next();
		if(again.equalsIgnoreCase("yes"))
		{
			System.out.println("mention how many items you need: ");
			int n1 = sc.nextInt();
			int[] arr11 = new int[n1];
			String[] str1 = new String[n1];
			System.out.println("Enter the item numbers : ");
			for (int i = 0; i < n1; i++) {
				int item2 = sc.nextInt();
				sum = sum + ar[item2];
				str1[i] = st[item2];
				arr11[i] = ar[item2];

			}
			for (int i = 0; i < str1.length; i++) {
				System.out.println(str1[i] + "-->" + arr11[i]);
		}System.out.println("Total amount payable: " + sum);
		System.out.println("Thank you. Your Order placed");
		
	}
		System.out.println("Thank you. Your Order placed");
	}
}
}
	


