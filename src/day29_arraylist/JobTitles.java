package day29_arraylist;




    import java.util.ArrayList;
     import java.util.Arrays;
    /*
        .add(parameter)
        .add(index, parameter)
        .get(index)
        .remove(index) - > if finds returns Element / And removes the given index if exist
        .remove(parameter) > if finds returns TRUE/FALSE and removes first match if multiple exists
        .size()
        .contains (parameter) - > if the given parameter exists in the Arraylist, it returns true. If not, it returns false
        .isEmpty () - > checks if the ArrayList has elements or not. If it does, it returns FALSE otherwise, it returns TRUE
        .clear() - > It will remove all the elements from the Arraylist and make it empty
        .set ( index, parameter )  - > It will fins the given index and UPDATE the value on that index. If idex is not in the range, it will throw IndexOutOfBoundsException
        .indexOf(parameter) - > It will return the FIRST MATCHED ELEMENTS index. If nothing matched, -1 will be returned
        .lastIndexOf(parameter) - > It will return the FIRST MATCHED ELEMENTS index from the END. If nothing matched, -1 will be returned
        Arrays.asList( arr ) - > this will help to either convert the array into arraylist. Or, declare ArrayList with values directly.
        .addAll (Collection) - > Collection - > Arrays.asList(arg) - > All will be added to the end of the list
        .addAll (index, Collection ) - >Collection - > Arrays.asList(arg) - > All will be added starting from the given INDEX
        .removeAll (Collection) - > Collection - > Arrays.asList(arg) - > All will be removed from the list
        .retainAll (Collection) - > Collection - > Arrays.asList(arg) - > All the matching ones will be kept from the list and rest will be removed
        .containsAll (Collection) - > Collection - > Arrays.asList(arg) - >If ALL the Collection exist in the list - return TRUE if not return FALSE

     */
    public class JobTitles {
        public static void main(String[] args) {

            ArrayList <String> allJobs = new ArrayList<>();
            allJobs.addAll(Arrays.asList("SDET", "DEV", "PO", "CEO", "DEVOP", "QA", "QE", "BA", "SM", "PM", "SH", "Team Lead", "Client", "Domain Expert", "SME"));

            System.out.println("Original Job Titles: " + allJobs);

            ArrayList <String> jobs1 = new ArrayList<>(allJobs);
            jobs1.removeAll( Arrays.asList( "SM", "BA", "Client") );
            System.out.println("After removeAll - 1 " + jobs1);


            System.out.println("----------------------------");
            ArrayList <String> jobs2 = new ArrayList<>(allJobs);
            System.out.println(jobs2);
            jobs2.retainAll( Arrays.asList( "SDET", "QA", "DEV") );
            System.out.println(jobs2);



            System.out.println("----------------------------");
            ArrayList <String> jobs3 = new ArrayList<>(allJobs);
            System.out.println(jobs3);
            System.out.println(jobs3.containsAll(Arrays.asList("SDET", "PM", "SME")));
            System.out.println(jobs3.containsAll(Arrays.asList("Doctor", "PM", "SME")));


        }
    }

