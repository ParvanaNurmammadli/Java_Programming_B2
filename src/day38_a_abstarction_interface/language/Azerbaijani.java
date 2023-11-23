package day38_a_abstarction_interface.language;

public class Azerbaijani  implements Language {



        @Override
        public void hi() {
            System.out.println("Salam");
        }

        @Override
        public void bye() {
            System.out.println("Gule gule");
        }
    }

