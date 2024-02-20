// CST-283
// Aaron Pelto
// Winter 2024

// Complete the following methods in the SortSearchRecurse class.  The methods are:
//      binarySearch - a recursive method that searches an array for a value.
//      isSorted - a recursive method that verifies that an array is sorted in ascending order.
// The methods should be completed recursively.

public class SortSearchRecurse {
    public static void main(String[] args) {
        // Test arrays
        int[] test1 = {5, 12, 27, 33, 39, 50, 61, 75, 88, 96};  // Sorted ASC
        int[] test2 = {5, 12, 27, 33, 50, 39, 61, 75, 88, 96};  // ASC - not sorted
        int[] test3 = {92, 85, 77, 64, 52, 49, 33, 20, 14, 2};  // Sorted DESC
        int[] test4 = {92, 85, 77, 64, 52, 33, 49, 20, 14, 2};  // DESC - not sorted

        // Search ascending array for a value
        System.out.println(binarySearch(test1, 0, test1.length, 39));

        // Verify an array in ascending order
        System.out.println(isSorted(0, test1));

        // Verify an array in ascending order
        System.out.println(isSorted(0, test2));

        // Search descending array for a value
        System.out.println(binarySearchDesc(test3, 0, test1.length, 14));

        // Verify array in descending order
        System.out.println(isSortedDesc(0, test3));

        // Verify array in descending order
        System.out.println(isSortedDesc(0, test4));
    }

    public static int binarySearch(int[] array, int first, int last, int value) {
        int middle;

        if (first > last)
            return -1;

        middle = (first + last) / 2;

        if (array[middle] == value)
            return middle;

        if (array[middle] < value)
            return binarySearch(array, middle + 1, last, value);
        else
            return binarySearch(array, first, middle - 1, value);
    }

    public static boolean isSorted(int index, int[] array) {
        if (index < array.length - 1) {
            if (array[index] > array[index + 1])
                return false;
            else
                return isSorted(index + 1, array);
        } else
            return true;
    }

    public static int binarySearchDesc(int[] array, int first, int last, int value) {
        int middle;

        if (first > last)
            return -1;

        middle = (first + last) / 2;

        if (array[middle] == value)
            return middle;

        if (array[middle] < value)
            return binarySearchDesc(array, first, middle - 1, value);
        else
            return binarySearchDesc(array, middle + 1, last, value);
    }

    public static boolean isSortedDesc(int index, int[] array) {
        if (index < array.length - 1) {
            if (array[index] < array[index + 1])
                return false;
            else
                return isSortedDesc(index + 1, array);
        } else
            return true;
    }
} 
