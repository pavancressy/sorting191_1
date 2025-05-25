import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] numbers) {
        int i;
        int j;
        int temp;
        int comparisonCounter = 1;
        int swapCounter = 0;

        System.out.println(Arrays.toString(numbers));

        for (i = 1; i < numbers.length; ++i) {
            ++comparisonCounter;
            j = i;
            while (j > 0 && numbers[j] < numbers[j - 1]) {
                ++swapCounter;
                temp = numbers[j];
                numbers[j] = numbers[j - 1];
                numbers[j - 1] = temp;
                --j;
            }
            System.out.println(Arrays.toString(numbers));
        }
        System.out.println("Comparisons: " + comparisonCounter);
        System.out.println("Swaps: " + swapCounter/2);
    }

    public static void main(String[] args) {
        int[] inputArray = {6, 3, 2, 1, 5, 9, 8, 4, 11, 10, 19};
        System.out.println(Arrays.toString(inputArray));
        System.out.println();
        insertionSort(inputArray);
    }
}