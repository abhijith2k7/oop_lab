import java.util.Scanner;

public class SelectionStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter a grade (A/B/C/D): ");
        char grade = sc.next().charAt(0);

        if (num > 0) {
            System.out.println("Number is positive.");
        }

        if (num % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else if (age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        if (num > 0) {
            if (num < 100) {
                System.out.println("Number is between 1 and 99.");
            }
        }

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Very Good!");
                break;
            case 'C':
                System.out.println("Good.");
                break;
            case 'D':
                System.out.println("Pass.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        String result = (num >= 0) ? "Non-negative number" : "Negative number";
        System.out.println(result);

        sc.close();
    }
}
