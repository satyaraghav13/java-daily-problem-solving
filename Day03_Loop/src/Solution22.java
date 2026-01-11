
public class Solution22 {

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
		    }
		}
