package academic.driver;

import java.util.Scanner;

import academic.model.Enrollment;
import academic.model.Student;
import academic.model.Course;

/**
 * 12S23042 Pretty Purba
 * 12S23049 Clarissa Manurung
 */

public class Driver1 {

    public static void main(String[] _args) {

        Scanner in = new Scanner(System.in);
        boolean isExit = true;

        Student[] student = new Student[200];
        Enrollment[] enrollment = new Enrollment[200];
        Course[] course = new Course[200];

        int std = 0;
        int crs = 0;
        int enroll = 0;

        while (isExit && in.hasNextLine()) {
            String command = in.nextLine();
            if (command.equals("---")) {
                isExit = false;
            } else {
                String[] tok = command.split("#");
                if (tok[0].equals("course-add")) {
                    boolean isCourse = false;
                    for (int i = 0; i < crs; i++) {
                        if (tok[1].equals(course[i].getIdCourse())) {
                            isCourse = true;
                            break;
                        }
                    }
                    if (!isCourse) {
                        course[crs] = new Course(tok[1], tok[2], Integer.parseInt(tok[3]), tok[4]);
                        crs++;
                    }

                } else if (tok[0].equals("student-add")) {
                    boolean isStudent = false;
                    for (int i = 0; i < std; i++) {
                        if (tok[1].equals(student[i].getId())) {
                            isStudent = true;
                            break;
                        }
                    }
                    if (!isStudent) {
                        student[std] = new Student(tok[1], tok[2], tok[3], tok[4]);
                        std++;

                    }
                } else if (tok[0].equals("enrollment-add")) {
                    boolean isEnrollment = false;
                    for (int i = 0; i < enroll; i++) {
                        if (tok[2].equals(enrollment[i].getCodeCourse())) {
                            isEnrollment = true;
                            break;
                        }
                    }
                    if (!isEnrollment) {
                        enrollment[enroll] = new Enrollment(tok[1], tok[2], tok[3], tok[4]);
                        enroll++;
                    }
                }

            }
        }
        for (int i = crs - 1; i >= 0; i--) {
            course[i].showCourse();
        }
        for (int i = 0; i < std; i++) {
            student[i].showStudent();

        }
        for (int i = 0; i < enroll; i++) {
            enrollment[i].showEnrollment();
        }

        in.close();

    }
}
