
public class Solution27{

	public static void main(String[] args) {
		

		 

		        for (int i = 1; i <= 5; i++) {

		            // print 0 instead of spaces
		            for (int s = 1; s <= 5 - i; s++) {
		                System.out.print("  ");
		            }

		            // print numbers
		            for (int n = i; n >= 1; n--) {
		                System.out.print(n + " ");
		            }
		            System.out.println();
		        }
		        for (int i = 4; i >= 1; i--) {

		            // print 0 instead of spaces
		            for (int s = 1; s <= 5 - i; s++) {
		                System.out.print("  ");
		            }

		            // print numbers
		            for (int n = i; n >= 1; n--) {
		                System.out.print(n + " ");
		            }
		            System.out.println();
		        }
		    }
		}
