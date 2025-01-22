// Short array element in Ascending Order

import java.util.Arrays; // use to short numbers in ascending order

public class ArrayExample4AscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 3, 1, 8, 6};

        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        System.out.println("\nArray in Ascending Order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
