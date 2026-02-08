import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        // Initialize arrays [cite: 12, 13, 15]
        int[] A = {10, 20, 30, 40, 50}; [cite: 12]
        int[] B = {34, 67, 12, 89, 12}; [cite: 13]
        int[] C = new int[5]; [cite: 15]

        // Calculate A + B and store in C [cite: 16]
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i]; [cite: 16]
        }

        // Output result [cite: 17]
        System.out.println("Array C: " + Arrays.toString(C)); [cite: 17]
    }
}