package com.StarPatterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class RightSidedIncreasingPattern {

	public static void main(String[] args) throws IOException {
		
		// printing The following Star Pattern 
        
              /*           *     
                        *  *
                     *  *  * 
                  *  *  *  * 
               *  *  *  *  * 
                                 */

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter any Number");
          int n = Integer.parseInt(br.readLine());

          for(int i = 1 ; i <= n ; i++) //outer loop for printing rows with spaces 
          {
                for(int j = i ; j <= n ; j++)
                  {
	                  System.out.print("  "); // print Spaces 
                  }
                for(int j = 1; j<=i; j++)
                {   
                	System.out.print("* "); // for Printing Stars
           
                }
        
              System.out.println(); // for new Line 
        }

    }
}

