package day34_b_encapsulation.traffic;

public class TrafficLight { private String color;

    public TrafficLight (String color) {
        this.color = color;
    }

    // READ ONLY / view only
    public String getColor () {
        return color;
    }


    public void setColor (String color) {

//        switch (color) {
//            case  "red":
//            case "yellow" :
//            case "green" :
//                    this.color = color;
//        }


        if (color.equals("red") || color.equals("yellow") || color.equals("green")){
            this.color = color;
        } else {
            System.out.println("It is not valid color for traffic light");
        }

    }


}

