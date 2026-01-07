package com.sa;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String input = "java";
		        
//		        String rev = "";   //rev =Reversed
//
//		        
//		        for (int i = input.length() - 1; i >= 0; i--) {
//		            rev = rev + input.charAt(i);
//		        }
//
//		        System.out.println(rev);
		
		
		
	        StringBuilder builder = new StringBuilder();     
	        for (int i = input.length() - 1; i >= 0; i--) {
	            builder.append(input.charAt(i));
	        }

	     
	        String reversed = builder.toString();

	        System.out.println(reversed);
		        
		        
		      		       
	}

}
