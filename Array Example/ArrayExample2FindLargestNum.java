// Program to find Array Largest Element

public class ArrayExample2FindLargestNum {
    public static void main(String[] args) {
        // declare and initialize the number
        int[] numbers = {50, 20 , 11, 25, 40, 90, 80, 15};

        // find Largest number
        int largeNum = numbers[0];
        for(int i = 1 ; i < (numbers.length); i++ ){
            if(numbers[i]> largeNum){
                largeNum = numbers[i];
            }
        }
        System.out.println("Largest number is: "+ largeNum);
    }
}
