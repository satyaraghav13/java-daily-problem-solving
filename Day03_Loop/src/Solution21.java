//
//public class Solution21 {
//    public static void main(String[] args) {
//
//
//        for (int i = 1; i <= 5; i++) {
//
//            // print spaces
//            for (int s = 1; s < i; s++) {
//                System.out.print("  ");
//            }
//
//            // print numbers
//            for (int j = i; j <= 5; j++) {
//                System.out.print(j + " ");
//            }
//
//            System.out.println();
//        }
//    }
//}





public class Solution21{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int k=1;k<=i-1;k++){
				System.out.print(" "+" ");
			}
			for(int j=i; j<=5;j++){
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}