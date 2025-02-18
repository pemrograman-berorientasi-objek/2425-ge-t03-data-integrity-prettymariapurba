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

        Student[] students = new Student[200];
        Enrollment[] enrollments = new Enrollment[200];
        Course[] courses = new Course[200];

        int stdCount = 0;
        int crsCount = 0;
        int enrollCount = 0;

        while (isExit && in.hasNextLine()) {
            String command = in.nextLine();
            if (command.equals("---")) {
                isExit = false;
            } else {
                String[] tokens = command.split("#");
                if (tokens[0].equals("course-add")) {
                    boolean isCourseExists = false;
                    for (int i = 0; i < crsCount; i++) {
                        if (tokens[1].equals(courses[i].getIdCourse())) {
                            isCourseExists = true;
                            break;
                        }
                    }
                    if (!isCourseExists) {
                        courses[crsCount] = new Course(tokens[1], tokens[2], Integer.parseInt(tokens[3]), tokens[4]);
                        crsCount++;
                    }

                } else if (tokens[0].equals("student-add")) {
                    boolean isStudentExists = false;
                    for (int i = 0; i < stdCount; i++) {
                        if (tokens[1].equals(students[i].getId())) {
                            isStudentExists = true;
                            break;
                        }
                    }
                    if (!isStudentExists) {
                        students[stdCount] = new Student(tokens[1], tokens[2], tokens[3], tokens[4]);
                        stdCount++;
                    }

                } else if (tokens[0].equals("enrollment-add")) {
                    boolean isCourseValid = false;
                    for (int i = 0; i < crsCount; i++) {
                        if (tokens[2].equals(courses[i].getIdCourse())) {
                            isCourseValid = true;
                            break;
                        }
                    }
                    boolean isStudentValid = false;
                    for (int i = 0; i < stdCount; i++) {
                        if (tokens[1].equals(students[i].getId())) {
                            isStudentValid = true;
                            break;
                        }
                    }
                    if (!isCourseValid) {
                        System.out.println("invalid course|" + tokens[2]);
                    } else if (!isStudentValid) {
                        System.out.println("invalid student|" + tokens[1]);
                    } else {
                        enrollments[enrollCount] = new Enrollment(tokens[1], tokens[2], tokens[3], tokens[4]);
                        enrollCount++;
                    }
                }
            }
        }

        // Print courses
        for (int i = crsCount - 1; i >= 0; i--) {
            courses[i].showCourse();
        }
        // Print students
        for (int i = 0; i < stdCount; i++) {
            students[i].showStudent();
        }
        // Print enrollments
        for (int i = 0; i < enrollCount; i++) {
            enrollments[i].showEnrollment();
        }

        in.close();
    }
}