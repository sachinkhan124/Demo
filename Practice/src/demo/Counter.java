package demo;

public class Counter {
    // Static variable
    public static int count = 0;

    // Instance variable
    private String name;

    public Counter(String name) {
        this.name = name;
        count++;  // Increment the static variable
    }

    public void display() {
        System.out.println("Name: " + name + ", Count: " + count);
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter("Object 1");
        obj1.display();  // Output: Name: Object 1, Count: 1

        Counter obj2 = new Counter("Object 2");
        obj2.display();  // Output: Name: Object 2, Count: 2

        Counter obj3 = new Counter("Object 3");
        obj3.display();  // Output: Name: Object 3, Count: 3
    }
}

