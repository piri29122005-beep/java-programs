import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter value: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}