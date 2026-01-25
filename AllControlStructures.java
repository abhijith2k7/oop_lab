import java.util.Scanner;

public class AllControlStructures {
    static void check(int x) {
        if (x < 0) {
            System.out.println("Negative value, exiting method.");
            return;
        }
        System.out.println("Value is positive.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter a grade (A/B/C): ");
        char grade = sc.next().charAt(0);

        System.out.println("Sequence step executed.");

        if (num > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is zero or negative.");
        }

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Invalid grade");
        }

        System.out.println("\nFor loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.print(i + " ");
        }

        System.out.println("\n\nWhile loop:");
        int i = 1;
        while (i <= 5) {
            if (i == 4) break;
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n\nDo-While loop:");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 3);

        System.out.println("\n");
        check(num);

        sc.close();
    }
}
