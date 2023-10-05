package day08_scanner_logical_operators;

public class ShortCircute {
    public class ShortCircuit {
        public static void main(String[] args) {
        /*
               &&
               ------------------------
               True && True --- > True
               True && False -- > False
               False && True -- > False   --- >  if the first part is False, 2nd part I do not care
               False && False - > False   --- >  if the first part is False, 2nd part I do not care

               int a = 10;
               System.out.println (false && (a++ > 11));
               System.out.println (false & (a++ > 11));




               ||
               ------------------------
               False || False --- > False
               False || True -- > True
               True || False -- > True --- >  if the first part is True, 2nd part I do not care
               True || True - > True   --- >  if the first part is True, 2nd part I do not care



               ****NOTE
               IF we want still execute the 2nd EXPRESSION (2nd side), instead of &&, || --- >  we can use &, |
         */


            System.out.println(true || 5/0 == 0);
            //System.out.println(true | 5/0 == 0);

            System.out.println(false && 5/0 ==0);
            System.out.println(false & 5/0 ==0);





        }
    }
}
