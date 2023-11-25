package day36_inheritance.app;

public class AppStore {
    //It is a RUNNER class meaning I am running my code from this class
    public static void main(String[] args) {

        Instagram objIns = new Instagram(4.0);
        objIns.download();
        objIns.follow();


        System.out.println();
        Youtube objYou = new Youtube( 3.4);
        objYou.download();
        objYou.subscribe();

    }



}

