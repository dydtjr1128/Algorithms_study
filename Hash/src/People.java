public class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object a) {
        People obj = (People) a;
        return (obj.name == this.name && obj.age == this.age);
    }

    @Override
    public int hashCode() {
        return (name + age).hashCode();
    }
}