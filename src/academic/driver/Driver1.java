package academic.driver;

import java.util.Scanner;
import academic.model.Student;
import academic.model.Course;
import academic.model.Enrollment;

/**
 * 12S23042 Pretty Purba
 * 12S23049 Clarissa Manurung
 */
public class Driver1 {

    public static void main(String[] _args) {
        Scanner in = new Scanner(System.in);
        boolean isExit = true;

        // Menggunakan array untuk menyimpan objek
        Student[] students = new Student[200];
        Enrollment[] enrollments = new Enrollment[200];
        Course[] courses = new Course[200];

        // Menghitung jumlah objek
        int studentCount = 0;
        int courseCount = 0;
        int enrollmentCount = 0;

        while (isExit && in.hasNextLine()) {
            String command = in.nextLine();
            if (command.equals("---")) {
                isExit = false;
            } else {
                String[] tokens = command.split("#");
                if (tokens[0].equals("course-add")) {
                    boolean isCourseExists = false;
                    for (int i = 0; i < courseCount; i++) {
                        if (tokens[1].equals(courses[i].getIdCourse())) {
                            isCourseExists = true;
                            break;
                        }
                    }
                    if (!isCourseExists) {
                        // Membuat objek Course baru
                        String courseId = tokens[1];
                        String courseName = tokens[2];
                        int sks = Integer.parseInt(tokens[3]);
                        String grade = tokens[4];
                        courses[courseCount] = new Course(courseId, courseName, sks, grade);
                        courseCount++;
                    }

                } else if (tokens[0].equals("student-add")) {
                    boolean isStudentExists = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (tokens[1].equals(students[i].getId())) {
                            isStudentExists = true;
                            break;
                        }
                    }
                    if (!isStudentExists) {
                        // Mengonversi angkatan dari String ke int
                        int angkatan = Integer.parseInt(tokens[3]);
                        // Membuat objek Student baru
                        students[studentCount] = new Student(tokens[1], tokens[2], angkatan, tokens[4]);
                        studentCount++;
                    }

                } else if (tokens[0].equals("enrollment-add")) {
                    boolean isCourseValid = false;
                    for (int i = 0; i < courseCount; i++) {
                        if (tokens[2].equals(courses[i].getIdCourse())) {
                            isCourseValid = true;
                            break;
                        }
                    }
                    boolean isStudentValid = false;
                    for (int i = 0; i < studentCount; i++) {
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
                        // Membuat objek Enrollment baru
                        enrollments[enrollmentCount] = new Enrollment(tokens[1], tokens[2], tokens[3], tokens[4]);
                        enrollmentCount++;
                    }
                }
            }
        }

        // Print courses in reverse order
        for (int i = courseCount - 1; i >= 0; i--) {
            courses[i].showCourse();
        }
        // Print students
        for (int i = 0; i < studentCount; i++) {
            students[i].showStudent();
        }
        // Print enrollments
        for (int i = 0; i < enrollmentCount; i++) {
            enrollments[i].showEnrollment();
        }

        in.close();
    }
}