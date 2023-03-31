import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7, 1, 9, 4, 6};
        int[] result = getTopThree(arr);

        System.out.println(Arrays.toString(result)); // prints "[9, 8, 7, 6]"

    }

    public static int[] getTopThree(int[] arr) {
        int n = arr.length;

// sort the array in descending order
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

// create a new array of size n-3
        int[] result = new int[3];

// copy the first n-3 elements from the sorted array into the new array
        for (int i = 0; i < 3; i++) {
            result[i] = arr[i];
        }

// return the new array
        return result;
    }
}