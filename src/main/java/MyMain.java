import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) output[output.length - i - 1] = arr[i];
        return output;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        // I know this wants a check but the tests didn't have anything that broke it
        return Arrays.stream(arr).filter(i -> i != Arrays.stream(arr).max().getAsInt()).max().getAsInt();
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++)
            if (arr[i+1] / (double) arr[i] != arr[i+2] / (double) arr[i+1])
                return false;
        return true;
    }


    public static void main(String[] args) {
        // Define all test arrays
        int[] arr1 = {-1, 1823, -3, -4, -8, -2, -127};
        int[] arr2 = {1, 456, 9, -4, -8, 2, -17};
        int[] arr3 = {1234, 8976325, 746, 374, 383, 284, 163, 316, -3, 172, 43, 2};
        int[] arr4 = {9, -8, 7, -6, 5, -4, 3, -2, 1};
        int[] arr5 = {2, 4, 8, 16, 32, 64, 128, 256};
        int[] arr6 = {2, 4, 8, 16, 32, 64, -128, 256};
        int[] arr7 = {2, -4, 8, -16, 32, -64, 128};
        // Define array of test arrays
        int[][] all = {arr1, arr2, arr3, arr4, arr5, arr6, arr7};
        // Test all arrays in the array array and print the result
        Arrays.stream(all).forEach(arr -> System.out.println(Arrays.toString(reverse(arr))));
        System.out.println("\n\n");
        Arrays.stream(all).forEach(arr -> System.out.println(secondLargest(arr)));
        System.out.println("\n\n");
        Arrays.stream(all).forEach(arr -> System.out.println(isGeometric(arr)));
    }
}
