package day28_arraylist;

public class HtmlGenerator {

    /*
        input: div^3
        output: <div></div> <div></div> <div></div>
     */
    public static void main(String[] args) {
        System.out.println(htmlGenerator("div^3"));  // I am calling htmlGenerator method and passing a single String argument.
        System.out.println(htmlGenerator("script^6"));
    }

    //div^3
    public static String htmlGenerator (String str) {  // This method accepts one parameter which is String

        String result = "";
        String [] parts = str.split("\\^");  // this is used for reg ex - > so, we need use forward slash.
        // ["div", "3"]
        //    0     1
        int num = Integer.parseInt(parts[1]);  // 3
        for (int i = 0; i < num; i++) {
            result += "<" + parts[0] + "></" + parts[0] + ">";
        }
        return result;
    }
}

