import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {45, 6, 24, 37, 15};

        System.out.println("Odd numbers are:");

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}