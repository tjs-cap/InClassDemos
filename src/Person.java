import java.util.Objects;

public class Person {
    private final String name;
    private int age;
    private float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public float height() {
        return height;
    }

    public int birthday(int age) {
        age++;
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.name, that.name) &&
                this.age == that.age &&
                Float.floatToIntBits(this.height) == Float.floatToIntBits(that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name + ", " +
                "age=" + age + ", " +
                "height=" + height + ']';
    }

    public static void main(String[] args) {
        Person p1 = new Person("Fred",36);
    }


}

