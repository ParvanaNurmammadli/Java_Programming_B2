package day14_string;

public class Contains {

    /*
    .equals(String)
    .equalIgnoreCase(String)
    .length()
    .toUpperCase()
    .toLowerCase()
    .startsWith(String)
    .endsWith(String)
 */

        public static void main(String[] args) {
            String day = "Today it was a Java class.";

            System.out.println(day.contains("it was"));  // true
            System.out.println(day.contains("itwas"));   // false

            String str = "was a SoftSkills";
            System.out.println(day.contains(str));

            System.out.println(day.contains("Today class."));
            System.out.println(day.contains("It was a Java class."));
            System.out.println(day.contains(" "));
            System.out.println(day.contains("w"));
            System.out.println(day.contains("x"));

            System.out.println(day.contains("5"));

            System.out.println(day.contains(""));

            System.out.println(day + " Or not.");// "Today it was a Java class."
            System.out.println(day.contains(" Or not."));

            System.out.println("------------------");
            System.out.println((day + " Or not.").contains(" Or not."));
            System.out.println(day.contains(" Or not.")); //"Today it was a Java class."

            //"Today it was a Java class."
            if (day.contains("java")) {
                System.out.println("There is a coding language name in this sentence");
            }

            //"Today it was a Java class."
            if (day.contains("Java")) {
                System.out.println("There is a coding language name in this sentence");
            }

            System.out.println(day.contains("t w"));


        }

    }


