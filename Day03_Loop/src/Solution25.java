
public class Solution25 {

	public static void main(String[] args) {
		

		 

		        for (int i = 1; i <= 5; i++) {

		            // print 0 instead of spaces
		            for (int s = 1; s <= i-1; s++) {
		                System.out.print("  ");
		            }

		            // print numbers
		            for (int n = 1; n <=6-i; n++) {
		                System.out.print(n + " ");
		            }
		            System.out.println();
		        }
		    }
		}