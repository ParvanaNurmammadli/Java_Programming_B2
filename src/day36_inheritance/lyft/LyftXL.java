package day36_inheritance.lyft;

public class LyftXL extends Lyft{
    public LyftXL (String driver) {
        super(driver);
    }



    // it will %20 more what Lyft calculates
    @Override
    public double calculateRate(int miles){
        //return miles * 1.75 * 1.2;
        return super.calculateRate(miles) * 1.2;
    }



}

