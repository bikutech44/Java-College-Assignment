// Program to input array size, element and display it

import java.util.Scanner;

public class ArrayExample3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get Size of Array
        System.out.println("Enter the size of array.");
        int size = input.nextInt();

        // Declare array
        int[] numbers = new int[size];

        // Input elements of array
        System.out.println("Enter "+ size +" numbers");
        for(int i = 0; i<size; i++){
            numbers[i] = input.nextInt();
        }

        // Display array
        System.out.println("Elements of array are: ");
        for(int i = 0; i<size; i++){
            System.out.print(numbers[i] +" ");
        }
    }
}
