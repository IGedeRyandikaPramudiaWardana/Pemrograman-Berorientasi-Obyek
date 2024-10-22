import java.util.ArrayList;

public class Teacher extends Person {
    private String nip;
    private String namaPengajar;
    
    private ArrayList<Courses> teachingCourses;

    public Teacher(String nip, String namaPengajar, String id, String name, int age) {
        super(id, name, age);
        this.nip = nip;
        this.namaPengajar = namaPengajar;
        this.teachingCourses = new ArrayList<>();
    }

    public String getTeacherName() {
        return namaPengajar;
    }

    public String getTeacherId() {
        return nip;
    }

    public ArrayList<Courses> getTeachingCourses() {
        return teachingCourses;
    }

    public void addCourse(Courses course) {
        teachingCourses.add(course);
    }

    public void removeCourse(Courses course) {
        teachingCourses.remove(course);
    }

    @Override
    public String toString() {
        return nip + ": " + namaPengajar;
    }
}
