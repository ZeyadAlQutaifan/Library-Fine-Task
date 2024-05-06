import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("return date");
            // Input due date
            int d2 = sc.nextInt(), m2 = sc.nextInt(), y2 = sc.nextInt();

            System.out.println("due date");
            // Input return date
            int d1 = sc.nextInt(), m1 = sc.nextInt(), y1 = sc.nextInt();

            // Calculate fine
            int fine = calculateFine(d1, m1, y1, d2, m2, y2);

            // Output fine
            System.out.println(fine);
        } catch (Exception e) {
            System.out.println("input valid values");
            init();
        }

        sc.close();
    }

    public static int calculateFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y2 > y1) {
            return 10000; // Fine for returning after the calendar year
        } else if (y2 < y1 || m2 < m1 || (m2 == m1 && d2 <= d1)) {
            return 0; // No fine
        } else if (m1 == m2) {
            return 15 * (d2 - d1); // Fine for days late
        } else {
            return 500 * (m2 - m1); // Fine for months late
        }
    }
}