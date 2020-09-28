public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double factor = (double) arr[1] / arr[0];

        for (int i = 2; i < arr.length-1; i++) {
            if (arr[i] * factor != arr[i+1]) {
                return false;
            }
        }
        
        return true;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
