package academic.model;

/**
 * 12S23042 Pretty Purba
 * 12S23049 Clarissa Manurung
 */

public class Enrollment {
    private String id;
    private String codeCourse;
    private String academicYear;
    private String semester;
    private String grade;

    public Enrollment(String id, String codeCourse, String academicYear, String semester){
        this.id = id;
        this.codeCourse = codeCourse;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = "None";    

    }


    public String getId(){
        return this.id;
    }

    public String getCodeCourse(){
        return this.codeCourse;
    }

    public String getAcademicYear(){
        return this.academicYear;
    }

    public String getSemester(){
        return this.semester;
    }

    public String getGrade(){
        return this.grade;
    }

    public void showEnrollment(){
        System.out.println(getId() + "|" + getCodeCourse() + "|" + getAcademicYear() + "|" + getSemester() + "|" + getGrade());
    }



}