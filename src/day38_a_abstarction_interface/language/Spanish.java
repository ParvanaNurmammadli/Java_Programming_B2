package day38_a_abstarction_interface.language;

public class Spanish implements Language{


    @Override
    public void hi () {
        System.out.println("Hola");
    }

    @Override
    public void bye () {
        System.out.println("Adios");
    }

}

