package day12_switch_statement;



import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter you browser: ");

        String browser = input.nextLine(); // In case, we have multiple words

        System.out.print("Enter your URL: ");  // URL --- >  it is a link in browser
        String url = input.nextLine();


        int n = 4;
        switch (browser){
            case "chrome":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                System.out.println("Loading..... Intersting page");
                break;
            case "Edge":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                System.out.println("Loading.... Bare with us.....");
                break;
            case "Safari":
            case "SAFARI":
            case "safari":
            case "SaFaRi":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                System.out.println("Welcome!");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                System.out.println("This is home page!");
                break;
            default:
                System.out.println( browser + " is not a valid browser type.");

        }


    }

}
