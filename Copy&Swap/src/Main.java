public class Main {
    static class Person {
        String name;
    }

    public static int swap(int b, int c) {
        System.out.println(b + " " + c);
        return b;
    }

    public static void swap2(Person b, Person c) {
        System.out.println("swap : " + b.hashCode() + " " + c.hashCode());
        Person p = b;
        b = c;
        c = p;
        System.out.println("swap : " + b.hashCode() + " " + c.hashCode());
    }

    public static void swap3(String b, String c) {
        String p = new String(b.getBytes());
        b = new String(c.getBytes());
        c = new String(p.getBytes());
    }

    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println(a + " " + b);
        b = swap(a, a = b);
        System.out.println(a + " " + b);


        Person aa = new Person();
        aa.name = "최";
        Person bb = new Person();
        bb.name = "김";
        System.out.println(aa.hashCode() + " " + bb.hashCode());
        swap2(aa, bb);
        System.out.println(aa.name + " " + bb.name);
        System.out.println(aa.hashCode() + " " + bb.hashCode());

        String aaa = new String("abc");
        String bbb = new String("def");
        swap3(aaa, bbb);
        System.out.println(aaa + " " + bbb);
    }
}
