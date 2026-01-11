
public class Solution26 {

	public static void main(String[] args) {
		

		 

		        for (int i = 5; i >= 1; i--) {

		            // print 0 instead of spaces
		            for (int s = 1; s <= i-1; s++) {
		                System.out.print("  ");
		            }

		            // print numbers
		            for (int n = 5; n >= i; n--) {
		                System.out.print("*" + " ");
		            }
		            System.out.println();
		        }
		    }
		}