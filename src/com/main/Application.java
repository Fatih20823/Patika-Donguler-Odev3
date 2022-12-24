package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sinir sayisini giriniz: ");
		n = scan.nextInt();
		
		for(int i = 4;i < n;i*=4) {
			if(i==4) {
				System.out.print("4'un Kuvveti: ");
			}
			System.out.print(i+",");
		}
		
		for(int i = 5;i < n ; i*=5) {
			if(i==5) {
				System.out.print("\n5'in Kuvveti: ");
			}
			System.out.print(i+",");
		}

	}

}
