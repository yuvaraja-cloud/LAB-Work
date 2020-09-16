/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*; 

 public class Main
{ 
	static String removeDuplicate(char str[], int n) 
	{ 
		 
		int index = 0; 

		 
		for (int i = 0; i < n; i++) 
		{ 

			
			int j; 
			for (j = 0; j < i; j++) 
			{ 
				if (str[i] == str[j]) 
				{ 
					break; 
				} 
			} 

			
			
			if (j == i) 
			{ 
				str[index++] = str[i]; 
			} 
		} 
		return String.valueOf(Arrays.copyOf(str, index)); 
	} 

	
	public static void main(String[] args) 
	{ 
		char str[] = "tatatata".toCharArray(); 
		int n = str.length; 
		System.out.println(removeDuplicate(str, n)); 
	} 
} 

