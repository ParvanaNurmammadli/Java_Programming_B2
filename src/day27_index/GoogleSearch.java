package day27_index;

public class GoogleSearch {


    public static void main(String[] args) {


        String result = "About 4,110,000,000 results (0.41 seconds)";
        String[] resArr = result.split(" "); // ["About",  "4,110,000,000",  "results",  "(0.41",  "seconds)"] - 5

        String numStr = resArr[1].replace(",", "");
        String timeStr = resArr[3].substring(1);

        System.out.println(numStr);
        System.out.println(timeStr);

        long resultNum = Long.parseLong(numStr);
        double resultTime = Double.parseDouble(timeStr);

        if (resultNum > 0 ) {
            System.out.println("Test PASSED");
        }

        if (resultTime >= 0 && resultTime <= 1) {
            System.out.println("Test PASSED");
        }

    }

}

