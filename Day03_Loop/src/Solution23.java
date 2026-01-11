
public class Solution23 {

	public static void main(String[] args) {
		

		 

		        for (int i = 5; i >= 1; i--) {

		            // print 0 instead of spaces
		            for (int s = 1; s <= 5 - i; s++) {
		                System.out.print("  ");
		            }

		            // print numbers
		            for (int n = 5; n >= 6-i; n--) {
		                System.out.print(n + " ");
		            }
		            System.out.println();
		        }
		    }
		}