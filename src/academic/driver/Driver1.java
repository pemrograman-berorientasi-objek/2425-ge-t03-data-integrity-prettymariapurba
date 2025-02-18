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
            Set<String> courses = new TreeSet<>(new CourseComparator());
            Set<String> students = new TreeSet<>(new StudentComparator());
            List<String> enrolList = new ArrayList<>();
            
            while (input.hasNextLine()) {
                str = input.nextLine();
                String[] tokens = str.split("#");
                
                if (tokens[0].equals("course-add")) {
                    courses.add(String.join("|", Arrays.copyOfRange(tokens, 1, tokens.length)));
                } else if (tokens[0].equals("student-add")) {
                    students.add(String.join("|", Arrays.copyOfRange(tokens, 1, tokens.length)));
                } else if (tokens[0].equals("enrollment-add")) {
                    enrolList.add(String.join("|", Arrays.copyOfRange(tokens, 1, tokens.length)) + "|None");
                }
                
                if (str.equals("---")) {
                    // Print courses using a regular for loop
                    String[] courseArray = courses.toArray(new String[0]);
                    for (int i = 0; i < courseArray.length; i++) {
                        System.out.println(courseArray[i]);
                    }
                    
                    // Print students using a regular for loop
                    String[] studentArray = students.toArray(new String[0]);
                    for (int i = 0; i < studentArray.length; i++) {
                        System.out.println(studentArray[i]);
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

    // Comparator untuk mengurutkan kursus berdasarkan kode kursus
    static class CourseComparator implements Comparator<String> {
        @Override
        public int compare(String course1, String course2) {
            return course1.split("\\|")[0].compareTo(course2.split("\\|")[0]);
        }
    }

    // Comparator untuk mengurutkan siswa berdasarkan ID siswa
    static class StudentComparator implements Comparator<String> {
        @Override
        public int compare(String student1, String student2) {
            return student1.split("\\|")[0].compareTo(student2.split("\\|")[0]);
        }
    }
}