package academic.model;

/**
 * 12S23042 Pretty Purba
 * 12S23049 Clarissa Manurung
 */

public class Course {

    private String idCourse;
    private String major;
    private int semester;
    private String passingGrade;

    public Course (String idCourse, String major, int semester, String passingGrade) {
        this.idCourse = idCourse;
        this.major = major;
        this.semester = semester;
        this.passingGrade = passingGrade;
    }

    public String getIdCourse() {
        return this.idCourse;
    }

    public String getMajor() {
        return this.major;
    }

    public int getSemester() {
        return this.semester;
    }

    public String getPassingGrade() {
        return this.passingGrade;
    }
    public void showCourse() {
        System.out.println(getIdCourse() + "|" + getMajor() + "|" + getSemester() + "|" + getPassingGrade());
}
}