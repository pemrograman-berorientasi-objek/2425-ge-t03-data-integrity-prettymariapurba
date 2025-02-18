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
        List<String> courses= new ArrayList<>();
        List<String> students= new ArrayList<>();
        List<String> enrolList= new ArrayList<>();
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
                    for (String course : courses) {
                        System.out.println(course);
    
                    }
                    for (String student : students) {
                        System.out.println(student);
    
                    }
                    for (String enrol : enrolList) {
                        System.out.println(enrol);
    
                    }
                    System.exit(0);
                }
    
            }
        }
        

       

    }

}