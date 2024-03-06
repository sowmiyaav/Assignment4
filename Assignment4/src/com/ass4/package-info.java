package com.ass4;

import java.util.Scanner;





package com.ass4;

import java.util.Scanner;

public class EvenOddNumber {
	
	 public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter the value of size");
	  int a = sc.nextInt();

	  int arr[] = new int[a];
	  
	  

	  for (int i = 0; i< a; i++) {
	   arr[i] = sc.nextInt();
	  }
	  for (int i = 0;i < a; i++) {
	   if (arr[i] % 2 == 0)
	    System.out.println("even");
	   else
	    System.out.println("odd");
	  }
	 }
	}

int[] intArray = new int[] {1, 2, 3, 4, 5};