package academic.model;

/**
 * 12S23042 Pretty Purba
 * 12S23049 Clarissa Manurung
 */

public class Student {
    private String id;
    private String name;
    private String year;
    private String studyProgram;

    public Student(String id, String name, String year, String studyProgram) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.studyProgram = studyProgram;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }


    public String getStudyProgram() {
        return studyProgram;
    }


    public void showStudent() {
        System.out.println(getId() + "|" + getName() + "|" + getYear() + "|" + getStudyProgram());
    }
}
