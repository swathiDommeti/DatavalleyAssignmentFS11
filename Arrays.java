import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target number: ");
        int targetNumber = scanner.nextInt();

        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        int occurrences = countOccurrences(array, targetNumber);
        System.out.println("Number of occurrences of " + targetNumber + ": " + occurrences);

        scanner.close();
    }

    private static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
