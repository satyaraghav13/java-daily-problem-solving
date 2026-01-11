//
//public class Solution20 {
//
//	public static void main(String [] args){
//		for(int i =5;i>=1;i--){
//			for(int j=1;j<=i;j++){
//				System.out.print(" "+" ");
//			}
//			for(int k=1;k<=6-i;k++){
//				System.out.print(k+" ");
//			}
//			System.out.println();
//		}	
//	}
//}



public class Solution20 {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {

            // print spaces
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print("  ");
            }

            // print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
