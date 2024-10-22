public class Courses {
    private String kodeMK;
    private String namaMK;
    private int sks;

    // Constructor
    public Courses(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    // Getter and Setter methods
    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    // Method to print course details
    public void printCourseDetails() {
        System.out.println("Course Code: " + kodeMK);
        System.out.println("Course Name: " + namaMK);
        System.out.println("Credit     : " + sks);
    }

    @Override
    public String toString() {
        return kodeMK + ": " + namaMK + " (" + sks + " credits)";
    }
}
