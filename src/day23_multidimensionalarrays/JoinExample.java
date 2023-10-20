package day23_multidimensionalarrays;



    /*
    Arrays.toString(arrName);
    Arrays.equals(arr1, arr2);
    Arrays.sort(arrName);

    String str = "java";
        str.toCharArray();
        str.split("str");

    String str = new String(arrName);
 */

    import java.util.Arrays;

    /*
        Arrays.toString(arrName);
        Arrays.equals(arr1, arr2);
        Arrays.sort(arrName);

        String str = "java";
            str.toCharArray();
            str.split("str");
        String.join("", arrName)

        String str = new String(charArrName);
     */
    public class JoinExample {
        public static void main(String[] args) {

            String [] words = {"a", "b", "c", "d"};
            System.out.println(Arrays.toString(words));

            // Ouput: a-b-c
            String result = "";
            for (String eachWord: words) {

                result += eachWord + "-";
                //System.out.print(eachWord + "-");
            }
            System.out.println(result);




            String result2 = "";
            for (int i = 0; i < words.length; i++) {

                result2 += words[i];

                if (i == words.length-1) {
                    break;
                }

                result2 += "-";
            }
            System.out.println(result2);


            System.out.println("---------------------------");
            // with .join() method
            System.out.println(      String.join("-", words));
            System.out.println(String.join("<>", words));
            System.out.println(String.join("*", words));
            System.out.println(String.join("--------", words));
            System.out.println(String.join(" ", words));
            System.out.println(String.join("", words));

            // You can assign it into a String
            String str2 = String.join("*", words);


            char [] arr = {'a', 'b', 'c', 'd'};
            String str = new String(arr);
            System.out.println(str);



            // The following takes anything after FIRST  comma as ONE array
            System.out.println( String.join("-", words[0], words[2])); // [a, c]



        }
    }


