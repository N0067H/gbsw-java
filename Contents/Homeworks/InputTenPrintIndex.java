import java.util.Arrays;
import java.util.Scanner;

public class InputTenPrintIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Enter index 0~9:");
        int index = scanner.nextInt();
        
        int target = numbers[index];
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);
        
        int rank = 1;
        for (int i = 9; i >= 0; i--) {
            if (sortedNumbers[i] == target) {
                break;
            }            rank++;
        }
    
        System.out.println("Number: " + numbers[index]);
        System.out.println("Rank: " + rank);
    }
}
