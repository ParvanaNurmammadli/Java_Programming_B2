package day33_a_static;

public class Food {

        // Instance variables / fields - > name, quantity, unitPrice, totalPrice
        String name;
        int quantity;
        double unitPrice;
        double totalPrice;


        //constructors - ($name), ($name, $quantity), ($name, $quantity, $unitPrice)
        public Food (String name){
            this.name = name;
            calculatePrice();
        }

        public Food(String name, int quantity) {
            //this.name = name;
            this(name);
            this.quantity = quantity;
            calculatePrice();

        }

        public Food(String name, int quantity, double unitPrice) {
            //this.name = name;
            //this.quantity = quantity;
            this(name, quantity);
            this.unitPrice = unitPrice;
            calculatePrice();

        }

        // method - > calculatePrice ();
        public void calculatePrice () {
            totalPrice = unitPrice * quantity;
        }


        public String toString(){
            return "Info about the Fruit: " +
                    "\n\tName: " + name +
                    "\n\tQuantity: " + quantity +
                    "\n\tUnit Price: $" + unitPrice +
                    "\n\tTotal Price: $" + totalPrice;
        }
    }





