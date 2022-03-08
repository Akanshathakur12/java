package com.training.cg;

import java.util.*;

public class luckyno {
	
	static Scanner sc = new Scanner (System.in);
	static int num = sc.nextInt();
	public static void main(String argd[]) {
		
		
				int lucky=5;
				
				for(int i=1;i<10;i++) {
				   	if(num==lucky) {
				   	      System.out.println("Congats!!you guessed it right in "+i+" attempts");
			              break;
				   	}
		           else {
			        System.out.println("Not really!!try again");
			        System.out.println("Enter the num again");
			        Scanner sc1 = new Scanner (System.in);
		         	
			        int num1 = sc1.nextInt();
			         num=num1;
		}
	}

}
}