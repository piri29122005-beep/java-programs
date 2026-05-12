import java.util.Scanner;

public class LargestArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 66, 7, 52, 31, 65};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest number is: " + largest);

        sc.close();
    }
}