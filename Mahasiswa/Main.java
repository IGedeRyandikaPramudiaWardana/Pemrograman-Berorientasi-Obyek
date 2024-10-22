import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("PROGRAM INPUT MAHASISWA");
        System.out.println("Nama  : I Gede Ryandika Pramudia Wardana");
        System.out.println("NIM   : 2315101012");
        
        Scanner scanner = new Scanner(System.in);

        // Membuat daftar courses
        Courses course1 = new Courses("MK01", "Agama Hindu", 2);
        Courses course2 = new Courses("MK02", "Matematika", 3);
        Courses course3 = new Courses("MK03", "Pemrograman Java", 4);

        // Membuat daftar teachers
        Teacher teacher1 = new Teacher("24318943", "Pak Budi", "1120314", "Budi", 40);
        Teacher teacher2 = new Teacher("123412", "Pak Nengah", "2231412", "Nengah", 45);

        // Mengampu mata kuliah
        teacher1.addCourse(course1); // Pak Budi mengampu Agama Hindu
        teacher2.addCourse(course3); // Pak Nengah mengampu Pemrograman Java

        // List untuk menyimpan mahasiswa
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa yang akan diinput: ");
        int jmlMahasiswa = scanner.nextInt();
        scanner.nextLine();

        // Input data untuk 3 mahasiswa
        //System.out.println("Masukkan data mahasiswa:");
        for (int i = 1; i <= jmlMahasiswa; i++) {
            System.out.println("\nMasukkan data Mahasiswa " + i + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("NIM: ");
            String nim = scanner.nextLine();

            // Membuat student
            Student student = new Student(nim, nama, "ID" + i, nama, 20);

            // Input mata kuliah yang diambil mahasiswa
            System.out.println("Pilih mata kuliah yang diambil (pisahkan dengan koma jika lebih dari satu): ");
            System.out.println("1. MK01: Agama Hindu (2 Credits)");
            System.out.println("2. MK02: Matematika (3 Credits)");
            System.out.println("3. MK03: Pemrograman Java (4 Credits)");
            System.out.print("Pilihan: ");
            String[] pilihan = scanner.nextLine().split(",");

            // Menambahkan mata kuliah ke mahasiswa
            for (String p : pilihan) {
                p = p.trim();
                switch (p) {
                    case "1":
                        student.addCourse(course1); // Agama Hindu
                        break;
                    case "2":
                        student.addCourse(course2); // Matematika
                        break;
                    case "3":
                        student.addCourse(course3); // Pemrograman Java
                        break;
                    default:
                        System.out.println("Pilihan tidak valid: " + p);
                }
            }

            // Menambahkan mahasiswa ke list students
            students.add(student);
        }

        // Menampilkan detail mahasiswa dan mata kuliah yang diambil
        System.out.println("\nDetail Mahasiswa:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("\nDetail Mahasiswa " + (i + 1) + ":");
            student.printStudentDetails();

            System.out.println("Mata Kuliah yang Diambil:");
            for (Courses course : student.getCourses()) {
                System.out.println(course);
                // Mencari siapa teacher pengampu dari mata kuliah ini
                if (teacher1.getTeachingCourses().contains(course)) {
                    System.out.println("Pengampu: " + teacher1.getTeacherName() + ", " + teacher1.getTeacherId());
                } else if (teacher2.getTeachingCourses().contains(course)) {
                    System.out.println("Pengampu: " + teacher2.getTeacherName() + ", " + teacher2.getTeacherId());
                }
            }
        }

        scanner.close();
    }
}
