package com.ass4;

import java.util.Arrays;

import java.util.Scanner;

public class Numbers {
	
	   public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        Integer[] number= new Integer[10];
        
        System.out.println("enter the start number: ");
        
        Integer no1 =scanner.nextInt();
        
        System.out.println("entet the end number ");
        
        Integer no2 = scanner.nextInt();
        
        System.out.println("----------------------------------------------");
		
        System.out.println("All numbers from start to end");
        
        for (int i = 0; i < number.length; i++) {
        	
        	System.out.println(i);
        }
			
		    System.out.println("----------------------------------------------");
		
		Integer[] number1 = new Integer[]{0,1,2,3,4,5,6,7,8,9};		     
      

        System.out.println("even number");
    
        for (int i = 0; i < number1.length; i++) {
		
		     Integer no = number1[i]; 
		
	         if (number1[i]%2==0) {
	        	 
	        	 System.out.println((number1[i]));
	        	 
	         }
	         
          }
        
        System.out.println("----------------------------------------------");
		
        System.out.println("odd number");
        
        for (int i = 0; i < number1.length; i++) {
		
		     Integer no = number1[i]; 
		
	         if (number1[i]%2==1) {
	        	 
	        	 System.out.println((number1[i]));
	        	 
	         }
	         
          }
        
        System.out.println("----------------------------------------------");
        
        int[]originalArray = {0,1,2,3,4,5,6,7,8,9};
        
        int[] evenArray = new int[originalArray.length];
        
        int[] oddArray = new int[originalArray.length];
        
        int evencount = 0;
        
        int oddcount = 0;
        
       for (int num : originalArray) {
        	
        	if (num%2==0) {
				
        		evenArray[evencount++] = num;
			
        	}else {
        		
        		oddArray[oddcount++] = num;
        	}
			
		}
       
       evenArray = Arrays.copyOf(evenArray, evencount);
       
       oddArray = Arrays.copyOf(oddArray, oddcount);
       
      
        System.out.println("even Number: "+Arrays.toString(evenArray));
        
        System.out.println("odd number:"+Arrays.toString(oddArray));    
        
	    }
}


     

		
		 
		
