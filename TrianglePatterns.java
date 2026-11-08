public class TrianglePatterns {
    public static void main(String[] args) {
        int rows = 4;

        // Inverted Right Triangle Pattern
        /*
         * ****
         * ***
         * **
         * *
         */
        System.out.println("--- Inverted Triangle ---");
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Standard Right Triangle Pattern
        /*
         * *
         * **
         * ***
         * ****
         */
        System.out.println("\n--- Upright Triangle ---");
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}