//check arrya is sorted or not
public class CheckSortedArray {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Array is not sorted
            }
        }
        return true; // Array is sorted
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array

        if (isSorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}

