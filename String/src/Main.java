public class Main {

    public static void main(String[] args) {

        System.out.println("---------------------");
        String a = "choi";
        String b = "choi";
        String c = new String("choi");
        System.out.println("a.hashCode(), b.hashCode : " + a.hashCode() + " " + b.hashCode() + " " + c.hashCode());
        System.out.println("a==b : " + (a == b));
        System.out.println("a==c : " + (a == c));
        System.out.println("a.equals(b) : " + a.equals(b));
        System.out.println("a.equals(c) : " + a.equals(c));
        c = c.intern();
        System.out.println("a==b : " + (a == b));
        System.out.println("a==c : " + (a == c));
    }
}
