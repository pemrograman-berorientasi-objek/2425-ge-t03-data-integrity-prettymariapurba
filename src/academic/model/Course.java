package academic.model;

/**
    *  12S23042 Pretty Purba
    *  12S23049 Clarissa Manurung
 */
public class Course {
    private String idcourse;
    private String coursename;
    private int sks;
    private String grade;

    public Course(String idcourse,String coursename,int sks,String grade){
        this.idcourse = idcourse;
        this.coursename = coursename;
        this.sks = sks;
        this.grade = grade;
    }

    //accessor (function)
    public String getidcourse(){
        return idcourse;
    }
    public String getcoursename(){
        return coursename;
    }
    public int getsks(){
        return sks;
    }
    public String getgrade(){
        return grade;
    }

    //mutator (function)
    public void setidcourse(String idcourse){
        this.idcourse = idcourse;
    }
    public void setcoursename(String coursename){
        this.coursename = coursename;
    }
    public void setsks(int sks){
        this.sks = sks;
    }
    public void setgrade(String grade){
        this.grade = grade;
    }


}