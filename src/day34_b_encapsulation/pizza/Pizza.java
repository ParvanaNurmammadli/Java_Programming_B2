package day34_b_encapsulation.pizza;

public class Pizza {/*
    create a class called Pizza

    - data:

        size (String), number of toppings

    - constructor

        - create a constructor that creates a Pizza object with the size and the numberOfToppings

            call setters here

    - encapsulate the Pizza class

        - setter condition:
            size can only be:
                small, medium, or large

            number of toppings must be a positive number

    - other methods methods:

        - calculatePrice()
                calculate the price of the pizza based on:

                    small base: $4
                    medium base: $6
                    large base: $8

                    each topping adds $0.75 to the price

                    calculate the total price and return the cost

        - toString()
            print the size, number of toppings, and cost of the pizza
 */

        private String size;
        private int numberOfToppings;


        public Pizza (String size, int numberOfToppings) {
            setSize(size);
            setNumberOfToppings(numberOfToppings);
        }


        // SETTERS
        public void setSize(String size) {
            if (size.equalsIgnoreCase("large") ||
                    size.equalsIgnoreCase("medium") ||
                    size.equalsIgnoreCase("small")) {
                this.size = size;
            } else {
                System.out.println("Error: WRONG size");
            }
        }

        public void setNumberOfToppings(int numberOfToppings) {
            if (numberOfToppings >= 0) {
                this.numberOfToppings = numberOfToppings;
            } else {
                System.out.println("Error: WRONG number of toppings" );
            }
        }

        //GETTERS
        public String getSize() {
            return size;
        }

        public int getNumberOfToppings() {
            return numberOfToppings;
        }


        public double calculatePrice () {

            double totalPrice;

            if (size.equalsIgnoreCase("small")) {
                totalPrice = 4 + (numberOfToppings * 0.75);
            } else if (size.equalsIgnoreCase("medium")  ) {
                totalPrice = 6 + (numberOfToppings * 0.75);
            } else if (size.equalsIgnoreCase("large")  ) {
                totalPrice = 8 + (numberOfToppings * 0.75);
            } else {
                totalPrice = -1;
            }

            return totalPrice;

        }

        @Override
        public String toString() {
            return "Pizza Info" +
                    "\n\tSize: " + size +
                    "\n\tNumber Of Toppings: " + numberOfToppings +
                    "\n\tTotal Price: $" + calculatePrice();
        }
    }


