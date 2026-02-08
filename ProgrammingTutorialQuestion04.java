public class PatternDrawing {
    public static void main(String[] args) {
        // Using while loop for the rectangle/square pattern [cite: 29]
        System.out.println("Using while loop");
        int row = 0;
        while (row < 5) {
            int col = 0;
            while (col < 5) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }

        System.out.println("\nUsing for loop"); [cite: 36]
        // Using for loop for the pyramid pattern
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}