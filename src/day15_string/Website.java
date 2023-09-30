package day15_string;

import java.util.Scanner;

/*    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
     */
public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.next(); // www.google.com
        //                            012345678910..."

        String result = "" + url.charAt(4) + url.charAt(5) + url.charAt(6) + url.charAt(7) + url.charAt(8) + url.charAt(9);
        System.out.println(result);


        // .substring(startIndex);  --- >  startIndex is included
        // .substring(startIndex, endIndex);  --- >  endIndex is not included (up to that endIndex )

        int startPoint = url.indexOf(".") + 1;
        System.out.println(startPoint);
        System.out.println(url.substring(startPoint));

        int endPoint = url.length()-4;
        System.out.println(url.substring(startPoint, endPoint));


    }

}