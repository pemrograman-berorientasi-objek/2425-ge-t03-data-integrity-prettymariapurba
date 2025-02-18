package academic.driver;
import java.util.*;

/**
 * 12S23042 Pretty Purba
 * 12S23049 Clarissa Manurung
 */
public class Driver1 {

    public static void main(String[] _args) {
        try (Scanner input = new Scanner(System.in)) {
            String str;
            List<String> courses = new ArrayList<>();
            List<String> students = new ArrayList<>();
            List<String> enrolList = new ArrayList<>();
            
            while (input.hasNextLine()) {
                str = input.nextLine();
                String[] tokens = str.split("#");
                
                if (tokens[0].equals("course-add")) {
                    String course = String.join("|", Arrays.copyOfRange(tokens, 1, tokens.length));
                    // Menambahkan kursus dengan cara terurut
                    addCourseInOrder(courses, course);
                } else if (tokens[0].equals("student-add")) {
                    students.add(String.join("|", Arrays.copyOfRange(tokens, 1, tokens.length)));
                } else if (tokens[0].equals("enrollment-add")) {
                    enrolList.add(String.join("|", Arrays.copyOfRange(tokens, 1, tokens.length)) + "|None");
                }
                
                if (str.equals("---")) {
                    // Print courses using a regular for loop
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println(courses.get(i));
                    }
                    // Print students using a regular for loop
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i));
                    }
                    // Print enrollment list using a regular for loop
                    for (int i = 0; i < enrolList.size(); i++) {
                        System.out.println(enrolList.get(i));
                    }
                    System.exit(0);
                }
            }
        }
    }

    // Method untuk menambahkan kursus dalam urutan
    private static void addCourseInOrder(List<String> courses, String newCourse) {
        String courseCode = newCourse.split("\\|")[0]; // Ambil kode kursus
        int index = 0;
        // Temukan posisi yang tepat untuk menambahkan kursus
        while (index < courses.size() && courses.get(index).split("\\|")[0].compareTo(courseCode) < 0) {
            index++;
        }
        courses.add(index, newCourse); // Tambahkan kursus pada posisi yang ditemukan
    }
}