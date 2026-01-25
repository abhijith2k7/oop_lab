public class JumpStatements {

    static void checkNumber(int n) {
        if (n < 0) {
            System.out.println("Negative number. Exiting method...");
            return;
        }
        System.out.println("Number is positive: " + n);
    }

    public static void main(String[] args) {

        System.out.println("BREAK example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n\nCONTINUE example:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n\nRETURN example:");
        checkNumber(10);
        checkNumber(-3);

        System.out.println("\nLabeled BREAK example:");
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outer;
                }
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }
}
