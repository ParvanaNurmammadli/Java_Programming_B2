package day28_arraylist;



    import java.util.ArrayList;
    /*
        .add(parameter)
        .add(index, parameter)
        .get(index)
        .remove(index) - > if finds returns Element and removes first match if multiple exists
        .remove(parameter) > if finds returns TRUE/FALSE and removes first match if multiple exists
        .size()
     */
    public class AddAndRemove {
        public static void main(String[] args) {
            ArrayList <String> list = new ArrayList<>();
            System.out.println(list.size());

            list.add("computer");
            list.add("screen");
            list.add("mouse");
            list.add("keyboard");
            list.add("desk");

            System.out.println(list);
            String str = list.remove(0); // remove(index); remove it in given index and returns the REMOVED element (object)
            System.out.println(str);
            System.out.println(list);

            boolean b1 = list.remove("mouse"); // remove(Object); removes it at first MATCH. If there is match it returns TRUE, if not, it returns FALLSE
            System.out.println(b1);
            System.out.println(list); //[screen, keyboard, desk]

        }
    }

