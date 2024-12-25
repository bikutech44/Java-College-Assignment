// Program to Find sum of Array Element

public class ArrayExample1 {
    public static void main(String[] args) {
        // Declare and initialize array number
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        // calculate sum of the array elements.
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        System.out.println("Sum of the array number is: "+ sum);
    }
}
