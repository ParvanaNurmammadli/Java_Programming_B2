package day32_custom_classes;


    import java.util.ArrayList;
import java.util.Arrays;

    public class MyOffers {
        public static void main(String[] args) {
            Offer o1 = new Offer( "Apple", "California", 100_000, true, 21);
            OfferV2 o2 = new OfferV2("Samsung", "Seoul", 120_000, true, 28);


            System.out.println(o1);
            System.out.println();
            System.out.println(o2);

            System.out.println("---------------------------------------------");

            String str = new String("HelloWorld");

            ArrayList <String> list2 = new ArrayList<>();
            list2.add( new String("Hello") );
            list2.add( new String ("Bye") );
            list2.add( new String ("Loopcamp") );
            list2.add(str);
            System.out.println(list2);


            System.out.println();
            ArrayList <OfferV2> offers = new ArrayList<>();
            offers.add(o2);
            //offers.add(o1);
            OfferV2 o3 = new OfferV2("Amazon", "Seattle", 200_000, false, 30);
            offers.add(o3);
            System.out.println(offers);

            System.out.println("-------");
            for ( OfferV2 each: offers) {
                System.out.println(each);
                System.out.println();
            }

            System.out.println("---------------------");
            String [] strArr = new String[4];
            strArr[0] = new String("Loopcamp");
            System.out.println(Arrays.toString(strArr));

            System.out.println("**********************");
            OfferV2 [] strArr2 = new OfferV2[3];
            strArr2[0] = o3;
            System.out.println(Arrays.toString(strArr2));


        }

    }

