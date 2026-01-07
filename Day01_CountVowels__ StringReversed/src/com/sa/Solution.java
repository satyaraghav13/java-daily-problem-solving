package com.sa;

public class Solution {
	
	public static void main(String []args) {
		
		String st = "Consequence";
		int count = 0;
		for(char c  :  st.toLowerCase().toCharArray()) {
			 if ("aeiou".indexOf(c) != -1) {
				 count++;
			 }			
		}
		 System.out.println(count);
	
	}

}
