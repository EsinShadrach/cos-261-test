public class Student {
    String name;
    String matricNo;
    double score;

    public Student(String name, String matricNo, double score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Matric No: " + matricNo);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Student s = new Student("Shadrach Rafe Esin", "2023/259476", 89.5);
        s.displayInfo();
    }
}
