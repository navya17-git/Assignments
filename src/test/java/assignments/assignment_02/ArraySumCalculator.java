package assignments.assignment_02;

public class ArraySumCalculator {

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5};
        int result = calculateSum(exampleArray);
        System.out.println("The sum of the array elements is: " + result);
    }
}
