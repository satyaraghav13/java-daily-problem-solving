
public class ABCD {

	public static void main(String[] args) {
		
		int A [] = {1,2,3,4,4,5,6,7,8,9,1,4,8,6,};
		
int max = A[0];
int min = A[0];

for(int i = 1; i < A.length; i++) {
    if(A[i] > max) {
        max = A[i];
    }
    if(A[i] < min) {
        min = A[i];
    }
}

System.out.println("Max: " + max);
System.out.println("Min: " + min);
}}