package day45_stream.functions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {

        //  <T, R> --- >  accepts only ONE object: T  and returns only ONE object: R

        // int [] -- > data structure
        // List <Integer> -- > data structure (Collection)
        Function < int [], List<Integer> > convertArrayToList = numbers -> {
            List <Integer> list = new ArrayList<>();
            for ( int each : numbers){
                list.add(each);
            }
            return list;
        };


        int [] a = {2, 3, 5, 67, 8, 34};
        System.out.println(Arrays.toString(a));
        List <Integer> list = convertArrayToList.apply(a);
        System.out.println(list);
        System.out.println(convertArrayToList.apply(a));





    }
}
