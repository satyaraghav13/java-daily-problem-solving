
public class Solution30{

	public static void main(String[] args) {
		

		 

		        for (int i = 5; i >= 1; i--) {

		            // print 0 instead of spaces
		            for (int s = 1; s <= i-1; s++) {
		                System.out.print("  ");
		            }

		            // print numbers
		            for (int n = i; n <= 5; n++) {
		                System.out.print("*" + " ");
		            }
		            System.out.println();
		        }
		        for (int i = 2; i <= 5; i++) {

		            // print 0 instead of spaces
		            for (int s = 1; s <=  i-1; s++) {
		                System.out.print("  ");
		            }

		            // print numbers
		            for (int n = i; n <=5; n++) {
		                System.out.print("*" + " ");
		            }
		            System.out.println();
		        }
		    }
		}
