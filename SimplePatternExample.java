package com.StarPatterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


public class SimplePatternExample {

	public static void main(String[] args)throws IOException {
		
		// printing The following Star Pattern 
        
        /*     *  *  *  *  *
               *  *  *  *  *
               *  *  *  *  * 
               *  *  *  *  * 
               *  *  *  *  * 
                                 */

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter any Number");
          int n = Integer.parseInt(br.readLine());

          for(int i = 1 ; i <= n ; i++) // Loop for Row
             {
                for(int j = 1 ; j <= n ; j++)// Loop for column
                  {
	                  System.out.print(" * "); // print stars
                  }
                       System.out.println(); // for gives new line  
            }
      }

}
