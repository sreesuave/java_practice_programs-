package mock_codings;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayRotation {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
 System.out.print("Enter elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();
System.out.println(" before rotating: " + Arrays.toString(arr));
        rotateRightByK(arr, k); System.out.println(" after rotating by " + k + ": " + Arrays.toString(arr));
        sc.close(); }

    
    static void rotateRightByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
