// Short array element in Ascending Order
import java.util.Arrays;
public class ArrayExample4AscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 3, 1, 8, 6};

        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        Arrays.sort(numbers);

        System.out.println("\nArray in Ascending Order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
