package day15_string;
/*
    .charAt(index);
    .indexOf("")
    .indexOf('')
    .indexOf('', startIndex)
    .lastIndexOf("")
    .lastIndexOf('')
    .lastIndexOf('', startIndex)
    .substring(startIndex);
    .substring(startIndex, endIndex);

 */
public class IndexOfMethod2 {
    public static void main(String[] args) {
        String str = "definition";
        //            0123456789
        System.out.println("First i index: " + str.indexOf("i"));
        System.out.println("First i index: " + str.indexOf('i'));
        System.out.println("Last i index: " + str.lastIndexOf("i"));
        System.out.println("Last i index: " + str.lastIndexOf('i'));  // you cna do it with the character as well


        // how you can find the 2nd i
        System.out.println("Second i index: " + str.indexOf('i', 4));
        System.out.println("Second i index: " + str.indexOf('i', str.indexOf('i')+1));


    }

}