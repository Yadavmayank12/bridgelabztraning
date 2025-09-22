package java1;

class Per {
    String name;
    int age;

    Per(String n, int a) {
        name = n;
        age = a;
    }

  
    Per(Per other) {
        name = other.name;
        age = other.age;
    }
}

public class person {
    public static void main(String[] args) {
        Per p1 = new Per("Alice", 25);
        Per p2 = new Per(p1);

        System.out.println("Person1: " + p1.name + ", " + p1.age);
        System.out.println("Person2 (copy): " + p2.name + ", " + p2.age);
    }
}