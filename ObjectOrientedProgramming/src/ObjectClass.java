public class ObjectClass {
    public static void main(String[] args) {
        Student2 max = new Student2("Max", 25);
        System.out.println(max);

        PrimarySchoolStudent john = new PrimarySchoolStudent("John", 10, "Doe");
        System.out.println(john);
    }
}

class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student2 {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    public String toString() {
        return super.toString() + " and his parent is " + parentName;
    }
}