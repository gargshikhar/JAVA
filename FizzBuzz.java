//  =============== BEGIN ASSESSMENT HEADER ================
/// @file FizzBuzz.java
/// @author Shikhar Garg [shikhargarg1992@gmail.com]
/// @date January 13, 2014
/// @program description Print Fiz if a number is divisible by 5, 
///                      Print Buzz if a number is divisible by 3 and 
///                      Print FizzBuzz if a number is divisible by 15 
//  ================== END ASSESSMENT HEADER ===============

import java.util.*;

public class FizBuzz {
	public static void main (String args[]){
		int i,j,k;
		for (i=1;i<=100;i++)
		{
			if (i%15==0)
				System.out.println("FizBuzz");             
			else if (i%5==0)
				System.out.println("Fiz");                  
			else if (i%3==0)
				System.out.println("Buzz");
			else 
				System.out.println(i);
		}
	}
}
