package day41_collection.recapt_try_catch;



    import java.util.ArrayList;

    public class RecapTryCatch { //IndexOutOfBoundsException | NullPointerException
        public static void main(String[] args)  {
            ArrayList <String> list = new ArrayList<>();
            list.add("hello");      // 0
            list.add("bye");        // 1


            /**
             * For MAC: command + option + T
             * For Win: control + alt + T
             */
            try {

                System.out.println(list.get(2)); // input.nextInt()v -- > IndexOutOfBoundsException

                String s = null;
                s = s.toLowerCase();

            } catch (IndexOutOfBoundsException e) {

                System.out.println(e.getMessage());
                //e.printStackTrace();
                System.out.println("Index out of bound exception");

            } catch (NullPointerException e) {

                System.out.println(e.getMessage());
                //e.printStackTrace();
                System.out.println("No Object");
            }

            System.out.println(list);

            //---------------------------------------------------------------------
            System.out.println();

            System.out.println("START");

            try {
                Thread.sleep(-2000); //IllegalArgumentException
            } catch (InterruptedException   e) {
                System.out.println("Here we are handling compile time exception");
            }  catch  ( IllegalArgumentException  e) {
                System.out.println("Here we are handling compile time exception");
            }

            System.out.println("DONE");

            //---------------------------------------------------------------------

            // The code below is similar to the one above
            // The difference is we handled it with one catch block using parent class which is the same for both: InterruptedException and  IllegalArgumentException
            System.out.println();

            System.out.println("START");

            try {
                Thread.sleep(2000); //IllegalArgumentException
            } catch (Exception  e) {
                System.out.println("Here we are handling compile time exception");
            }

            System.out.println("DONE");




            //---------------------------------------------------------------------
            // The code below is also similar to the one above
            // The difference is we handled it with one catch block using ONLY two exception class with OR operator
            System.out.println();

            System.out.println("START");

            try {
                Thread.sleep(-2000); //IllegalArgumentException
            } catch (InterruptedException | IllegalArgumentException  e) {
                System.out.println("Here we are handling compile time exception");
            }

            System.out.println("DONE");












        }



    }


