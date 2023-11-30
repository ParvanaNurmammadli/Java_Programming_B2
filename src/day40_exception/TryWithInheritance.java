package day40_exception;

public class TryWithInheritance {
    /**
     * Parent class cannot be before the child class
     */

        public static void main(String[] args) {

            try {


            } catch (IndexOutOfBoundsException e) {

            } catch (RuntimeException e) {

            } catch (Exception e) {

            }


            // Possible reference for IndexOutOfBoundsException object

            IndexOutOfBoundsException e = new IndexOutOfBoundsException();
            RuntimeException e2 = new IndexOutOfBoundsException();
            Exception e3 = new IndexOutOfBoundsException();


        }
}
