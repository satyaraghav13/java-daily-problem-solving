public class ABCDEFG {
    public static void main(String[] args) {

        // Original array
        int[] arr = {10, 20, 30};

        // Create new array with +1 size
        int[] newArr = new int[arr.length + 1];

        // Copy old elements into new array
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // Add new element at last
        newArr[arr.length] = 40;

        // Print new array
        System.out.print("New Array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}