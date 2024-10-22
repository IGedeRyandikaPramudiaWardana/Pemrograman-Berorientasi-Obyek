import java.util.ArrayList;

public class Student extends Person {
    private String nim;
    private String nama;

    ArrayList<Courses> courses;

    public Student(String nim, String nama, String id, String name, int age) {
        super(id, name, age);
        this.nim = nim;
        this.nama = nama;
        this.courses = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public void addCourse(Courses course) {
        courses.add(course);
    }

    public void removeCourse(Courses course) {
        courses.remove(course);
    }

    public void printStudentDetails() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
    }
}
