package day25_methods;

public class Email {

    /*
    Create a  method that accepts two parameters
    and generate and email from that.
        Full Name, domain (gmail.com, hotmail.com, ....)
        Input:
            Tom Jerry, gmail

        Output:
            tjerry@gmail.com

 */

        public static void main(String[] args) {
            String fullName = "Winnie Pooh";
            String domain = "gMail";

            generateEmail(fullName, domain);
            generateEmail("Majd Alloush", "HOTMAIL");
            generateEmail("Jaad Quraan", "aol");
        }

        public static void generateEmail (String fullName, String domain) {
            //                          W                  _Pooh
            String email = ("" + fullName.charAt(0) + fullName.substring(fullName.indexOf(" ") + 1) + "@" +  domain + ".com").toLowerCase() ;
            System.out.println(email);
        }

    }

