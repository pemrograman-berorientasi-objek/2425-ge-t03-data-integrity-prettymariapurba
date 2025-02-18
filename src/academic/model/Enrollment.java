package academic.model;

/**
 * 12S23042 Pretty Purba
 * 12S23049 Clarissa Manurung
 */
public class Enrollment {

    private String studentId; // Menggunakan 'studentId' untuk konsistensi
    private String courseId; // Menggunakan 'courseId' untuk konsistensi
    private String academicYear; // Menggunakan 'academicYear' untuk konsistensi
    private String status; // Status pendaftaran
    private String additional; // Tambahan (jika ada)

    // Constructor
    public Enrollment(String studentId, String courseId, String academicYear, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.academicYear = academicYear;
        this.status = status;
        this.additional = "None"; // Default value for additional
    }

    // Accessor (getter methods)
    public String getStudentId() {
        return studentId; // Mengembalikan ID mahasiswa
    }

    public String getCourseId() {
        return courseId; // Mengembalikan ID kursus
    }

    public String getAcademicYear() {
        return academicYear; // Mengembalikan tahun ajaran
    }

    public String getStatus() {
        return status; // Mengembalikan status
    }

    public String getAdditional() {
        return additional; // Mengembalikan tambahan
    }

    // Mutator (setter methods)
    public void setStudentId(String studentId) {
        this.studentId = studentId; // Mengatur ID mahasiswa
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId; // Mengatur ID kursus
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear; // Mengatur tahun ajaran
    }

    public void setStatus(String status) {
        this.status = status; // Mengatur status
    }

    public void setAdditional(String additional) {
        this.additional = additional; // Mengatur tambahan
    }

    // Method to display enrollment information
    public void showEnrollment() {
        System.out.println(studentId + "|" + courseId + "|" + academicYear + "|" + status + "|" + additional);
    }
}