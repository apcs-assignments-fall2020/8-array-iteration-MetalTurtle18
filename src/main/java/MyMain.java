public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) output[output.length - i - 1] = arr[i];
        return output;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] >= arr[i + 1])
                max = arr[i];
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] >= arr[i + 1] && arr[i] != max)
                secondMax = arr[i];
        return (max);
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        return false;
    }


    public static void main(String[] args) {
        int[] a = {-1, -2, -3, -4, -8, -2, -127};
        System.out.println(secondLargest(a));
    }
}
