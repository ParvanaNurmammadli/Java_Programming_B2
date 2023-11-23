package day22_array;



    import java.util.Arrays;

    public class CharArray {
        public static void main(String[] args) {
            char [] arr = { 'j', 'a', 'v', 'a'};

            for ( char eachChar: arr) {
                System.out.println(eachChar);
            }


            String word = "java";

            // Declare a new char array which will have the size of: ? - > word.length()
            char []  newArr = new char[word.length()];

            // loop through the String word and get each character
            // newArr [i] = word.charAt(i)
            for (int i = 0; i < word.length(); i++) {
                newArr [i] = word.charAt(i);
            }

            // The below method from String class -- > .toCharArray(); ---> is doing the same this above LINE between 14 - 21
            // We converted a String  into char Array
            char [] charArr = word.toCharArray(); // ['j', 'a', 'v', 'a']
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(charArr));

            for ( char everyElement : charArr) {
                System.out.println(everyElement);
            }


            System.out.println(charArr[0]); // j



            // How can we converts a char array into A String
            char [] day = {'w', 'e', 'd', 'n', 'e', 's', 'd', 'a', 'y'};
            String str1 = Arrays.toString(day); // [w, e, d, n, e, s, d, a, y]
            System.out.println(str1);

            // for "wednesday" -- > I can loop through char [] day and concatenate it into a new String
            String allTogether1 = "";
            for ( char eachElem : day ) {
                allTogether1 += "" + eachElem;
            }
            System.out.println(allTogether1);


            /**
             * The .toString() method is coming from Object class which we will talk later.
             */
            // String str2 = day.toString();
            //System.out.println(str2);


            // This is the SIMPLE way to convert the char array into the String
            String str3 = new String(day);
            System.out.println(str3);
            System.out.println(str3.toUpperCase());
            System.out.println(str3.substring(0, 3).toUpperCase());  //
            System.out.println(("" + str3.charAt(0)).toUpperCase() + str3.substring(1,3));
            System.out.println(str3.substring(0, 1).toUpperCase() + str3.substring(1,3));

        }
    }

