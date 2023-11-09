package day31_custom_classes;




    import javax.xml.crypto.dsig.keyinfo.PGPData;

    public class UsePhone {
        public static void main(String[] args) {

            Phone phone1 = new Phone("IPhone X");
            System.out.println(phone1);


            //Phone phone2 = new Phone(); // Since we have defined pther constructors, we can notnot call this unless it is also defined.



            Phone phone2 = new Phone("Iphone 14", "Apple");
            System.out.println(phone2);


            Phone phone3 = new Phone( "IPhone 12" , "Apple", 512, 20.0);
            System.out.println(phone3);



        }
    }

