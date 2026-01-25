public class AllDataOperations {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a << 1);
        System.out.println(a >> 1);

        int c = 5;
        c += 2;
        c -= 1;
        c *= 3;
        c /= 2;
        c %= 2;
        System.out.println(c);

        int d = 5;
        System.out.println(++d);
        System.out.println(d++);
        System.out.println(--d);
        System.out.println(d--);

        int max = (a > b) ? a : b;
        System.out.println(max);

        String s1 = "Hello";
        String s2 = "Java";

        System.out.println(s1 + " " + s2);
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.toUpperCase());
    }
}
