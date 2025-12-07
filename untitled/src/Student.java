public class Student {
    public String name;
    public int age;

    public Student() {
        this.name = "sude";
        this.age = 21;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
