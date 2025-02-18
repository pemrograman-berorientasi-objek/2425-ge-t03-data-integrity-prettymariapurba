package academic.driver;

import java.util.ArrayList;
import java.util.List;
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

        // Menggunakan ArrayList agar lebih fleksibel dalam menyimpan data
        List<Student> students = new ArrayList<>();
        List<Enrollment> enrollments = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        try (Scanner in = new Scanner(System.in)) {
            boolean isExit = true;

            while (isExit && in.hasNextLine()) {
                String command = in.nextLine().trim();
                if (command.equals("---")) {
                    isExit = false;
                } else {
                    String[] tok = command.split("#");
                    
                    // Pastikan input memiliki format yang benar
                    if (tok.length < 2) continue;
                    
                    switch (tok[0]) {
                        case "course-add":
                            if (tok.length == 5) {
                                boolean isCourseExists = false;
                                for (Course c : courses) {
                                    if (c.getIdCourse().equals(tok[1])) {
                                        isCourseExists = true;
                                        break;
                                    }
                                }
                                if (!isCourseExists) {
                                    Course newCourse = new Course(tok[1], tok[2], Integer.parseInt(tok[3]), tok[4]);
                                    courses.add(newCourse);
                                }
                            }
                            break;

                        case "student-add":
                            if (tok.length == 5) {
                                boolean isStudentExists = false;
                                for (Student s : students) {
                                    if (s.getId().equals(tok[1])) {
                                        isStudentExists = true;
                                        break;
                                    }
                                }
                                if (!isStudentExists) {
                                    Student newStudent = new Student(tok[1], tok[2], tok[3], tok[4]);
                                    students.add(newStudent);
                                }
                            }
                            break;

                        case "enrollment-add":
                            if (tok.length == 5) {
                                boolean isEnrollmentExists = false;
                                for (Enrollment e : enrollments) {
                                    if (e.getCodeCourse().equals(tok[2]) && e.getId().equals(tok[1])) {
                                        isEnrollmentExists = true;
                                        break;
                                    }
                                }
                                if (!isEnrollmentExists) {
                                    Enrollment newEnrollment = new Enrollment(tok[1], tok[2], tok[3], tok[4]);
                                    enrollments.add(newEnrollment);
                                }
                            }
                            break;

                        default:
                            System.out.println("Unknown command: " + tok[0]);
                            break;
                    }
                }
            }
        }

        // Output course secara terbalik
        for (int i = courses.size() - 1; i >= 0; i--) {
            courses.get(i).showCourse();
        }

        // Output student
        for (Student s : students) {
            s.showStudent();
        }

        // Output enrollment
        for (Enrollment e : enrollments) {
            e.showEnrollment();
        }
    }
}
