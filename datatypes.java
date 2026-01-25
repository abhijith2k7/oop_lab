public class datatypes {
    public static void main(String[] args) {

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 10000000000L;

        float f = 10.5f;
        double d = 99.99;

        char c = 'A';
        boolean bool = true;

        String str = "Hello Java";
        int[] arr = {1, 2, 3, 4, 5};

        Person p = new Person("Alice", 25);

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(str);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(p.name + " " + p.age);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
