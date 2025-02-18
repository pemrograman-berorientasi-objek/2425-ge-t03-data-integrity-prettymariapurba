package academic.model;

/**
 * 12S23042 Pretty Purba
 * 12S23049 Clarissa Manurung
 */
public class Course {
    private String idCourse; // ID kursus
    private String courseName; // Nama kursus
    private int sks; // SKS (Satuan Kredit Semester)
    private String grade; // Nilai atau grade

    // Constructor
    public Course(String idCourse, String courseName, int sks, String grade) {
        this.idCourse = idCourse;
        this.courseName = courseName;
        this.sks = sks;
        this.grade = grade;
    }

    // Accessor (getter methods)
    public String getIdCourse() {
        return idCourse; // Mengembalikan ID kursus
    }

    public String getCourseName() {
        return courseName; // Mengembalikan nama kursus
    }

    public int getSks() {
        return sks; // Mengembalikan SKS
    }

    public String getGrade() {
        return grade; // Mengembalikan nilai
    }

    // Mutator (setter methods)
    public void setIdCourse(String idCourse) {
        this.idCourse = idCourse; // Mengatur ID kursus
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName; // Mengatur nama kursus
    }

    public void setSks(int sks) {
        this.sks = sks; // Mengatur SKS
    }

    public void setGrade(String grade) {
        this.grade = grade; // Mengatur nilai
    }

    // Method to display course information
    public void showCourse() {
        System.out.println(idCourse + "|" + courseName + "|" + sks + "|" + grade);
    }
}